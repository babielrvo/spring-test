package org.rvanooyen.spring.test.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/testConfig.xml"})
public class TestServiceTest {

    @Autowired
    TestService service;


    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void shouldReturnTrue() {
        assertTrue(service.doSomething());
    }
}