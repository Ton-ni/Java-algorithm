import java.util.Arrays;

//推排序，N.logN，不稳定，先heapInsert为大根推，再依次将顶部数换到底部，二叉树范围减1
public class HeapSort {
    public static void heapSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0; i<arr.length; i++){
            heapInert(arr,i);
        }
        for(int j=arr.length-1; j>0; j--){
            swap(arr,j,0);
            heapify(arr,j-1);
        }

    }

    public static void heapInert(int[] arr, int i){
        int index = i;
        while(arr[index] > arr[(index-1)/2]){         //考虑完整，结束的时候0也成立
            swap(arr,index,(index-1)/2);
            index = (index-1)/2;
        }

    }

    //第一个数变小，重新变为大根堆
    public static void heapify(int[] arr, int size){
        int i = 0;
      while(2*i+1<=size){
            int max = ( 2*i+2<=size && arr[2*i+2] > arr[2*i+1] ) ? (2*i+2):(2*i+1);  //漏了乘号* 漏了等于号
            if(arr[i]>=arr[max]){                                                   //漏了判断大小
                break;
            }
            else {
                swap(arr,i,max);
            }
            i = max;
        }


    }

    public static void swap(int[] arr, int i, int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }



}
