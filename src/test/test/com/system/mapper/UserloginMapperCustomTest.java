package com.system.mapper;


import com.system.po.UserloginCustom;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jacey on 2017/6/28.
 */
public class UserloginMapperCustomTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @Test
    public void testFindOne() throws Exception {
        UserloginMapperCustom userloginMapperCustom = (UserloginMapperCustom) applicationContext.getBean("userloginMapperCustom");


    }

}