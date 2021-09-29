import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Avg {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,3,2,0,4,5,10,15,6,19);
        System.out.println(SumCondition.sumCal(list));
    }
    static OptionalDouble sumCal(List<Integer> l){
        return l.stream()
                .mapToDouble(e -> e)
                .average();
    }
}
