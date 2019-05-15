package HotelSystem;

public class Salary extends Employee {
    private double salary;

    public Salary(String employeeName, String address, long phone, String department, double salary) {
        super(employeeName, address, phone, department);
        setSalary(salary);

    }


    public void mailSalary() {

        System.out.println("Mailing check to " + getEmployeeName() + " with the salary " + salary);

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0){
            salary = newSalary;
        }
   }

    public double computeSalary() {
        System.out.println("Computing salary to " + getEmployeeName() + " is " + salary + " .");
        return salary;
    }
}