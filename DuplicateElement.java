package duplicateelement;

public class DuplicateElement {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 7, 6, 8};
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i + 1; j < arr.length-1; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println("duplicate element is:" + arr[j]);
                }
            }
        }
    }
}






