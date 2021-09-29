import java.util.Arrays;
import java.util.List;

public class FirstEvenNo {
public static void main(String[] args){
    List<Integer> list = Arrays.asList(1, 5, 7, 10, 14, 19, 20, 26);
    System.out.println(FirstEvenNo.evenNo(list));
}

static int evenNo(List<Integer> l){
    return l.stream()
            .filter(i -> i%2 == 0)
            .findFirst()
            .orElse(null);
}
}
