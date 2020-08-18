package com.niuke.g_Fibonacci;

public class Main {
    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
    }
    public static int Fibonacci(int n) {
        int[] array = new int[40];
        array[0]=0;
        array[1]=1;
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        for(int i=2;i<=n;i++){
            array[i]=array[i-1]+array[i-2];
        }
        return array[n];
    }
}
