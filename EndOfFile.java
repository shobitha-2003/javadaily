import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linenumber=1;
        while(sc.hasNext()){
            String words = sc.nextLine();
            System.out.println(linenumber + " "+words);
            linenumber++;
        }
    }
}