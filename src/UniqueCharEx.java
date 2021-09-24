import java.util.HashMap;
import java.util.HashSet;

public class UniqueCharEx {
    public static void main(String[] args) {
        System.out.println("The no. of unique Character are: "+UniqueCharEx.uniqueChar("HelloEveryOne"));
    }
        static int uniqueChar(String s) {
            s = s.toLowerCase();
            HashSet<Character> hash = new HashSet<Character>();
            int count = 0;
            for (char c : s.toCharArray()) {
                hash.add(c);
            }
            int n = hash.size();
            return n;
        }
}
       /* HashMap<Integer,Character> hash = new HashMap<>();
        int count=0;
        int i=1;
        for (char c:s.toCharArray()) {
            hash.put(i,c);
            if(hash.containsKey(i)){
                count++;
            }
            i++;
        }
        System.out.println(count); */

