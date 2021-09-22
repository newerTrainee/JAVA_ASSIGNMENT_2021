public class Q2 {
    public static void main(String[] args) {
        String string = "My name is Sumit and I repeat name is sumit";
        int count;
        string = string.toLowerCase();

        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0"; //printing 0 to avoid visited words
                }
            }
                if (count > 1 && words[i] != "0")
                    System.out.println(words[i]+" "+count);
            }
        }
    }
