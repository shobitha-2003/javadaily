import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=0)
        System.out.println("Enter the positive number");
        else{
            System.out.println("The Fibonacci Series upto "+ num+ " terms are");
            int firstTerm = 0;
            int secondTerm = 1;
            for(int i =1;i<=num;i++){
                System.out.print(firstTerm+" ");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
}