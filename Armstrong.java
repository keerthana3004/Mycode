/*created by @keerthana
to find the given number is amstrong or not
* */
package armstrongnum;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
    int num,r,sum=0,temp;

        System.out.println("Enter a number:");/*get input from user*/
        Scanner a = new Scanner(System.in);
        num = a.nextInt();
        temp=num;/*initialize temp=num*/
        while(num > 0)
        {
            r = num % 10;
            sum = sum + r* r* r;/*find the cube of the remainder and store it in sum*/
            num = num / 10;
        }
        if (temp == sum) /*if the number is equal to sum the given number is armstrong*/
        {
            System.out.println("Armstrong");
        } else {
            System.out.println("not");
        }

    }
}






