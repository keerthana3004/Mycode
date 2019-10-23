/*created by keerthana
sort the array in in ascending order
 */
package sorting;
import java.util.Scanner;


public class SortingElement {
    public static void main(String[] args) {
        int n, temp;/*initialize the number and temp variable*/

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements you want to store:");
        n = s.nextInt();
        int[] arr = new int[n];/*enter the size of the array*/
        System.out.println("Enter the all the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];/*swapping the array element*/
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println("Ascending order:");
            for (int i= 0; i < n - 1; i++) {
                System.out.println(arr[i]);
            }
            System.out.print(arr[n-1]);
        }
    }












