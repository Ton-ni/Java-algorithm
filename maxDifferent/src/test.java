import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int count = 100;
        for(int i=0;i<count;i++) {
            int[] test1 = randomNum();
            int[] test2 = test1.clone();
            if(correct(test1)!=MaxDIfferent.maxDifferent(test2)){
                System.out.println(test1);
                System.out.println(correct(test1));
                System.out.println(MaxDIfferent.maxDifferent(test2));
            }

        }
        System.out.println("成功");

    }
    //test 暴力方法
    public static  int correct(int[] arr){
        Arrays.sort(arr);
        int tem = 0;
        for(int i=1;i<arr.length;i++){
            tem = Math.max(tem,arr[i]-arr[i-1]);
        }
        return tem;

    }

    //产生长度为size，数字范围是[0,num]的数组
    public static int[] randomNum() {
        int size = 5;
        int num = 10;
        int[] res = new int[size];
        for(int i=0;i<res.length;i++) {
            res[i] = (int)((num+1)*Math.random());  //Math.random() [0,1) double
        }
        return res;
    }



}
