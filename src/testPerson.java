import java.util.Scanner;

public class testPerson {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Input person data==========");
        PersonManagement pm = new PersonManagement();

        Person p1 = pm.inputPersonInfo(sc);
        System.out.println(p1.toString());
    }
}
