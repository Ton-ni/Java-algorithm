//
// 给定一个数组，求排序之后相邻的最大差值，要求时间复杂度ON，要求不能用非基于比较的排序
//
public class MaxDIfferent {
    public static int maxDifferent(int[] arr) {
        int MAX = arr[0];
        int MIN = arr[0];
        for (int i=0; i<arr.length;i++) {
            MAX = MAX > arr[i] ? MAX : arr[i];
            MIN = MIN < arr[i] ? MIN : arr[i];
        }
        if(MAX==MIN){
            return 0;
        }
        int[] min = new int[arr.length + 1];
        int[] max = new int[arr.length + 1];
        boolean[] isEmpty = new boolean[arr.length + 1];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int aim = orderTong(arr.length+1, MAX, MIN, arr[i]);
            min[aim] = isEmpty[aim]? Math.min(arr[i],min[aim]):arr[i];
            max[aim] = isEmpty[aim]? Math.max(arr[i],max[aim]):arr[i];
            isEmpty[aim] = true;
        }
        int first = max[0];
        for(int j=1;j<arr.length+1;j++){
            if(isEmpty[j]){
                res = Math.max(min[j]-first,res);
                first = max[j];
            }


        }
        return res;


    }
    //边界值有点奇怪，和答案不一致
        public static int orderTong(int size, int MAX, int MIN, int goal) {
            if (goal == MAX) {
                return (size - 1);
            } else {
                return (int) ((goal - MIN) * size / (MAX - MIN));
            }
        }

}
