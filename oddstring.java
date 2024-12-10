import java.util.Scanner;

public class oddstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = "";
        for (int i = 1; i < input.length(); i += 2) {
            result += input.charAt(i);
        }
        System.out.println("Result: " + result);
    }
}
