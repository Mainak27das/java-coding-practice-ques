public class Occurance_SecondLargest {
    public static int countSecondLargest(int[] arr) {
        // Handle the case when the array has only one element
        if (arr.length == 1) {
            return 0;
        }
    
        // Find the second largest element
        int secondLargest = 0;
        for (int i = arr.length - 1; i >=0; i--) {
            if (arr[i] != arr[i - 1]) {
                secondLargest = arr[i - 1];
                break;
            }
        }
    
        // If all elements are the same
        if (secondLargest == 0) {
            return 0;
        }
    
        // Count the occurrences of the second largest element
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == secondLargest) {
                count++;
            }
        }
        
        return count;
    }
}
