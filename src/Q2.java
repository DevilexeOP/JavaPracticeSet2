public class Q2 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #2 || Question 2 ");

        // Q2 -> Write a program to encrypt the grade by adding 8 to it
        // Decrypt it to show the correct grade

        char grade = 'A';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decrypting
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
