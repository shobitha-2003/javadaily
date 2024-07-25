import java.util.Scanner;

public class occurenceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("enter the character to find");
        char c = sc.next().charAt(0);
        int Num = findChar(str,c);
        System.out.println(Num);
    }
    public static int findChar(String str, char c){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}
