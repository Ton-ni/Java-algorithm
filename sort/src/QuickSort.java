import java.util.Arrays;

//随机快排：N.logN 不稳定 每次根据最后一个数划分为小于num,等于num,大于num,递归到长度为1
public class QuickSort {
    public static void quickSort(int[] arr){
        if(arr.length<2||arr==null){
            return;
        }
        partition(arr,0,arr.length-1);

    }

    public static void partition(int[] arr, int L, int R){
        if(L>=R){
            return;
        }
        int p = L;
        int left = L-1;
        int right = R;
        while(p<right){
            if(arr[p]<arr[R]){
                swap(arr,p++,++left);
            }
            else if(arr[p]==arr[R]){  //只执行一次
                p++;
            }
            else{
                swap(arr,p,--right);
            }
        }
        swap(arr,R,right++);       //应该是++，范围缩小了
        partition(arr,L,left);
        partition(arr,right,R);
    }

    public static void swap(int[] arr, int i, int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
