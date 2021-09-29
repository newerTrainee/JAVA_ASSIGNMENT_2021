import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumCondition {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,3,2,0,4,5,10,15,6,19);
        System.out.println(SumCondition.sumCal(list));
    }
    static int sumCal(List<Integer> l){
    return l.stream()
            .filter(e -> e>5)
            .mapToInt(i -> i)
            .sum();

    }

}
