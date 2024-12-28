import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1; //array starts at 0, hence the -1

        while (low <= high){
            int mid = (low + high) / 2;
            if (array[mid] == target){
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else if (array[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,58,9,87,52,6,5,15};
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));//Test to make sure array was sorted

        int target = 87;
        System.out.println("Target value is found at index: " + binarySearch(array,target) );
    }
}
