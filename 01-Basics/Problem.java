import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 ");
        System.out.println("enter number 2 ");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int add = number1+number2;
        double diffrence = number1-number2;
        double multi = number1*number2;
        double remainder = number1%number2;
        if (number1>number2){
            System.out.println("number1 is greater");
        }
         else if (number1<number2)
            {
                System.out.println("number2 is greater");
            }
            else
            {
                System.out.println("both are equal ");
            }
        System.out.println(add);
        System.out.println(diffrence);
        System.out.println(multi);
        System.out.println(remainder);
        

        



    }
    
}
