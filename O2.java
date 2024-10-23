package Arrays;
//Reverse an Array
public class O2 {
    public static int[] Reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={43,65,76,87,34};
    }
}
