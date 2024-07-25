import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int start=0;start<str.length();start++){
            for(int end=start+1;end<str.length();end++){
                System.out.println(str.substring(start,end));
            }
        }
    }
    
}
