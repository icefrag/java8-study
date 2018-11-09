package com.wurui.stream.map;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: wurui
 * @create: 2018-11-02 17:20
 **/
public class Main {
    public static void main(String[] args){
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        numbers1.stream().flatMap(i -> numbers2.stream().map(j -> Arrays.asList(i,j))).forEach(System.out::println);

    }
}
