package com.niuke.a_find;

public class Main {
    public boolean Find(int target, int[][] array) {
        int r = 0, c = array[0].length - 1;
        while (r < array.length && c >= 0) {
            if (target > array[r][c]) r++;
            else if (target < array[r][c]) c--;
            else return true;
        }
        return false;
    }
}
