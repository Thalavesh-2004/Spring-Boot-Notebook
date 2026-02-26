package com.gfg;

import com.gfg.Mathematical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTableWithMaven {



        public static void main(String[] args) throws SQLException {
            //jdbc connection to database
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl","root","root123");
            Statement statement=connection.createStatement();
            statement.execute("CREATE TABLE WITHMAVENEXAMPLE (ID INT PRIMARY KEY,NAME VARCHAR(20))");
            System.out.println("Table creaTED SUCCESSFULLY");

            //function from dependency added as jar
            System.out.println("The sum of 3 and 4 is: "+ Mathematical.add(3,4));

        }




    }


