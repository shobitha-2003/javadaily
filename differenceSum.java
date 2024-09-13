import java.util.Scanner;

public class differenceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divisible number");
        int num = sc.nextInt();
        System.out.println("enter the range");
        int range = sc.nextInt();
        int res = diffSum(num,range);
        System.out.println(res);
    }
    public static int diffSum(int num,int range){

        int sum=0,sum1=0;
        for(int i=1;i<=range;i++){
            if(i%num==0)
            sum+= i;
            else
            sum1 += i;
        }
        int diff = sum1 - sum;
        return diff;

    }
}
