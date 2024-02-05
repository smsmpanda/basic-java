package com.rhtect.shortcutkey;

public class ShortCutKeyDemo {
    public static void main(String[] args) {
        int [] arr = {5,2,4,1,55512,12};
        arr = ArrayReverseV1(arr);
        Println(arr,"V1");

        arr = ArrayReverseV2(arr);
        Println(arr,"V2");
    }

    public  static  int[] ArrayReverseV1(int[]arr){
        int count = arr.length;
        for (int i = 0; i <= count/2-1; i++) {
            int c = arr[i];
            arr[i] = arr[count-i-1];
            arr[count-i-1] = c;
        }
        return  arr;
    }
    public  static  int[] ArrayReverseV2(int[]arr){
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
        return  arr;
    }

    public static  void Println(int[]arr,String title){
        System.out.println("---------------------"+title+ "------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
