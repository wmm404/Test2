package select;

import java.util.Objects;

public class Two_point_lookup {

/**
 * @吴明明
 * 二分查找，检索有序数组
 * */
public static void main(String args[]){
    int arr[] = {1,2,3,4,5,6,7,8,9};
    String result = find(arr,arr.length-1,6);
    System.out.println(result);
}

public static String find(int arr[],int n,int x){
   int p = 0;
   int r = n;
   while (p <= r){
       int q = (p+r)/2;
       System.out.println(" p="+p+"  r="+r+"  q="+q);
       if (x==arr[q]) {
           System.out.println("已经找到" + x);
           System.exit(0);
       } else if (arr[q] > x) {
           r = q - 1;
       } else if (arr[q] < x) {
           p = q + 1;
       }
   }
return "没找到";
}



}
