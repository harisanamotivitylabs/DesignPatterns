package designpatterns.creational.prototype;

import java.util.ArrayList;

public class Employees implements Cloneable{
    private ArrayList<String> empList;
    public Employees() {
        empList=new ArrayList<>();
    }

    public Employees(ArrayList<String> empList) {
        this.empList = empList;
    }

    public void loadEmployees()
    {
       empList.add("hari");
        empList.add("bhaskar");
        empList.add("sandeep");
        empList.add("satya");
    }
    public ArrayList<String> getEmpList()
    {
        return empList;
    }
    @Override
    public Object clone()
    {
       ArrayList<String> copyList=new ArrayList<>();
        for (String emp:this.getEmpList()
             ) {
            copyList.add(emp);
        }
        return new Employees(copyList);
    }
}
