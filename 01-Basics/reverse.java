import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner os= new Scanner(System.in);
        System.out.println("enter a number");
        int number=os.nextInt();
        int digit=0;
        int reverse=0;
        for(;number!=0;){
            digit=number%10;
            number=number/10;
            reverse=reverse*10+digit;

        }
        System.out.println(reverse);


    }
    
    
}
