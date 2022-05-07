/**
 * recursiveBinarySearch
 */
public class recursiveBinarySearch {

    public static void main(String[] args) {
        int arr[]={1,4,5,7,9,13};
        System.out.println(binarySearch(arr, 0, 5, 6));
    }
    static int binarySearch(int[] array,int start,int end,int se){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (array[mid]==se) {
            return mid;
        } else if (array[mid]<se){
            return binarySearch(array, mid+1, end, se);
        }
        else{
            return binarySearch(array, start, mid-1, se);
        }
    }
}