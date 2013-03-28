package com.example.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test that would be the very basic for all others.
 * It's point is to initiate application context, so
 * autowiring and other stuff will be available for them.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"} )
@ActiveProfiles("local")
public abstract class BaseTest {
}
