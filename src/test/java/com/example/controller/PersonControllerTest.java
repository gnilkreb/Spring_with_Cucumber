/**
 *
 */
package com.example.controller;

import com.example.model.Person;
import com.example.service.BaseTest;
import com.example.service.PersonService;
import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;

//import org.testng.annotations.*;


/**
 * @author kay
 */
//@ContextConfiguration(locations = {"classpath:spring-servlet.xml"} )
public class PersonControllerTest extends BaseTest {

    @Autowired
    private PersonController controller;
    @Autowired
    private PersonService personService;

    static Person person;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        person = new Person();
        person.setLastName("doe");
        person.setFirstName("john");
        //putting John Doe into db

        personService.addPerson(person);
        out.println(personService);
        out.println(person + "\n");
        out.println("Done adding person");

    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        personService.removePerson(person.getId());
    }

    /**
     * Test method for {@link com.example.controller.PersonController#listPeople(java.util.Map)}.
     */
    @Test
    public final void testListPeople() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("person", person);
        out.println("-------------------------");
        out.print(map.isEmpty());
        out.println("-------------------------");
        out.println(controller);
        String newPage = controller.listPeople(map);
        assertEquals("people", newPage);
    }

    /**
     * Test method for {@link com.example.controller.PersonController#addPerson(com.example.model.Person, org.springframework.validation.BindingResult)}.
     */
    @Ignore("not implemented yet")
    @Test
    public final void testAddPerson() {

    }

    /**
     * Test method for {@link com.example.controller.PersonController#deletePerson(java.lang.Integer)}.
     */
    @Ignore("not implemented yet")
    @Test
    public final void testDeletePerson() {

    }


}
