package com.system.service.impl;

import com.system.po.CourseCustom;
import com.system.service.CourseService;
import com.system.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Jacey on 2017/7/5.
 */
public class CourseServiceImplTest {


    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml",
                "spring/applicationContext-service.xml"});
    }

    @Test
    public void findById() throws Exception {

        CourseService courseService = (CourseService) applicationContext.getBean("courseServiceImpl");

        CourseCustom courseCustom = courseService.findById(1);

        System.out.println();
    }

    @Test
    public void findByTeacherID() throws Exception {

        CourseService courseService = (CourseService) applicationContext.getBean("courseServiceImpl");

        courseService.findByTeacherID(1001);

    }

}