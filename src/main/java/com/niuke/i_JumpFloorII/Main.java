package com.niuke.i_JumpFloorII;

public class Main {
    public static void main(String[] args) {
        System.out.println(JumpFloorII(2));
    }
    public static int JumpFloorII(int target) {
        int[] arr = new int[100];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i <=target ; i++) {
            for(int j=0;j<i;j++){
                arr[i]=arr[i]+arr[j];
            }
        }
        return arr[target];
    }
}
