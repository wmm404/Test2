package sort;

import java.util.Arrays;
/**
 * @吴明明
 * 选择排序
 * 选择排序算法的改进在于：先并不急于调换位置，先从A[1]开始逐个检查，
 * 看哪个数最小就记下该数所在的位置P，等一躺扫描完毕，再把A[P]和A[1]对调，
 * 这时A[1]到A[10]中最小的数据就换到了最前面的位置。
 * */

public class Selection_Sorting {
    public static void main(String args[]){
        int a[] ={5,4,7,9,6,8,4,99,0,1,3};
        int b = a.length;
        sort(a,b);
        System.out.println(Arrays.toString(a));

    }
    public  static void sort(int a[],int b){
        for(int i = 0;i < b-1;i++){
            int small = i;  //1.small代表最小数的地址值
            for(int j = i+1;j < b;j++){
                if(a[j] < a[small]){
                 small = j;//2.后面的元素只要出现比最小数还小的那么small变成该数的地址值
                }
            }
            int k = a[i];
            a[i] = a[small];//3.最小的值的位置跟首位互换
            a[small] = k;
        }
    }

}
