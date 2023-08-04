function partition(arr, low, high) {
    const pivot = arr[low];
    let i = low;
    let j = high;

    while (i < j) {
        while (arr[i] <= pivot && i <= high - 1) {
            i++;
        }

        while (arr[j] > pivot && j >= low + 1) {
            j--;
        }

        if (i < j) {
            [arr[i], arr[j]] = [arr[j], arr[i]];
        }
    }

    [arr[low], arr[j]] = [arr[j], arr[low]];
    return j;
}

function quickSort(arr, low, high) {
    if (low < high) {
        const pIndex = partition(arr, low, high);
        quickSort(arr, low, pIndex - 1);
        quickSort(arr, pIndex + 1, high);
    }
}

function performQuickSort(arr) {
    quickSort(arr, 0, arr.length - 1);
    return arr;
}

const arr = [4, 6, 2, 5, 7, 9, 1, 3];
const n = arr.length;

console.log("Before Using Quick Sort: ");
console.log(arr.join(" "));

performQuickSort(arr);

console.log("After Quick Sort: ");
console.log(arr.join(" "));
