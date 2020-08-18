package com.niuke.i_JumpFloorII;

public class Main {
    public static void main(String[] args) {

    }
    public int JumpFloorII(int target) {
        int ret =0;
        for(int i=target-1;i>=1;i--){
            ret+=i;
        }
        return ret+1;
    }
}
