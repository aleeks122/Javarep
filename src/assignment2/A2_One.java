
package assignment2;

public class A2_One {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        while (num < 10000) 
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
            if (isPrime) 
            {
                System.out.println(num);
                count++;
            }
            num++;
        }
        System.out.println("There are " +count +" prime numbers from 1 to 10,000");
       
        
    }
}
