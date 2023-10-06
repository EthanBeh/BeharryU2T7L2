import java.util.Scanner;
public class Yippee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = scan.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = scan.nextLine();
        if (s1.equals(s2)) {
            System.out.println("The strings are equal!");
        } else {
            System.out.println("The strings are NOT equal");
            if (s1.compareTo(s2) > 0) {
                System.out.println(s1 + " comes before " + s2 + " alphabetically");
            } else {
                System.out.println(s2 + " comes before " + s1 + " alphabetically");
            }
        }
    }
}