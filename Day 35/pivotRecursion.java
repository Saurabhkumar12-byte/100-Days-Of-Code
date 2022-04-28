public class pivotRecursion {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(pivot(arr,0,7));
    }
    public static int pivot(int[] array ,int s,int e) {
        int m=s+(e-s)/2;
        if (array[m]<array[s]) {
            int j=m;
            while (array[j]>array[j-1]) {
                j--;
            }
            return j;
        }
        return pivot(array, m+1, e);
    }
}
