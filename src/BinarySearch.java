public class BinarySearch {
    public int binarySearch(int[] array, int target){
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
}
