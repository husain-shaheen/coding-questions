public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int data = 10;
        int index = binarySearch(arr, data);
    }
    private static int binarySearch(int[] arr, int data) {
        if(arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(data < arr[mid]) {
                end = mid-1;
            } else if(data == arr[mid]) {
                System.out.println("Element Found at Index : "+mid);
                return mid;
            } else {
                start = mid+1;
            }
        }
        System.out.println("Element Not Found!");
        return -1;
    }
}