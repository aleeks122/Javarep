
package assignment2;

public class A2_Two 
{
    public static void main(String[] args) 
    {
        for (int num = 2; num < 10000; num++) 
        {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) 
            {
                if (num % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
            switch (isPrime)
            {
                case true:
                    System.out.println(num);
                    break;
                case false:
                    break;
            }
        }
    }
}