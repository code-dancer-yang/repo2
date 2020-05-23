package com.css.apps;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lambda表达式练习
 * 需求：
 * 使用数组存储多个person对象
 * 根据数组中person对象的年纪进行排序
 */
public class LambdaTest {
    public static void main(String[] args) {
        Person[] arr={
                new Person("大鹏",15),
                new Person("刘艳",16),
                new Person("王凯",27),
                new Person("张扬",23)
        };
        //对数组中的person根据年龄大小进行升序排序（前边-后边）
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        Arrays.sort(arr, (o1, o2) -> o1.getAge()-o2.getAge());
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
