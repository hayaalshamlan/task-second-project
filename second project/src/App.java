public class App {
    public static void main(String[] args) {

        EmployeeData haya = new EmployeeData(3007, "haya", "mangaf", "hh.com", 500);
        EmployeeData ahmad = new EmployeeData(3005, "ahmad", "mangaf", "aa.com", 500);
        System.out.println(haya);
        System.out.println(ahmad);

        double salary = haya.SalaryCalculation(200, 50);
        System.out.println(salary);
        // haya.addPayment(salary);

        double salary2 = ahmad.SalaryCalculation(250, 40);
        // System.out.println(salary2);
        ahmad.addPayment(salary2);

        haya.paymentHistory();
        ahmad.paymentHistory();

    }
}
