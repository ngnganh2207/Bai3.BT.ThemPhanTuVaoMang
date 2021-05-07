package com.company;

import java.util.Scanner;

public class Main {
    public static int[] insertArray(int[] arr, int num, int index){
        int [] a = new int[arr.length+1];
        for( int i=arr.length-1;i>=index;i--){
            a[i+1]= arr[i];
        }
        a[index]=num;
        for (int i=0; i<index;i++) {
            a[i]=arr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] arr= {10,4,6,7,8,6,0,0,0,0};
        System.out.println("Nhập phần tử cần chèn: ");
        int num= scanner.nextInt();
        System.out.println("Nhập chỉ số index cần chèn: ");
        int index= scanner.nextInt();
        if(index<0 || index>=(arr.length-1)){
            System.out.println("Không chèn được phần tử vào mảng");
        }else {
            arr = insertArray(arr,num,index);
            for(int j=0; j<arr.length;j++){
                System.out.println(arr[j]);
            }

        }
    }
}
