public class minMax {
    public static void main(String[] args) {
        int [] arr={1, 4, 3, -5, -4, 8, 6};
        minMaxFunc(0,0,0, arr);
    }

    private static void minMaxFunc(int min, int max, int i, int[] arr) {
        if (i==arr.length-1) {
            System.out.println("min is "+min+" max is "+max);
            return;
        }
        if (arr[i]>max) {
        max=arr[i];
        }
        if (arr[i]<min) {
            min=arr[i];
            }
            minMaxFunc(min, max, ++i, arr);
    }
}
