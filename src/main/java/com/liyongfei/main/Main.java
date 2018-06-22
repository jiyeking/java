package com.liyongfei.main;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author liyongfei
 * @date 2018/6/20
 */
public class Main {
    public static void main(String[] args){
        System.out.println("this is main method!");
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://39.106.139.27:3306/lookingsky?useUnicode=true&characterEncoding=UTF-8");

        dataSource.setUsername("lookingsky");

        dataSource.setPassword("lookingsky_123456");
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Connection conn = dataSource.getConnection();
            //2,执行数据库语句
            String sql="SELECT * FROM SYS_SERVICE";

            //3,用prepareStatement获取sql语句
            ps=conn.prepareStatement(sql);

            //4,执行sql语句,查询用executeQuery,增删改用executeUpdate
            rs=ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("ID")+" "+rs.getString("MODIFY_TIME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public int sum(int a, int b){
        return a + b;
    }

    public String say(String info){
        return info;
    }


}
