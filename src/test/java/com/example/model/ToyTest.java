/**
 * 
 */
package com.example.model;

import static org.junit.Assert.*;


import java.util.HashMap;
import java.util.Map;
import static java.lang.System.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;


import org.springframework.web.servlet.ModelAndView;
import com.example.controller.*;
import com.example.model.*;
import com.example.service.*;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author kay
 *
 */
public class ToyTest {
	private Toy toy;
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
		toy = new Toy();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		toy = null;
	}

	/**
	 * Test method for {@link com.example.model.Toy#getId()}.
	 */
	@Ignore("testGetID not implemented yet")
	@Test
	public final void testGetId() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.example.model.Toy#setId(java.lang.Integer)}.
	 */
	@Ignore("testSetID not implemented yet")
	@Test
	public final void testSetId() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.example.model.Toy#getToyName()}.
	 */
	//@Ignore("testSetAndGetToyName not implemented yet")
	@Test
	public final void testSetAndGetToyName() {
		String testName = "favorite toy"; 
		assertNull(toy.getToyName());
		toy.setToyName(testName);
		assertEquals(testName,toy.getToyName());	
	}

	
}
