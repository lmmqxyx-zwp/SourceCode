package com.by.source.dp.iaac.methodframework;

/**
 * 框架程序若获得具体的应用，则必须实现接口的子类
 * 整型数比较器
 */
public class InteLess implements ILess<Integer> {

    public boolean less(Integer x, Integer y) {
        return x < y;
    }
}

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

class StudentLess implements ILess<Student> {
    public boolean less(Student x, Student y) {
        return x.grade < y.grade;
    }
}