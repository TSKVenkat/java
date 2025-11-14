import java.util.*;

public class mergensort{
    public static <T extends Comparable<T>> List<T> mergendesc(List<T> list1,List<T> list2){
        List<T> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        Collections.sort(merged,Collections.reverseOrder());
        return merged;
    }

    public static void main(String[] args){
        List<Double> dlarr = Arrays.asList(0.1,0.2,0.5);
        List<Double> dlarr1= Arrays.asList(0.3,0.4,0.8);
        System.out.println("Merged and desc ordering: "+mergendesc(dlarr,dlarr1));
    }
}