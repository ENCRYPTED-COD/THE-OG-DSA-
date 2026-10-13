import java.util.Scanner;
public class SumOfDigitsMethod {
    public static int SumOfDigitsMethod(int number){
        int sum=0;
        int digit=0;
        while(number>0){
            digit=number%10;
            number=number/10;
            sum=sum+digit;
            
    

        }
        return sum;
    }
        public static void main (String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("enter a number");
            int number=sc.nextInt();
            int result=SumOfDigitsMethod(number);
            System.out.println("the sum of the digits is "+result);
        }



    

    
}
