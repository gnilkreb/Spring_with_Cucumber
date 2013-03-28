package cukes;

import com.example.model.Person;
import com.example.service.PersonService;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CukeSteps {

    private char theLetter;
    private List<Person> persons;

    @Autowired
    private PersonService personService;

    @Given("^the letter '([A-Za-z])'$")
    public void gimmeALetter(final char theLetter) {
        this.theLetter = theLetter;
    }

    @Given("list of persons")
    public void getListOfPersons(){
        persons = personService.listPeople();
    }

    @Given("added some person")
    public void addAPerson(){
        Person person = new Person();
        person.setFirstName("name");

        personService.addPerson(person);
    }

    @When("^I check the letter(?:s)?$")
    public void checkThem() {
        // just a stub
    }

    @Then("^the letter should be '([A-Za-z])'$")
    public void checkTheLetter(final char aLetter) {
        assertThat(theLetter, is(aLetter));
    }

    @Then("it should be empty")
    public void checkIfEmpty() {
        assertTrue(persons != null && persons.isEmpty());
    }

    @Then("it should not be empty")
    public void checkIfNotEmpty() {
        assertTrue(persons != null && !persons.isEmpty());
    }

    @After
    public void afterScenario() {
        List<Person> personList = personService.listPeople();

        for (Person person: personList){
            personService.removePerson(person.getId());
        }
    }
}