import java.util.Scanner;

public class binnaryCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of odd length");
        String str = sc.nextLine();
        int res = OperationBinnaryString(str);
        System.out.println("The result is:"+res);
    }
    public static int OperationBinnaryString(String str){
        
        if(str== null)
        return -1;
        int res = str.charAt(str.length()-1) - '0';
        for(int i=str.length()-2;i>=0;){
            char prev = str.charAt(i);
            i--;
            if(prev=='A')
            res = res & (str.charAt(i)-'0');
            else if(prev=='B')
            res = res | (str.charAt(i)-'0');
            else
            res = res ^ (str.charAt(i)-'0');
            i--;

        }
        return res;
}
    
}
