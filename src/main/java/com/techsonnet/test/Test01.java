package com.techsonnet.test;

import com.techsonnet.mapper.AdminMapper;
import com.techsonnet.pojo.Admin;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test01 {
    public static void main(String[] args) {
        // 加载配置文件
        InputStream inputStream = Test01.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
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
}
