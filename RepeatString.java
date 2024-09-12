import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String finalStr = "";
        while(num>0){
            finalStr = finalStr + str;
            num--;
        }
        System.out.println("The Repeat string is : "+finalStr);
    }
}
