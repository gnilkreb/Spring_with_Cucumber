/**
 *
 */
package com.example.service;

import com.example.exception.DisplayableException;
import com.example.model.Person;
import com.example.model.Toy;
import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kay
 */
public class ToyServiceImplTest extends BaseTest {

    @Autowired
    private ToyService toyService;

    @Autowired
    private PersonService personService;

    private List<Toy> toys;

    private static int TOY_COUNT = 2;
    private static String DOLL_NAME = "dolll";
    private static String CAR_NAME = "car";

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
	toys = new ArrayList<Toy>();
	
	//stub up a list of toys
	//	Toy toy = new Toy();
	///toy.setToyName(CAR_NAME);
	//toyService.addToy(toy);
	
        //Person person = new Person();
        //person.setFirstName("a Person");
	
	//toy = new Toy();
	//toy.setToyName(DOLL_NAME);
	//toyService.addToy(toy);
    }
    

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        List<Person> personList = personService.listPeople();

        for (Person person : personList) {
            personService.removePerson(person.getId());
        }
    }

    /**
     * Test method for {@link com.example.service.ToyServiceImpl#addToy(com.example.model.Toy)}.
     */
    @Ignore("testAddToy not implemented yet")
    @Test
    public final void testAddToy() {
        //fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link com.example.service.ToyServiceImpl#removeToy(java.lang.Integer)}.
     */
    @Ignore("testRemoveToy not implemented yet")
    @Test
    public final void testRemoveToy() {
        //fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link com.example.service.ToyServiceImpl#listToysForPersons(int)}.
     */
    //@Ignore("testListToys not implemented yet")
    @Test
    public final void testListToys() throws DisplayableException {
        Person person = new Person();
        person.setFirstName("name");
        person.setLastName("last name");

        person = personService.addPerson(person);
        person.setToys(new ArrayList<Toy>());

        Toy firstToy = new Toy();
        firstToy.setToyName("first toy");
        firstToy.setPersonId(person.getId());
        toyService.addToy(firstToy);
        person.getToys().add(firstToy);

        Toy secondToy = new Toy();
        secondToy.setToyName("second toy");
        secondToy.setPersonId(person.getId());
        toyService.addToy(secondToy);
        person.getToys().add(secondToy);


        Person personFromDB = toyService.listToysForPersons(person.getId());

        Assert.assertNotNull("Person shouldn't be null", personFromDB);
        Assert.assertTrue("Person's toys shouldn't be null", person.getToys() != null);
        Assert.assertEquals("Count of toys", person.getToys().size(), personFromDB.getToys().size());
    }

    @Test
    public final void testListToysForEmptyPerson() {
        Person person = new Person();
        person.setFirstName("name");
        person.setLastName("last name");

        person = personService.addPerson(person);
        person.setToys(new ArrayList<Toy>());

        Person personFromDB = toyService.listToysForPersons(person.getId());

        Assert.assertNotNull("Person shouldn't be null", personFromDB);
        Assert.assertTrue("Person's toys shouldn't be null", person.getToys() != null);
        Assert.assertEquals("Count of toys", person.getToys().size(), personFromDB.getToys().size());
    }

    @Test
    public void testHql() throws DisplayableException {
        Person person = new Person();
        person.setFirstName("name");
        person.setLastName("last name");

        person = personService.addPerson(person);
        person.setToys(new ArrayList<Toy>());

        Toy firstToy = new Toy();
        firstToy.setToyName("first toy");
        firstToy.setPersonId(person.getId());
        toyService.addToy(firstToy);
        person.getToys().add(firstToy);

        Toy secondToy = new Toy();
        secondToy.setToyName("second toy");
        secondToy.setPersonId(person.getId());
        toyService.addToy(secondToy);
        person.getToys().add(secondToy);


        System.out.println("Start query");
        List<Toy> personFromDB = toyService.list(person.getId());
        System.out.println("toys: " + personFromDB);

        Assert.assertNotNull("Person shouldn't be null", personFromDB);
        Assert.assertTrue("Person's toys shouldn't be null", person.getToys() != null);
        Assert.assertEquals("Count of toys", person.getToys().size(), personFromDB.size());
    }

    @Ignore
    @Test(expected = DisplayableException.class)
    public void testUniqueConstraint() throws DisplayableException {
        Person p = new Person();
        personService.addPerson(p);

        Toy toy = new Toy();
        toy.setToyName(new String("name"));
        toy.setPersonId(p.getId());
        toyService.addToy(toy);

        Toy toy2 = new Toy();
        toy2.setToyName(new String("name"));
        toy2.setPersonId(p.getId());
        toyService.addToy(toy2);
    }

    @Test
    public void testGetToysWithNoToys() {
//        toyService = new ToyServiceImpl();
//        assertEquals(0,toyService.listToys().size());
    }


}
