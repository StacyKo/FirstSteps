package NetIT;

import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();

        if (text1.equals(text2)) {
            System.out.println("equal strings");
        } else {
            System.out.println("not equal");
        }}

}
