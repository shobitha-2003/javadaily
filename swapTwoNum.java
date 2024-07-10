import java.util.Scanner;

public class swapTwoNum{
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Swap two number using third variable");
        SwapTwo(num1,num2);
        System.out.println("without using third variable");
        SwapTwoWithoutVariable(num1,num2);

    }
    public static void SwapTwo(int num1,int num2){
        int a=num1;
        num1=num2;
        num2=a;
        System.out.println("num1 :"+num1+" num2 :"+num2);
    }
    public static void SwapTwoWithoutVariable(int num1,int num2){
        num1 = num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1 : "+num1+" num2 : "+num2);
    }
}