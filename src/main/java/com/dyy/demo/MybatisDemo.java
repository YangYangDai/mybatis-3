package com.dyy.demo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dyy.entity.User;
import com.dyy.mapper.UserMapper;

public class MybatisDemo {
	
	public static void main(String[] args) throws IOException {
		
		InputStream inputStream = Resources.getResourceAsStream("configure-mybatis.xml");
		//读取配置文件 生成SqlSessionFactory
		//默认获取DefaultSqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//获取session 所有数据库操作都由session提供
		//得到默认的DefaultSqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.getUserById();
		//sqlSession.selectOne(statement);
		
	}
	
}
