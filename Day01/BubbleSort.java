package Day01;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/10/21
 **/

public class BubbleSort {
    public static void bubbleSort1(int[] a,int n) {
        int i,j;
        for(i=0;i<n;i++){
            for(j=1;j<n-i;j++){
                if(a[j-1]>a[j]){
                    int temp;
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,0,9,3,12,7,4,5,2,445,4612};
        BubbleSort.bubbleSort1(arr,arr.length);
        for(int i : arr){
            System.out.print(i+",");
        }
    }
}
