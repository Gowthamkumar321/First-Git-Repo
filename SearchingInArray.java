import java.util.Scanner;

public class SearchingInArray {

    public static void main(String[] args) {

        int[] arr = {0,2,4,6,8,9,13,16}; // intialize and assign values
        System.out.println("Enter the element ");
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        int result = binarySearch(arr, tar);
        if (result != -1) {
            System.out.println("target found at " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int linearSearch(int[] arr, int tar) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target){
        
        int start=0;
        int end=arr.length-1;
     while(start<=end){    //used while we don't know no.of iterations
         int mid=(start+end)/2;
         if(arr[mid]==target){
            return mid  ;
        }
         else if(arr[mid]<target){
            start= mid ;//start=mid+1
        }
         else if(arr[mid]>target){
            end= mid ; //end = mid-1
         }
        }
        return -1;
    }
}
