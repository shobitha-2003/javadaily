import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class HappyOrUnhappy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean value = HappyOrUnhappyNum(num);
        if(value)
        System.out.println(num+" is happy number");
        else
        System.out.println(num+" is unhappy number");
    }
    public static boolean HappyOrUnhappyNum(int num){
       Set<Integer> numbers = new HashSet<>();

       int current = num;
       while(current!=1 && !numbers.contains(current)){
        numbers.add(current);
        current = getSumSquares(current);

       }
       return current == 1;
    }
    private static int getSumSquares(int value){
        int sum = 0;
        while(value>0){
            int rem = value % 10;
            sum += rem * rem;
            value /= 10;
        }
        return sum;
    }
}
