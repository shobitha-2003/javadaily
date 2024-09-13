import java.util.Scanner;
public class ratProblem
{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the no of rats");
   int rat = sc.nextInt();
   System.out.println("Enter the food consumed");
   int food = sc.nextInt();
   System.out.println("Enter the array size");
   int n = sc.nextInt();
   int[] array= new int[n];
   System.out.println("Enter the array elements");
   for(int i=0;i<n;i++){
       array[i] = sc.nextInt();
   }
   int res = RatsLive(rat,food,array,n);
System.out.println("Result: "+res);
}
public static int RatsLive(int rats,int eat,int[] arr,int num){
   if(num==0){
       return -1;
   }
   if(rats==0){
    return 0;
   }
   int eaten = rats * eat;
   int count = 0;
   int sum = 0;
   for(int i=0;i<num;i++){
       if(sum<=eaten){
           sum+=arr[i];
           count++;
       }
   }
   if(sum<eaten)
       return 0;
   else
       return count;
   
}
}