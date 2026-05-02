public class ex10 {
    static class Employee {
        String name;
        int yearOfJoining;
        String address;

        Employee(String name, int yearOfJoining, String address) {
            this.name = name;
            this.yearOfJoining = yearOfJoining;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreat");

        System.out.printf("%-10s %-18s %s%n", "Name", "Year of joining", "Address");
        System.out.printf("%-10s %-18d %s%n", employee1.name, employee1.yearOfJoining, employee1.address);
        System.out.printf("%-10s %-18d %s%n", employee2.name, employee2.yearOfJoining, employee2.address);
        System.out.printf("%-10s %-18d %s%n", employee3.name, employee3.yearOfJoining, employee3.address);
    }
}
