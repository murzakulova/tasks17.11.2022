import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        List<User> userList = new ArrayList<>();
        while (true) {
            System.out.println("1.Save User" + "\n" + "2.Delete user" + "\n" + "3.Find all user");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("name:");
                String b = scanner.nextLine();
                System.out.println("surname:");
                String c = scanner.nextLine();
                System.out.println("age:");
                int age = scanner.nextInt();
                userList.add(new User(b, c, age));
            } else if (a == 2) {
                System.out.println("Index user:");
                int n = sc.nextInt();
                userList.remove(n);
            } else if (a == 3) {
                System.out.println(userList);

            }
        }
    }
}