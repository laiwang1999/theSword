package com.niuke.b_replaceSpace;

public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello world");
        System.out.println(replaceSpace(str));
    }
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ","%20");
    }
}
