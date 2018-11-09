package com.wurui.function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wurui
 * @create: 2018-10-31 15:14
 **/
public class Main {
    public static String processFile(BufferedReaderProcessor p)throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\wurui\\Desktop\\腾云\\readme.txt"))){
            return p.process(br);
        }
    }

    public static void main(String[] args){
        /*
        try {
            String s = Main.processFile(b -> b.readLine() + b.readLine());
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        Person person = new Person();
        person.setName("a");
        Person person1 = new Person();
        person1.setName("b");
        Person person2 = new Person();
        person2.setName("c");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);

        persons.forEach(System.out::println);

    }
}
