package com.wurui;

import java.util.*;
import static java.util.stream.Collectors.toList;
public class Stream {
    public static void main(String[] args){
        List<Student> students = Arrays.asList(new Student("小王",15,95),
                    new Student("小白",15,55),
                    new Student("小花",16,90),
                    new Student("小黑",17,60));

        // 取成绩大于80的人,按成绩正序

        // 1.传统写法
        List<Student> filterStudents = new ArrayList<>();
        students.forEach(student -> {
            if (student.getScore() >= 80){
                filterStudents.add(student);
            }
        });

        // 排序
        Collections.sort(filterStudents,(s1,s2) -> s1.getScore() - s2.getScore());

        filterStudents.forEach(n -> System.out.println(n.getName()));
        System.out.println("=======================================");
        // 2.流写法
        students = Arrays.asList(new Student("小王",15,95),
                new Student("小白",15,55),
                new Student("小花",16,90),
                new Student("小黑",17,60));
        List<String> names = students.stream()
                .filter(s -> s.getScore() >= 80)
                .sorted((o1, o2) -> o1.getScore() - o2.getScore())
                .map(student -> student.getName())
                .collect(toList());

        names.forEach(n -> System.out.println(n));

        // 求所有age的和
        // 开始值,和计算的BinaryOperator
        int max = students.stream().map(n -> n.getAge()).reduce(0,Integer::max);
        System.out.println(max);
        int min = students.stream().map(n -> n.getAge()).reduce(0,Integer::min);
        System.out.println(min);

    }

}
