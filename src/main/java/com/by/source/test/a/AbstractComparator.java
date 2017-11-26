package com.by.source.test.a;

/**
 *
 * @author zwp
 *
 * @param <T>
 */
public class AbstractComparator<T> implements IComparator<T> {
    public boolean equal(T x, T y) {
        return true;
    }
    public boolean less(T x, T y) {
        return true;
    }
}
