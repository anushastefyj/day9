import java.util.Scanner;

public class reversingstring {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i ++) 
        result= input.charAt(i)+result;
        System.out.println("Result: " + result);
    }
}
 