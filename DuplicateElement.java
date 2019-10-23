/*created by keerthana
To find the duplicate number*/
package duplicateelement;

public class DuplicateElement {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 7, 6, 8};
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i + 1; j < arr.length-1; j++)/*j=j+1 it takes the next value of i */
            {
                if (arr[i] == arr[j])/*if the value of the arr[i] is same as arr[j]value it will execute the duplicate element*/
                {
                    System.out.println("duplicate element is:" + arr[j]);
                }
            }
        }
    }
}






