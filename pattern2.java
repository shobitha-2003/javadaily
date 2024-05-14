import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){

            for(int j=1;j<=num-i;j++)
                System.out.print(" ");

            for(int k=1;k<=2*i-1;k++)
            if(i ==num)
            System.out.print("*");
            else
             if(k==1 || k==2*i-1)
                System.out.print("*");
            else
                System.out.print(" ");

        System.out.println();
        }
    }
    
}
