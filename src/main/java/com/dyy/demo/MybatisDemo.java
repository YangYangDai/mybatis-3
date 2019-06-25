package com.dyy.demo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisDemo {
	
	public static void main(String[] args) throws IOException {
		
		InputStream inputStream = Resources.getResourceAsStream("configure-mybatis.xml");
		//读取配置文件 生成SqlSessionFactory
		//默认获取DefaultSqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	
}
