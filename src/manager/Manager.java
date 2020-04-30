package manager;
import employee.Employee;

import java.util.Scanner;

public class Manager extends Employee {
private double bonus;

public Manager(int id, String name, String surname, double salary, double bonus)
{
   super (id, name, surname, salary);
this.bonus=bonus;
}
public Manager(int id, String name, String surname, double salary, Manager manager) {
   super(id, name, surname, salary, manager);
    }
    public Manager(int id, String name, String surname, double salary) {
        super(id, name, surname, salary );
    }

public void setBonus(double b)
{

    System.out.println("Яка премія буде у цього робітника? ");
    b = scan.nextInt();
    bonus = b;
    System.out.println("Премія = " + salary);

}
public double getSalary()
{
    return  salary + bonus;
}

    @Override
    public String toString()
    {
        double temp = salary + bonus;
        return "ID: " + id + " Ім'я: " + name + " прізвище: "
                + surname + " Дохід: " + temp + " Менеджер: " + getManagerName();
    }

    Scanner scan = new Scanner(System.in);
}
