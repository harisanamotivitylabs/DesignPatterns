package designpatterns.creational.prototype;

import java.util.ArrayList;

public class ProtoTest {
    public static void main(String[] args) {
        Employees employees=new Employees();
        employees.loadEmployees();//first loading data from the database
        System.out.println( "original list "+employees.getEmpList());
        Employees clone1 = (Employees) employees.clone();
        clone1.getEmpList().add("rama");
        System.out.println( "clone1 list "+clone1.getEmpList());
        Employees clone2 = (Employees) employees.clone();
        clone2.getEmpList().remove("rama");
        System.out.println( "clone2 list "+clone2.getEmpList());
    }
}
