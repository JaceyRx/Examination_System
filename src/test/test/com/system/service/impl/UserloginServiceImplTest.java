package com.system.service.impl;

import com.system.po.Userlogin;
import com.system.service.TeacherService;
import com.system.service.UserloginService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Jacey on 2017/6/30.
 */
public class UserloginServiceImplTest {

    private ApplicationContext applicationContext;
    UserloginService userloginService;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml",
                "spring/applicationContext-service.xml"});
        userloginService = (UserloginService) applicationContext.getBean("userloginServiceImpl");
    }

    @Test
    public void findByName() throws Exception {
        Userlogin u = userloginService.findByName("123");
        System.out.println();
    }

}