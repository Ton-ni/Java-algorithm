//冒泡：N2 稳定，每一轮把最大的数放到后面，比较然后交换

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        if(arr==null||arr.length<2) {
            return;
        }
        for(int i=arr.length-1;i>0;i--) {
            for(int j=0;j<i;j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr, j, j+1);
                }

            }

        }

    }

    public static void swap(int[] arr, int i,int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }


}
