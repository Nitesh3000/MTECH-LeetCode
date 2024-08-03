public class Problem1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        for (int i = 0; i < target.length - 1; i++) {
            if (arr[i] != target[i]) {
                int j = i + 1;
                while (arr[j] != target[i]) {
                    if (j == target.length - 1) {
                        if (arr[j] != target[i]) {
                            return false;
                        }
                    }
                    j++;

                }
                arr = reverse(arr, i, j);
            }

        }

        if (arr[arr.length - 1] != target[arr.length - 1])
            return false;
        return true;
    }

    public int[] reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Problem1460 prb = new Problem1460();
        int[] target = { 3, 7, 9 };
        int[] arr = { 3, 7, 11 };
        System.out.println(prb.canBeEqual(arr, target));
    }
}
