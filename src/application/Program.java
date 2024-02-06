package application;

import model.db.DB;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

//        Connection conn = DB.getConnection();
//        DB.closeConnection();

        Department obj = new Department(1,"Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 2000.0, obj);
        System.out.println(seller);
    }
}
