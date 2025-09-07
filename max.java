import java.util.Scanner;

public class max{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min=arr[0];
        for(int j=0;j<5;j++){
            if(arr[j]>max){
                max = arr[j];
            }
            if(arr[j]<min){
                min = arr[j];
            }
        }

        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);
    }
}