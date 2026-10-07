import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner os= new Scanner(System.in);
        System.out.println("enter a number");
        int number=os.nextInt();
        int origi=number;
        int digit=0;
        int reverse=0;
        for(;number!=0;){
            digit=number%10;
            number=number/10;
            reverse=reverse*10+digit;
        }
            if(reverse!=origi){
                System.out.println("its not palindrome");
            }
            else{
                System.out.println("its a palindrome number");
            }

        
        

    }
    
    
}
