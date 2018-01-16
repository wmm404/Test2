package sort;

import java.util.Arrays;

/**
 * @吴明明
* 插入排序
* */
public class Insert_sort {
    public static void main(String args[]){
        int a[] ={5,4,7,9,6,8,4,99,0,1,3};
        int b = a.length;

        sort(a,b);
        System.out.println(Arrays.toString(a));

    }
    public  static  void sort(int a[],int b){
        for (int i = 1; i < b; i++)
        {
            int j = i;
            int key = a[i];
            while (j > 0 && a[j - 1]>key  )
            {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = key;
        }
    }
    }



