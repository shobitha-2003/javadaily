import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrimeNumber(num))
        System.out.println(num+" is Prime Number");
        else
        System.out.println(num+" It is not a Prime Number");
    }
    public static boolean isPrimeNumber(int num){
        if(num<=1)
        return false;
        for(int i=2;i<num/2;i++){
            if(num%i==0)
            return true;
            
        }
        return false;
       

    }
}