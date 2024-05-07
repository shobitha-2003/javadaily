import java.util.Scanner;
public class evenLengthWord{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Statement: ");
String statement = sc.nextLine();
String wordsArray[] = statement.split(" ");
for(String words:wordsArray)
{
 if(words.length()%2==0)
  System.out.println(words + " ");
}
}
}