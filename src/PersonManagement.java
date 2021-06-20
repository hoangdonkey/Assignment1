import java.util.Scanner;

public class PersonManagement {
    public Person inputPersonInfo(Scanner sc) throws Exception {
        String name;
        String address;
        double salary;
        System.out.print("Name: ");
        name = sc.nextLine();
        if (name.isEmpty()) {
            throw new Exception("You must provide a name");
        }
        System.out.print("Address: ");
        address = sc.nextLine();
        if (address.isEmpty()) {
            throw new Exception("You must provide a address");
        }
        System.out.print("Salary: ");
        try {
            String sSalary = sc.nextLine();
            if (sSalary.isEmpty()) {
                throw new Exception("You must provide a salary");
            }
            salary = Double.parseDouble(sSalary);
            if (salary <= 0) {
                throw new Exception("Salary must be greater than 0");
            }

        } catch (NumberFormatException e) {
            throw new Exception("Salary must be number");
        }
        return new Person(name, address, salary);
    }
}
