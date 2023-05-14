package com.techsonnet.mapper;

import com.techsonnet.pojo.Admin;
import com.techsonnet.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {
    @Test
    public void findByIdTest(){
        // 加载配置文件
        InputStream inputStream = AdminMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        // 以下三步是固定，用于获得 SQLSession
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.findById(1);
        System.out.println(student);

        // 提交事务，mybatis 必须手动提交事务
        sqlSession.commit();
        sqlSession.close();
    }

}