import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    int id;
    String name;
    String address;
    String email;
    double salary;
    List<Double> paymentHistoryArray = new ArrayList<>();

    public EmployeeData(int id, String name, String address, String email, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double SalaryCalculation(double bouns, double deduction) {
        return salary + bouns - deduction;
    }

    public void addPayment(double salary) {

        paymentHistoryArray.add(salary);
    }

    public void paymentHistory() {
        for (double payment : paymentHistoryArray) {
            System.out.println(payment);
        }

    }

    public String toString() {
        return " employeeID " + id + " employeeName " + name + " employeeAddress " + address + " employeeEmail " + email
                + " employeeSalary " + salary;
    }

}
