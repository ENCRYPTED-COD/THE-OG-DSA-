import java.util.Scanner;
public class largestdigitmethod {
    public static int largestdigitmethod(int number){
        int largest=0;
        int digit=0;
        while (number>0){
            digit=number%10;
            number=number/10;
            if(digit>largest){
                largest=digit;
            }
        }
        return largest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        int result=largestdigitmethod(number);
        System.out.println("the largest digit is "+result);
    }
}
