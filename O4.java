package Arrays;
import java.util.Arrays;
//Contains duplicate in array
public class O4 {

    public static boolean Duplicate(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={12,43,654,76,32,12};
    }
}
