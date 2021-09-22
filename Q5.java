import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args){
        int[] a = {1,3,5,6,2,8};
        int[] b = {2,4,6,5,3,9};
        ArrayList<Integer>  c = new ArrayList<Integer>(3);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    c.add(b[j]);
                }
            }
        }
        System.out.print("The common elements are: ");
        for(int i =0;i<c.size();i++){
        System.out.println(c.get(i));
    }
}
}
