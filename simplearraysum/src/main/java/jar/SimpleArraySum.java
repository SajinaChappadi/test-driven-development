package jar;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SimpleArraySum 
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        
        System.out.println("Please enter the size of the array. Size of the array should be greater than 0 and less than or equal to 1000");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Please enter array elements. All the elements should be greater than 0 and less than or equal to 1000");

        for(int i=0; i<size ; i++){
            array[i] = scanner.nextInt();
        }
        
        int arraySum = SimpleArraySum.calculateArraySum(array);
        System.out.println("Sum of array elements = "+arraySum);
    }
    public static int calculateArraySum(int arr[])
    {
        int sum = 0;
            
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0 && arr[i]<=1000){
                sum = sum + arr[i];
            }
        }
        return sum;
         
    }
}
