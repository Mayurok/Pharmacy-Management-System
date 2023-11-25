/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connections;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author MAYUR K
 */
public class Table {

    public static void main(String[] args) {
        try {
            Connection con = Connectionprovider.getCon();
            Statement st = con.createStatement();
           // st.executeUpdate("create table appuser( appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),DOB varchar(50),mobilenumber varchar(50),email varchar(50),username varchar(200),password varchar(50),address varchar(200))");
           // st.executeUpdate("insert into appuser (userRole,name,DOB,mobilenumber,Email,username,password,address) values('Admin','Mayur','31-10-2003','7039426646','mayurkamble3110@gmail.com','Mayur','123456','India')");
           // st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key,unique_id varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
              st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");

            JOptionPane.showMessageDialog(null, "Table created succesfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
