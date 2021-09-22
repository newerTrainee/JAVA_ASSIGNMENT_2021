import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String random = in.nextLine();
        char[] arr = random.toCharArray();
        char a ;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}
