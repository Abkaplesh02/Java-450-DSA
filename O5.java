package Arrays;
import java.util.Arrays;
//Choclate problem
public class O5 {

    public static int ChoclateProblem(int arr[],int m){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        int i=0;

        for(int j=0;j<arr.length;j++){
            if(j-i+1==m){
                int diff=arr[j]-arr[i];
                min=Math.min(diff,min);
                i++;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int arr[]={7,3,2,4,9,12,56};
        System.out.println(ChoclateProblem(arr,3));

    }
}
