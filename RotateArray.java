import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to rotate ");
        int rotate = sc.nextInt();
        rotatingArray(arr,rotate);
    }
    public static void rotatingArray(int[] arr,int rotate){
        if(arr.length==0){
            System.out.println("the array length is zero");
            return;
        }
        else{
            for(int i=0;i<rotate;i++){
                int temp=arr[arr.length-1];
                for(int j=arr.length-1;j>0;j--){
                   arr[j]=arr[j-1];

                }
                arr[0]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
