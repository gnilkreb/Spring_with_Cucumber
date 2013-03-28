package com.example.controller;

import com.example.model.Person;
import com.example.model.Toy;
import com.example.service.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/toys")
public class ToysController{

    @Autowired
    private ToyService toyService;

    @RequestMapping(value = "/{personId}", method=RequestMethod.GET)
    public String listToys(@PathVariable("personId") Integer personId, Map<String, Object> map) {
        System.out.println("Toy list for id = " + personId);

        //loading a person to get it's toys
        Person person = toyService.listToysForPersons(personId);

        map.put("person", person);
        map.put("toyList", person.getToys());
        map.put("toy", new Toy(person.getId()));

        return "toys";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addToy(@ModelAttribute("toy") Toy toy, BindingResult result) {
        System.out.println("Got a toy: " + toy);
        try {
            toy = toyService.addToy(toy);
        }catch (Throwable e) {
            Map<String, String> data = new HashMap<String, String>();
            data.put("message", e.getLocalizedMessage());
            return new ModelAndView("error", data);
        }

        return new ModelAndView("redirect:/app/toys/" + toy.getPerson().getId());
    }

    @RequestMapping("/delete/{toyId}")
    public String deleteToy(@PathVariable("toyId") Integer toyId) {
        Toy toy = toyService.removeToy(toyId);

        return "redirect:/app/toys/" + toy.getPerson().getId();
    }
}
