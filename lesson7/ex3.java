public class ex3 {
    static class Student {
        String name;
        String phoneNumber;
        String address;
        int rollNo;

        Student(String name, int rollNo, String phoneNumber, String address) {
            this.name = name;
            this.rollNo = rollNo;
            this.phoneNumber = phoneNumber;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Student sam = new Student("Sam", 1, "012345678", "Phnom Penh");
        Student john = new Student("John", 2, "098765432", "Siem Reap");

        System.out.printf("%-10s %-10s %-15s %s%n", "Name", "Roll No", "Phone", "Address");
        System.out.printf("%-10s %-10d %-15s %s%n", sam.name, sam.rollNo, sam.phoneNumber, sam.address);
        System.out.printf("%-10s %-10d %-15s %s%n", john.name, john.rollNo, john.phoneNumber, john.address);
    }
}
