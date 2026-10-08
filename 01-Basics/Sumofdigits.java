import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter a number");
        int number=num.nextInt();
        int digit= 0;
        int last=0;
        
        for(;number>0;){
            digit=number%10;
            number=number/10;
            last=last+digit;
        }
        System.out.println(last);




        
    }
    
}
