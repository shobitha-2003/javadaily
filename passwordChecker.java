import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = PassCheck(str);
        System.out.println(res);
    }
    public static int PassCheck(String str){
        if(str.length()<4)
            return 0;
        if(str.charAt(0)>='0' && str.charAt(0)<='9')
        return 0;
        int cap=0,num=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='/' || str.charAt(i)==' ')
            return 0;
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            cap++;
            else if(str.charAt(i)>='1'&& str.charAt(i)<='9')
            num++;
        }
        if(cap>0 && num>0)
        return 1;
        else 
        return 0;
    }
}
