package com.lihoo.jnshu;

import com.lihoo.jnshu.admin.dao.StudentListMapper;
import com.lihoo.jnshu.admin.domain.StudentList;
import com.lihoo.jnshu.admin.service.IStudentListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.lihoo.jnshu.admin.dao")
public class Task7Index4ApplicationTests {

    @Test
    public void contextLoads() {
    }

//    @Qualifier("IStudentListService")
    @Autowired
    private StudentListMapper studentListMapper;

    @Autowired
    private IStudentListService studentListService;

    @Test
    public void CRUDTest() {
        StudentList stuGai = new StudentList();
        stuGai.setId(94L);
        stuGai.setLogAt(System.currentTimeMillis());
        Long man = studentListService.updateLoginTimeById(stuGai);
        System.out.println("找：" + man);
    }
}
