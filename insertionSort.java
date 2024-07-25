import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array");
        int num = sc.nextInt();
        int[] array = new int[num];
        System.out.println("Enter the array elements");
        for(int i=0;i<num;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter elements are");
        for(int i=0;i<num;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int temp = 0;
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }
            }
        }
        System.out.println("Sorted array elements by insertion sorting");
        for(int i=0;i<num;i++){
            System.out.print(array[i]+" ");
        }
        

    }
}
