package Arrays;
//Search in rotated sorted array
public class O6 {

    public static int Pivot(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+((end-start)/2);
            if(arr[mid]>arr[mid+1] && end>mid){
                return mid;
            }
            else if(arr[mid-1]>arr[mid] && mid>start){
                return mid-1;
            }
            else if(arr[mid]>arr[start]){
                start=mid+1;
            }
            else if(arr[start]>arr[mid] ){
                end=mid-1;
            }
        }
        return -1;

    }

    public static int BS(int arr[], int target,int start, int end){
        while(start<end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
    public static void main(String[] args) {

    }
}
