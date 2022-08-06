package com.ghaoi.junit_test.suite_test;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

// 测试套件 - 将我们指定的测试用例都执行起来
// 1. 选择指定类添加到套件中执行
//@Suite
//@SelectClasses({AssertTest.class, SequenceTest.class})
//public class SuiteTest {
//
//}

// 2. 选择指定包名添加到套件中执行
@Suite
@SelectPackages("com.ghaoi.junit_test.sequence_test")
public class SuiteTest {

}
