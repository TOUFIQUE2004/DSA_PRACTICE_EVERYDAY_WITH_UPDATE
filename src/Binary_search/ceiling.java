package Binary_search;

public class ceiling {
    public static void main(String[] ABCD) {
        int[] arr = {1, 3, 5, 6, 7, 8, 11, 23, 45, 66, 77, 88};
        int target = 47;
        int target2=4;
        int ans = ceiling(arr, target);
        System.out.println(ans);
        int ans2 = floor(arr, target2);
        System.out.println(ans2);
    }

    public static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }

        }
        return arr[start];
    }

    public static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }

        }
        return arr[end];
    }
}
