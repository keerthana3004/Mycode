/* created by @keerthana
find out the given number is prime or not
 */
package Prime;
public class Prime {
    public static void main(String[] args)
    {
        /*declare the number and initialize the count=0
        * */
        int n = 4, Count = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                Count++;
            }
        }
        /* if the count is less than or equal to 2,the given number is prime otherwise not a prime*/
            if(Count<=2)
            {
                System.out.println("prime");
            }
            else
            {
                System.out.println("not a prime");
            }
        }
    }


