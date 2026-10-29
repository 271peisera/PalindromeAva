import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        /* 
        String testString = "A man, a plan, a canal: Panama";
        boolean result = Palindrome.isPalindrome(testString);
        System.out.println("Is the string a palindrome? " + result);

        String testString2 = "racecar";
        boolean result2 = Palindrome.isPalindrome(testString2);
        System.out.println("Is the string a palindrome? " + result2);

        String testString3 = "Taco Cat";
        boolean result3 = Palindrome.isPalindrome(testString3);
        System.out.println("Is the string a palindrome? " + result3);
        */

        Scanner s = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Welcome to the Palindrome Tester!");
        while(playAgain){
            System.out.println("Select whether you would like to play PalindromeDate or PalindromeString");
            String choice = s.nextLine();
            if(choice.equalsIgnoreCase("PalindromeDate")){
                System.out.println("Welcome to the PalindromeDate!");
                System.out.println("You will enter a palindrome year and the program will tell you the next palindrome year.");
                System.out.print("Enter a palindrome year: ");
                String userInput = s.nextLine();
                System.out.println("The next palindrome year is: " + PalindromeDate.nextPalindromeYear(userInput));
            }
            else if(choice.equalsIgnoreCase("PalindromeString")){
                boolean StringPlay = true;
                while(StringPlay){
                    System.out.print("Enter a string to test if it's a palindrome: ");
                    String userInput = s.nextLine();
                    System.out.println("Is the string a palindrome? " + Palindrome.isPalindrome(userInput));
                    System.out.println("Would you like to test another string? (true/false)");
                    boolean playAgainInput = Boolean.parseBoolean(s.nextLine());
                    StringPlay = playAgainInput;
                }
                System.out.println("Would you like to select another option? (true/false)");
                boolean playAgainInput = Boolean.parseBoolean(s.nextLine());
                playAgain = playAgainInput;
            }
            else{
                System.out.println("Invalid choice. Please select either PalindromeDate or PalindromeString.");
            }

           
        }
        
    }
    
}