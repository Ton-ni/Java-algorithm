//插入：N2 稳定，每次遍历前面的数字，插入到合适位置
import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] arr){
        if(arr.length<2||arr==null){
            return;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[0]){
                int tem = arr[i];
                for(int k=i-1;k>=0;k--){
                    arr[k+1] = arr[k];
                }
                arr[0] = tem;
                continue;
            }
            for(int j=i-1;j>=0;j--){
                if (arr[i] >= arr[j]) {           //漏了等于的情况
                    int tem = arr[i];
                    for(int k=i-1;k>j;k--){
                        arr[k+1] = arr[k];
                    }
                    arr[j+1] = tem;
                    break;

                }
            }
        }
    }

}
