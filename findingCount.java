import java.util.Scanner;

public class findingCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int num = sc.nextInt();
        int[] array = new int[num];
        System.out.println("enter the array elements");
        for(int i=0;i<num;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the comparing number");
        int comp = sc.nextInt();
        System.out.println("Give the difference number");
        int diff = sc.nextInt();
        int res = findCount(array,num,comp,diff);
        System.out.println(res);
    }
    public static int findCount(int[] array,int num,int comp,int diff){
        int count = 0;
        for(int i=0;i<num;i++){
            int newNum = Math.abs(array[i]-comp);
            if(newNum<=diff)
            count++;
            
            }
            if(count==0)
            return -1;
        
        return count;
    }
    
}
