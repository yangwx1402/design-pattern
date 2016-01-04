package com.young.java.design.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2016/1/4.
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 */
public class ConnectionPool {

    private List<Connection> pool;
    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;

    private ConnectionPool(){
        pool = new ArrayList<Connection>();
        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                Connection conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection(){
        Connection con = null;
        if(pool!=null&&pool.size()>0){
           con = pool.remove(0);
        }
        return con;
    }

    public void close(Connection con){
        if(con!=null){
           pool.add(con);
        }
    }
}
