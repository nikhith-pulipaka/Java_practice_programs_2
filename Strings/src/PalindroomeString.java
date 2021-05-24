import java.util.*;
public class PalindroomeString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String input1 =s.nextLine();
        String reversedString1 = reverseString(input1);

        if (input1.equals(reversedString1)) {
            System.out.println(input1 + " is a palindrome");
        } else {
            System.out.println(input1 + " is not a palindrome");
        }

        String input2 = s.nextLine();
        s.close();
        String reversedString2 = reverseString(input2);

        if (input2.equals(reversedString2)) {
            System.out.println(input2 + " is a palindrome");
        } else {
            System.out.println(input2 + " is not a palindrome");
        }

    }

    private static String reverseString(String input) {

        StringBuffer buffer = new StringBuffer();
        buffer.append(input);

        return buffer.reverse().toString();
    }

}
