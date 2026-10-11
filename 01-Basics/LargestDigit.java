import java.util.Scanner;
public class LargestDigit{
    public static void main(String[] args){
        Scanner os=new Scanner(System.in);
        System.out.println("enter a number ");
        long number=os.nextLong();
        int digit=0;
        int largest=0;
        while(number>0){
            digit=number%10;
            number=number/10;
            if(digit>largest){
                largest=digit;
            }
        }
        System.out.println("the largest digit is "+largest);
    }
    
}
