package Lab5.HomeTasks;
public class home_task_1 {
    public static void main(String[] args) {
        // SHAHZAIB DURRANI
        int[] accNumbers = {3547, 1245, 6789, 2345, 7890};
        int[] balances = {24856, 12584, 48521, 39632, 12147};
        System.out.println("Before Sorting:");
        printAcc(accNumbers, balances);
        quickSort(balances, accNumbers, 0, balances.length - 1);
        System.out.println("\nAfter Sorting by Balance:");
        printAcc(accNumbers, balances);
    }
    static void quickSort(int[] balances, int[] accNumbers, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(balances, accNumbers, low, high);
            quickSort(balances, accNumbers, low, pivotIndex - 1);
            quickSort(balances, accNumbers, pivotIndex + 1, high);
        }
    }
    static int partition(int[] balances, int[] accNumbers, int low, int high) {
        int pivot = balances[high];
        int i = low - 1; 
        for (int j = low; j < high; j++) {
            if (balances[j] > pivot) { 
                i++;
                swap(balances, i, j);
                swap(accNumbers, i, j); } }
        swap(balances, i + 1, high);
        swap(accNumbers, i + 1, high);
        return i + 1;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printAcc(int[] accNumbers, int[] balances) {
        for (int i = 0; i < accNumbers.length; i++) {
            System.out.println("Account No.: " + accNumbers[i] + " | Balance: " + balances[i]);
        }}}
