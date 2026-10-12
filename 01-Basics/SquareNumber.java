import java.util.Scanner;
    public class SquareNumber {
        public static int square(int number){
            int square=number*number;
            return square;

        }
        public static void main (String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int number=sc.nextInt();
            int result=square(number);
          System.out.println("the square of the number is "+result);
    
        
        }

    
}
