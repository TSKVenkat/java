public class comparegeneric{
    public static <T extends Comparable<T>> T findmin(T[] arr){
        T min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i].compareTo(min)<0){
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args){
        Integer[] intarr = {0,1,2,3,4,5,-1};
        System.out.println("Passing integer array: "+ findmin(intarr));

        String[] strarr = {"hello","sat","venky","chikkom"};
        System.out.println("Passing string array: "+ findmin(strarr));

        Double[] doublearr = {0.1,0.2,-0.1,0.5};
        System.out.println("Passing double array: "+ findmin(doublearr));
    }
}