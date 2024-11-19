package Lab5.HomeTasks;
public class home_task_4 {
    public static void main(String[] args) {
        int[] accountIds = {3547, 1245, 6789, 2345, 7890};
        int[] accBalances = {28000, 12000, 45000, 32000, 15000};

        System.out.println("Before Sorting:");
        printAccounts(accountIds, accBalances);

        quickSort(accBalances, accountIds, 0, accBalances.length - 1);

        System.out.println("\nAfter Sorting by Balance:");
        printAccounts(accountIds, accBalances);
    }
    static void quickSort(int[] accBalances, int[] accountIds, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(accBalances, accountIds, low, high);
            quickSort(accBalances, accountIds, low, pivotIndex - 1);
            quickSort(accBalances, accountIds, pivotIndex + 1, high);
        }
    }
    static int partition(int[] accBalances, int[] accountIds, int low, int high) {
        int pivot = accBalances[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (accBalances[j] > pivot) { 
                i++;
                swap(accBalances, i, j);
                swap(accountIds, i, j);
            }
        }
        swap(accBalances, i + 1, high);
        swap(accountIds, i + 1, high);

        return i + 1;
    }
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void printAccounts(int[] accountIds, int[] accBalances) {
        for (int i = 0; i < accountIds.length; i++) {
            System.out.println("Account ID: " + accountIds[i] + " Balance: " + accBalances[i]);
        }
    }
}
