import java.util.Scanner;
public class CountDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number =sc.nextInt();
        int count = 0;
        for(;number!=0;){
            count++;
            number=number/10;
            
        }
        System.out.println(count);

    }

    
}