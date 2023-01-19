
package assignment2;

import java.util.Scanner;
        
public class A2_Four
{
    public static void main(String[] args) 
    {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) 
        {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num == 0) 
            {
                break;
            }
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
