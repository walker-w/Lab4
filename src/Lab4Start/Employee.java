package Lab4Start;

public class Employee implements Rules {
    protected String name;
    protected double salary;

    public Employee(){
        salary = 0.00;
        name = "No Name";
    }

    public Employee(String inName, double inSalary){
        salary = inSalary;
        name = inName;
    }

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        String employee_string = String.format("%-10s %-15s \n%-10s %-15.2f", "Name:", name, "Salary:", salary);
        return employee_string;
    }
}
