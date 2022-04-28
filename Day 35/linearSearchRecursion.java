public class linearSearchRecursion {
    public static void main(String[] args) {
        int arr[]={1,5,2,94 ,44};
        System.out.println(search(arr, 0,4));
    }
    private static int search(int []arr, int i ,int s) {
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==s) {
            return i;
        }
        return search(arr, i+1, s);
    }
}
