package com.example.springbootproperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PropertiesTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesTest.class);
    @Autowired
    private WorkProperties workProperties;
    @Test
    public void testWorkProperties(){
        LOGGER.info("\n\n"+workProperties.toString());
    }
}
