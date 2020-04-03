package org.apache.ibatis.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/4/3
 */
public class MyBatisMain {

    public static void main(String[] args) throws Exception {
        String resource = "mybatis-test.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();

        AccountMapper accountMapper = session.getMapper(AccountMapper.class);
        List<Account> accountList = accountMapper.queryAccountList();

        System.out.println(accountList);
    }

}
