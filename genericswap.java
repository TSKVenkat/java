import java.util.Arrays;
import java.util.Scanner;

public class genericswap{
    public static <T> void swap(T[] arr,int pos, int pos1){
        T temp=arr[pos];
        arr[pos]=arr[pos1];
        arr[pos1]=temp;
    }

    public static void main(String[] args){
        int pos,pos1;
        Scanner sc = new Scanner(System.in);

        Integer[] intArray= {1,2,3,4,5};
        System.out.println("\nOriginal Array:\n"+Arrays.toString(intArray));
        pos=sc.nextInt();
        pos1=sc.nextInt();
        swap(intArray,pos,pos1);
        System.out.println("\nSwapped Array:\n"+Arrays.toString(intArray));
    }
}