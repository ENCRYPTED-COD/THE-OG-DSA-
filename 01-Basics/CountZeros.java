import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        System.out.println("enter a number ");
        int number=os.nextInt();
        int digit=0;
        int count=0;
        for(;number>0;){
            digit=number%10;
            number=number/10;
            if(digit==0){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
