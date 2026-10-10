import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        System.out.println("enter a number");
        int number=os.nextInt();
         int digit =0;
         int product=1;
         for(;number>0;){
            digit=number%10;
            number=number/10;
            product=product*digit;
         }
         System.out.println(product);
    }
    
}
