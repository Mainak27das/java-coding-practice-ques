#include <stdio.h>

int main() {
    int n, temp;

    // Input the number of elements in the array
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int arr[n];

    // Input the elements of the array
    printf("Enter the elements:\n ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Sort the array in ascending order using nested for loops
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) { // Start from j = i + 1 to compare with arr[i]
            if (arr[i] < arr[j]) { // Swap if the element at i is greater than at j
                // Swap arr[i] and arr[j]
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    // Print the sorted array
    printf("Sorted array in ascending order: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
