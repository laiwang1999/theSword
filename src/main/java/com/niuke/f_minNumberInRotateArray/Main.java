package com.niuke.f_minNumberInRotateArray;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(array));
    }
    public static int minNumberInRotateArray(int [] array) {
        int l = 0;
        int r = array.length-1;
        while(l<r){
            if(array[l]<array[r])return array[l];
            int mid = l +(r-l)/2;
            if(array[mid]>array[r]){
                l=mid+1;
            }else if(array[mid]<array[r]){
                r=mid;
            }else{
                r--;
            }
        }
        return array[l];
    }
}
