import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEvenEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 7, 10, 14, 19, 20, 26);

        /* System.out.println("Even No. List is : "+list.stream()
            .filter(integer -> integer%2==0)
                .collect(Collectors.toList())); */
        System.out.println(CollectEvenEx.collectEven(list));
    }
static List collectEven(List<Integer> list){
        return list.stream()
                .filter(integer -> integer %2 == 0)
                .collect(Collectors.toList());
}
}