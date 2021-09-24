import java.util.*;
class OccurenceExample {
    static void characterCount(String s)
    {
        HashMap<Character, Integer> hash = new HashMap<>();
        // checking each char of strArray
        for (char c : s.toCharArray()) {
            if (hash.containsKey(c)) {
                hash.put(c, hash.get(c) + 1);
            }
            else {
                hash.put(c, 1);
            }
        }

        for (Map.Entry entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void main(String[] args)
    {
        String str = "wholeworld";
        characterCount(str);
    }
}

