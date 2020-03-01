//归并：N.logN 稳定 递归形式，每次对半分，左右两边都排序再合并
public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        sort(arr, 0, arr.length - 1);

    }

    public static void sort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        sort(arr, L, mid);
        sort(arr, mid + 1, R);
        merge(arr, L, R);
    }

    public static void merge(int[] arr, int less, int more) {
        int[] tem = new int[more - less + 1];
        int a1 = less;
        int b1 = (less + more) / 2 + 1;
        int middle = (less + more) / 2;
        for (int i = 0; i < tem.length; i++) {
            if (a1 <= middle && b1 <= more) {
                tem[i] = arr[a1] < arr[b1] ? arr[a1++] : arr[b1++];
            } else if (a1 > middle && b1 <= more) {
                tem[i] = arr[b1++];
            } else if (a1 <= middle && b1 > more) {
                tem[i] = arr[a1++];
            }
        }
        for (int k = 0; k < tem.length; k++) {
            arr[less + k] = tem[k];
        }
    }
}
