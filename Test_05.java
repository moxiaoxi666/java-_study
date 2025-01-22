import java.util.Arrays;

public class Test_05 {
    public static void bubbleSort(int[] array,int len) {
        for(int i = 0;i<len-1;i++) {
            for(int k = 0;k<len-1-i;k++) {
                if(array[k]>array[k+1]) {
                    int tmp = array[k];
                    array[k]=array[k+1];
                    array[k+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {0,5,7,8,1,6,4,4,};
        bubbleSort(array,array.length);
        System.out.println(Arrays.toString(array));
    }
    public static void main6(String[] args) {
        int[] array ={0,1,2,3,4,5,6};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.equals(array, ret));
    }
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while(left<=right) {
            int mid =(left+right)/2;
            if(array[mid]<key) {
                left=mid+1;
            }else if (array[mid]>key){
                right=mid-1;
            }else {
                return mid ;
            }
        }
        return -1;
    }
    public static void main5(String[] args) {
        int[] array ={0,2,3,4,5,11};
     int  ret= binarySearch(array,11);
        System.out.println(ret);
    }
    public static void main4(String[] args) {
        int[] array ={0,1,2,3,4,5,6};
        int[] ret= Arrays.copyOf(array,7);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] copyArray(int[] array) {
        int[] newArray=new int[array.length];
        for(int i =0;i< array.length;i++) {
            newArray[i]=array[i];
        }
        return newArray;
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4};
        int[] newArray=copyArray(array);
        for (int x:newArray) {
            System.out.println(x);
        }
    }

    public static void printArray(int[]arr) {
        for (int x:arr) {
            System.out.println(x+" ");
        }
    }
    public static void swap(int[] array) {
        int tmp  = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main2(String[] args) {
        int[] array2={1,2,3,4,5};
        //printArray(array);
        int[]array1 = {0,1};
        swap(array1);
        for (int x:array1) {
            System.out.println(x);

        }

    }
    public static void main1 (String[]args) {
        int[] array = {1,2,3,4,};
        int len = array.length;
        System.out.println(len);
        for (int a:array) {
            System.out.println(a+" ");
        }
   }
}
