package com.thoughtworks.twu.domain;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public abstract class IntegrationTest extends AbstractTransactionalJUnit4SpringContextTests {

}
