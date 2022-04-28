public class sortedArrayRecursion {
    public static void main(String[] args) {
        int arr[]={1,3,2,7,8};
        System.out.println(sorted(arr,0));
    }
    private static boolean sorted(int [] arr, int j) {
        if(j==arr.length-1){
            return true;
        }
        if (arr[j]>arr[j+1]) {
            return false;
        } else {
            return sorted(arr,j+1);
        }
    }
}
