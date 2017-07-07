package com.system.service.impl;

import com.system.po.PagingVO;
import com.system.po.Student;
import com.system.po.StudentCustom;
import com.system.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jacey on 2017/6/29.
 */
public class StudentServiceImplTest {


    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml",
                "spring/applicationContext-service.xml"});
    }

    @Test
    public void updataById() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");

        StudentCustom studentCustom = new StudentCustom();
        studentCustom.setUserid(10004);
        studentCustom.setUsername("小拉");
//        studentCustom.setBirthyear(new Date(1996, 9, 2));

        //指定时间格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
        // 指定一个日期
        Date date = dateFormat.parse("1990-09-06");
        studentCustom.setBirthyear(date);

        studentCustom.setCollegeid(1);
        studentCustom.setSex("男");
        studentCustom.setGrade(new Date());
        studentService.updataById(10004, studentCustom);
    }

    @Test
    public void removeById() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        studentService.removeById(10004);
    }

    @Test
    public void findByPaging() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        List<StudentCustom> list =  studentService.findByPaging(1);
        System.out.println();
    }

    @Test
    public void save() throws Exception {
        StudentCustom studentCustom = new StudentCustom();
        studentCustom.setUserid(10004);
        studentCustom.setUsername("小花");
//        studentCustom.setBirthyear(new Date(1996, 9, 2));

        //指定时间格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
        // 指定一个日期
        Date date = dateFormat.parse("1996-09-02");
        studentCustom.setBirthyear(date);

        studentCustom.setCollegeid(1);
        studentCustom.setSex("男");
        studentCustom.setGrade(new Date());

        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        studentService.save(studentCustom);
    }

    @Test
    public void getCountStudent() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        int i = studentService.getCountStudent();
        System.out.println();
    }

    @Test
    public void findById() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");

        Student student = studentService.findById(10001);
        System.out.println();
    }

    @Test
    public void findByName() throws Exception {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        List<StudentCustom> list = studentService.findByName("小");
        System.out.println();
    }

}