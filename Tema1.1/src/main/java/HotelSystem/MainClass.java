package HotelSystem;

public class MainClass {
    public static void main(String[] args) {

        Salary emplayee1 = new Salary("Adrian Doru", "Scurat, 25", 56789987, "Guest service", 3600.00);
        Employee employee2 = new Salary("George Ungureanu", "Lunga, 52", 756456123, "Laundry", 2400.00);

        emplayee1.computeSalary();

        employee2.mailSalary();


    }
}
