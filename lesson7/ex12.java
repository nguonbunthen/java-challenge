import java.util.Scanner;

public class ex12 {
    static class Employee {
        double salary;
        int hoursPerDay;

        void getInfo(double salary, int hoursPerDay) {
            this.salary = salary;
            this.hoursPerDay = hoursPerDay;
        }

        void AddSal() {
            if (salary < 500) {
                salary += 10;
            }
        }

        void AddWork() {
            if (hoursPerDay > 6) {
                salary += 5;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter working hours per day: ");
        int hoursPerDay = sc.nextInt();

        employee.getInfo(salary, hoursPerDay);
        employee.AddSal();
        employee.AddWork();

        System.out.println("Final salary: " + employee.salary);
        sc.close();
    }
}
