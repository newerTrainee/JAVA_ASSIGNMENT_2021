public class Q6 {

    static int findElement(int ar[], int size)
    {
        int res = ar[0];
        for (int i = 1; i < size; i++)
            res = res ^ ar[i];

        return res;
    }

    public static void main (String[] args)
    {
        int ar[] = {8, 9, 6, 1, 9, 1, 6};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findElement(ar, n) + " ");
    }
}
