package org.amazon;

public class Demo {
    public static void main(String[] args) {
       String data="test";
       String  test = "test";

        System.out.println("Added ");

       Connection connection = Connection.getInstance();
       connection.insertData();

    }
}
