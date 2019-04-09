package Tema1;

public class Employee {
    private String firstNameEmp;
    private String lastNameEmp;
    private String address;
    private long phone;
    private String email;
    private String department;

    public Employee(String firstNameEmp, String lastNameEmp, String address, long phone, String email, String department){
        this.firstNameEmp = firstNameEmp;
        this.lastNameEmp = lastNameEmp;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.department = department;
    }
}
