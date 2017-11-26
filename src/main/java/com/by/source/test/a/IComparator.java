package com.by.source.test.a;

/**
 *
 * 借鉴STL标准库模板
 *
 * 设置一个比较器的接口
 *
 * @author zwp
 */
public interface IComparator<T> {
    boolean equal(T x, T y);
    boolean less(T x, T y);
}
