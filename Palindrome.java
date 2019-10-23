/*created by keerthana
to find the given string is palindrome or not*/
package stringpalindrome;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String org, rev = "";
        System.out.println("Enter a String:");
        Scanner s = new Scanner(System.in);
        org = s.nextLine();
        for (int i = org.length() - 1; i >=0; i--)
        {
            rev = rev + org.charAt(i);/*store the each character in the original string in the reverse*/
        }

            if (rev.equals(org))/*check the two string is equal or not using equals*/
            {
                System.out.println(org+" palindrome");
            } else {
                System.out.println(org +"is not palindrome");
            }


        }
    }



