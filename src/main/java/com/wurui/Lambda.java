package com.wurui;

public class Lambda {
    public static void main(String[] args){
        new Thread(() -> System.out.println("hello world")).start();
    }
}
