import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        String testString = "A man, a plan, a canal: Panama";
        boolean result = Palindrome.isPalindrome(testString);
        System.out.println("Is the string a palindrome? " + result);

        String testString2 = "racecar";
        boolean result2 = Palindrome.isPalindrome(testString2);
        System.out.println("Is the string a palindrome? " + result2);

        String testString3 = "Taco Cat";
        boolean result3 = Palindrome.isPalindrome(testString3);
        System.out.println("Is the string a palindrome? " + result3);

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string to test if it's a palindrome: ");
        String userInput = s.nextLine();
        System.out.println("Is the string a palindrome? " + Palindrome.isPalindrome(userInput));
    }
}