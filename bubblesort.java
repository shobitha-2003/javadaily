import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements are");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-1-i;j++){
                int temp=0;
                if(arr[j]> arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted elements are");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
