package com.system.service.impl;

import com.system.po.Teacher;
import com.system.po.TeacherCustom;
import com.system.service.TeacherService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jacey on 2017/6/29.
 */
public class TeacherServiceImplTest {
    private ApplicationContext applicationContext;
    TeacherService teacherService;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml",
                "spring/applicationContext-service.xml"});
        teacherService = (TeacherService) applicationContext.getBean("teacherServiceImpl");
    }

    @Test
    public void updateById() throws Exception {
        TeacherCustom teacherCustom = new TeacherCustom();
        teacherCustom.setUserid(1003);
        teacherCustom.setUsername("软老师");

        //指定时间格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
        // 指定一个日期
        Date date = dateFormat.parse("1996-09-02");
        teacherCustom.setBirthyear(date);

        teacherCustom.setCollegeid(1);
        teacherCustom.setSex("男");
        teacherCustom.setGrade(new Date());
        teacherCustom.setTitle("助教");
        teacherCustom.setDegree("硕士");

        teacherService.updateById(1003, teacherCustom);
    }

    @Test
    public void removeById() throws Exception {
        teacherService.removeById(1003);
    }

    @Test
    public void findByPaging() throws Exception {
        List<TeacherCustom> list = teacherService.findByPaging(1);
        System.out.println();
    }

    @Test
    public void save() throws Exception {
        TeacherCustom teacherCustom = new TeacherCustom();
        teacherCustom.setUserid(1003);
        teacherCustom.setUsername("软老师");

        //指定时间格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
        // 指定一个日期
        Date date = dateFormat.parse("1996-09-02");
        teacherCustom.setBirthyear(date);

        teacherCustom.setCollegeid(1);
        teacherCustom.setSex("男");
        teacherCustom.setGrade(new Date());
        teacherCustom.setTitle("助教");

        teacherService.save(teacherCustom);
    }

    @Test
    public void getCountTeacher() throws Exception {
        int i = teacherService.getCountTeacher();
        System.out.println(i);
    }

    @Test
    public void findById() throws Exception {

        TeacherCustom teacherCustom = teacherService.findById(1001);
        System.out.println();
    }

    @Test
    public void findByName() throws Exception {
        List<TeacherCustom> list = teacherService.findByName("老师");
        System.out.println();
    }

    @Test
    public void findAll() throws Exception {
        List<TeacherCustom> list = teacherService.findAll();
        System.out.println();
    }

}