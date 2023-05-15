package com.techsonnet.mapper;

import com.techsonnet.pojo.Classes;
import com.techsonnet.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ClassesMapperTest {
    @Test
    public void findByIdTest(){
        // 加载配置文件
        InputStream inputStream = AdminMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        // 以下三步是固定，用于获得 SQLSession
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);
        Classes byId = classesMapper.findById(1);
        System.out.println(byId);

        // 提交事务，mybatis 必须手动提交事务
        sqlSession.commit();
        sqlSession.close();
    }

}