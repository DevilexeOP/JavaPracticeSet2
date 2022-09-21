import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #2 || Question 2 ");

        // Q3 -> Use comparison operators to find out whether a given number is greater than the user
        // entred the number or not

        Scanner sc = new Scanner(System.in);
        try {
            float a = sc.nextFloat();
            System.out.println(a>8);

        } finally {
            sc.close();
        }

    }
}
