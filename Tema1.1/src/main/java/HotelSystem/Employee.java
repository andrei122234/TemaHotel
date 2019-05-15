package HotelSystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter


public abstract class Employee {
    private String employeeName;
    private String address;
    private long phone;
    private String department;




    public double computeSalary(){
        return 0.0;
    }
    public void mailSalary(){
        System.out.println("Email the salary to" + this.employeeName + this.address);
    }
    public String toString(){
        return employeeName + " " + address + " " + phone + " " + department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public long getPhone() {
        return phone;
    }

    public String getDepartment() {
        return department;
    }
}

