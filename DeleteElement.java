/*created by keerthana
to delete an element in a array*/
package Delete;
    import java.util.Scanner;

    public class DeleteElement
    {
        public static void main(String args[])
        {
            int size, del, count=0;
            int arr[] = new int[50];
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Array Size : ");
            size = scan.nextInt();

            System.out.print("Enter Array Elements : ");
            for(int i=0; i<size; i++)
            {
                arr[i] = scan.nextInt();
            }

            System.out.print("Enter Element to be Delete : ");
            del = scan.nextInt();
            for(int i=0; i<size; i++)
            {
                if(arr[i] == del)/*if the element of arr[i] value is equal to delete element it will continues the loop or else it will come out of the inner loop and increment the arr[i] value /
                {
                    for(int j=i; j<(size-1); j++)
                    
                        arr[j] = arr[j+1];/*arr[j+1] value is stored in arr[j]th position*/
                    }
                    count++;/*increment the count value*/
                    break;
                }
            }
            if(count==0)
            {
                System.out.print("Element Not Found..!!");
            }
            else
            {
                System.out.print("Element Deleted Successfully");
                System.out.print("Now the New Array:");
                for(int i=0; i<(size-1); i++)
                {
                    System.out.print(arr[i]+ " ");
                }
            }
        }
    }

