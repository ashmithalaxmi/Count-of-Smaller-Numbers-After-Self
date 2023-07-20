import java.util.Scanner;

public class Smaller {
    static int[] count(int[] arr, int n){
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        arr = count(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
