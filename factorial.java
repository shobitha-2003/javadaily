import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int res = FactorialNum(num);
        System.out.println("The factorail of "+num+" is "+res);
    }
    public static int FactorialNum(int num){
        if(num<0)
        return -1;
        int product = 1;
        for(int i=num;i>0;i--){
            product *= i;
        }
        return product;
    }
}
