/**
 * 
 */
package com.example.service;

import com.example.model.Person;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author kay
 *
 */
public class PersonServiceImplTest extends BaseTest {

    @Autowired
    private PersonService personService;

	@Test
    public void testPersonListInitiated() {
        List<Person> list =  personService.listPeople();

        Assert.assertEquals("There should be nothing there", 1, list.size());

        Person person = list.get(0);
        Assert.assertEquals("First name", "f_name", person.getFirstName());
        Assert.assertEquals("Last name", "l_name", person.getLastName());
    }

	
}
