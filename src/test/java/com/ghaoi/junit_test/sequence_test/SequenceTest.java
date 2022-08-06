package com.ghaoi.junit_test.sequence_test;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SequenceTest {
    @Test
    @Order(1)
    void test1() {
        System.out.println("这是方法1");
    }

    @Test
    @Order(2)
    void testTwo() {
        System.out.println("这是方法2");
    }

    @Test
    @Order(3)
    void test3() {
        System.out.println("这是方法3");
    }

    @Test
    @Order(4)
    void testFour() {
        System.out.println("这是方法4");
    }
}
