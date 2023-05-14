package com.techsonnet.mapper;

import com.techsonnet.pojo.Admin;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdminMapperTest {

    @Test
    public void saveTest(){
        // 加载配置文件
        InputStream inputStream = AdminMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        // 以下三步是固定，用于获得 SQLSession
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AdminMapper adminMapper = sqlSession.getMapper(AdminMapper.class);
        Admin admin01 = new Admin();
        admin01.setUsername("xiaohong");
        admin01.setPassword("123123");
        adminMapper.save(admin01);

        // 提交事务，mybatis 必须手动提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteByIdTest(){
        // 加载配置文件
        InputStream inputStream = AdminMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        // 以下三步是固定，用于获得 SQLSession
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AdminMapper adminMapper = sqlSession.getMapper(AdminMapper.class);
        adminMapper.deleteById(6);

        // 提交事务，mybatis 必须手动提交事务
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void findAllTest(){
        // 加载配置文件
        InputStream inputStream = AdminMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        // 以下三步是固定，用于获得 SQLSession
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AdminMapper adminMapper = sqlSession.getMapper(AdminMapper.class);
        List<Admin> all = adminMapper.findAll();
        System.out.println(all);

        // 提交事务，mybatis 必须手动提交事务
        sqlSession.commit();
        sqlSession.close();

    }

}