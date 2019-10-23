/*created by keerthana
find the fibonacci number*/
package fibbonacci;
import java.util.Scanner;
public class FibonaciNum {
    public static void main(String[] args)
    {
        int num,a=0,b=0,c=1;/*initialize the value a,b,c*/
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
       num= obj.nextInt();
       for(int i=1;i<=num;i++)
       {
          a=b;/*swapping the value */
          b=c;
          c=a+b;
          System.out.println(a+"");


       }



    }
}
