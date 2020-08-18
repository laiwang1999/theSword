package com.niuke.h_JumpFloor;

public class Main {
    public static void main(String[] args) {
        System.out.println(JumpFloor(5));
    }
    public static int JumpFloor(int target) {
        int[] arr = new int[100];
        arr[0]=1;
        arr[1]=1;
        if(target==1){
            return 1;
        }
        for (int i = 2; i <= target; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[target];
    }
}
