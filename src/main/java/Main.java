import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first Name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last Name:");
        String lastName = scanner.nextLine();
        Email email = new Email(firstName, lastName);
        System.out.println(email.showInfo());
    }
}
