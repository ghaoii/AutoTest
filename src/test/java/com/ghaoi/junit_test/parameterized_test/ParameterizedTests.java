package com.ghaoi.junit_test.parameterized_test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import javax.xml.namespace.QName;
import java.util.stream.Stream;

public class ParameterizedTests {
    @ParameterizedTest
    @ValueSource(strings = {"test1", "test2", "test3", "test4"})
    void stringTest(String name) {
        System.out.println("name = " + name);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void intTest(int num) {
        System.out.println("num = " + num);
    }

    // 多参数
//    @ParameterizedTest
//    @CsvSource(value = {"'Har,ley', 18", "Taylor, 20", "Lana, 25"})
//    void stringAndIntTest1(String name, int age) {
//        System.out.println("name = " + name + ", age = " + age);
//    }
//
//    @ParameterizedTest
//    @CsvSource(value = {" - 18", "Taylor - ", "Lana - 25"}, delimiter = '-')
//    void stringAndIntTest2(String name, int age) {
//        System.out.println("name = " + name + ", age = " + age);
//    }
//

    // 文档注入
//    @ParameterizedTest
//    @CsvFileSource(resources = "/test.csv")
//    void fileTest(String name, int age) {
//        System.out.println("name = " + name + ", age = " + age);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(files = "/Users/harley/Desktop/code/autoTest/test.csv")
//    void fileTest2(String name, int age) {
//        System.out.println("name = " + name + ", age = " + age);
//    }

//    // 提供参数的静态方法, 返回值可以是Stream流, 也可以是String[]
//    static Stream<String> origin() {
//        return Stream.of("Taylor", "Harley", "Dua");
//    }
//
//    // 动态参数
//    @ParameterizedTest
//    @MethodSource("origin")// 传入静态方法名
//    void dynamicParameterTest1(String name) {
//        System.out.println("name = " + name);
//    }
//
//    static String[] dynamicParameterTest2() {
//        return new String[]{"harley", "taylor"};
//    }
//
//    @ParameterizedTest
//    @MethodSource// 传入静态方法名
//    void dynamicParameterTest2(String name) {
//        System.out.println("name = " + name);
//    }

//    static Stream<Arguments> dynamicParameterTest3() {
//        return Stream.of(Arguments.arguments("harley", 18), Arguments.arguments("Taylor", 20));
//    }
//
//    @ParameterizedTest
//    @MethodSource// 传入静态方法名
//    void dynamicParameterTest3(String name, int age) {
//        System.out.println("name = " + name + ", age = " + age);
//    }
}
