package main;

import employee.Employee;
import manager.Manager;

public class Main {

    public static void main(String[] args) {

        Manager manager1 = new Manager(1, "Peter", "Jacks", 10000);
        Manager manager2 = new Manager(2, "Joe", "Peterson",1000000, manager1 );
        Employee employee1 = new Employee(11, "Bob", "Joeson", 120, manager2);
        Employee employee2 = new Employee(12, "Bill", "Joeson", 1200, manager2);
        Employee employee3 = new Employee(13, "Will", "Peterson", 124.5, manager1);
        Manager manager3 = new Manager(3, "Den", "Jacks", 1000000);
        Manager manager4 = new Manager(4, "Lee", "Denson",1000000, manager3 );
        Manager manager5 = new Manager(5, "Dee", "Leeson",104000, manager4 );
        Manager manager6 = new Manager(6, "Mik", "Deeson",1010, manager5 );
        Employee employee4 = new Employee(14, "Will", "Mikson", 124.55, manager6);
        System.out.println(employee4.toString());
        System.out.println(manager6.toString());
        System.out.println(employee1.getManagerName());
        System.out.println(employee1.getTopManager());
    }
}
