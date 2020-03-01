import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] arge) {
//        int count = 100;
//        for(int i=1; i<count; i++) {
//            int[] num1 = randomNum();
//            int[] num2 = num1.clone();
//            //测试的方法
//            BubbleSort.bubbleSort(num1);
//           HeapSort.heapSort(num2);
//            if(!counterPoint(num1,num2)){
//                System.out.println("失败");
//                System.out.println(Arrays.toString(num1));
//                System.out.println(Arrays.toString(num2));
//                break;
//            }
//
//        }
//        System.out.println("成功L");
        Comparator_student t1 = new Comparator_student("小花", 'A', 12);
        Comparator_student t2 = new Comparator_student("小明", 'b', 19);
        Comparator_student t3 = new Comparator_student("小强", 't', 15);
        Comparator_student[] test = new Comparator_student[] {t1,t2,t3};

        Arrays.sort(test,new Comparator_student.dowmComparator());          //传入一个实现comparator接口的类
        System.out.println(Arrays.toString(test));




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

    public static boolean counterPoint(int[] num1,int[] num2){


        if(num1.length!=num2.length) {
            return false;
        }
        for(int j=0;j<num1.length;j++) {
            if(num1[j]!=num2[j]) {
                return false;
            }
        }
        return true;
    }
}
