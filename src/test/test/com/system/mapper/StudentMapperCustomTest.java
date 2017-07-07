package com.system.mapper;

import com.system.po.PagingVO;
import com.system.po.Student;
import com.system.po.StudentCustom;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jacey on 2017/6/28.
 */
public class StudentMapperCustomTest {


    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
    }

    @Test
    public void findByPaging() throws Exception {
        StudentMapperCustom studentMapperCustom = (StudentMapperCustom) applicationContext.getBean("studentMapperCustom");
        StudentMapper studentMapper = (StudentMapper) applicationContext.getBean("studentMapper");

        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(1);
        List<StudentCustom> list =  studentMapperCustom.findByPaging(pagingVO);
//        Student student = studentMapper.selectByPrimaryKey(10001);
        System.out.println();

    }

    @Test
    public void findStudentAndSelectCourseListByName() throws Exception {
        StudentMapperCustom studentMapperCustom = (StudentMapperCustom) applicationContext.getBean("studentMapperCustom");
        StudentCustom studentCustom = studentMapperCustom.findStudentAndSelectCourseListById(10001);
        System.out.println();
    }

}