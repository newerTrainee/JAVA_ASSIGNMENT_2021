import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_SumEx {
    public static void main(String[] args){
        List<Float> arr = new ArrayList<Float>();
        arr.add(1.0f);
        arr.add(3.4f);
        arr.add(2.2f);
        arr.add(1.4f);
        Iterator<Float> i = arr.iterator();
        float sum=0;
                while(i.hasNext()){
                    sum = sum+i.next();

                }
        System.out.println("sum : "+sum);
    }
}
