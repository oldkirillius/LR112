package employee;
import java.util.Scanner;
import manager.Manager;
public class Employee {
    protected int id;               // Я ВИКОРИСТОВУЮ protected через те, що при наслідуванні private обмежує зону видимості
    protected String name;
    protected String surname;
    protected double salary=1000;
    protected Manager manager;

    public Employee()
    {

    }

    public Employee(int id, String name, String surname, double salary, Manager manager)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary = salary;
        this.manager = manager;
    }
    public Employee(int id, String name, String surname, double salary)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary = salary;

    }
    public void raiseSalary(double p){
        System.out.println("На % скільки потрібно підвищити зарплату? ");
        p = scan.nextInt();
        salary = p*salary/100;
        System.out.println("New salary = " + salary);

    }

    public void setID()
    {
        System.out.println("Який ID ви хочете встановити для об'єкта? ");
        id = scan.nextInt();
    }

    public String toString()
    {
        return "ID: " + getId() + " Ім'я: " + getName() + " прізвище: "
                + getSurame() + " Зарплатня: " + getSalary() + " Менеджер: " + getManagerName();
    }
    public String getManagerName()
    {
        if (manager==null)
            return "No manager";
        else
            return  manager.name + " " + manager.surname;

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurame() {
        return surname;
    }
    public double getSalary() {
        return salary;
    }

    public Manager getManager() {
        return manager;
    }
    public Employee getTopManager(){
        if(manager == null){
            return this;
        } else {
            return getManager().getTopManager();
        }
    }

    Scanner scan = new Scanner(System.in);
}
