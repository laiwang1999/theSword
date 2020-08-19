package com.niuke.j_RectCover;

public class Main {
    public static void main(String[] args) {

    }
    public int RectCover(int target) {
        int[] f = new int[100];
        f[1]=1;
        f[2]=2;
        for (int i =3; i <= target; i++) {
            f[i]=f[i-1]+f[i-2];
        }
        return f[target];
    }
}
