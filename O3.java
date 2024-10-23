package Arrays;
//Maximum in subarray
public class O3 {

    public static int MaxSub(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;

        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            else if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[]={12,43,654,236,756};
    }
}
