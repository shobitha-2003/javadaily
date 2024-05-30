public class pattern8 {
public static void main(String[] args) {
    int num=5;
    for(int i=0;i<num;i++){
    for(int j=0;j<i;j++)
    System.out.print(" ");
    for(int k=num;k>i;k--)
    System.out.print("*");
System.out.println();
}
}
    
}