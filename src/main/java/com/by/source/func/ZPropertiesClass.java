/*
 * Copyright (c) 2017, BYZ. All rights reserved.
 * BYZ. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.by.source.func;

import java.util.Map;
import java.util.Properties;

/**
 * properties 文件操作类<br />
 * 
 * <p>
 * 1、单例模式取得properties对象，取得方式线程安全方式下取得、线程不安全方式下取得</p>
 * <p>
 * 2、可以获取对应的Map{@link #func(Map)}进行操作</P>
 * 
 * @author zwp
 * @version 0.0.1
 * @since JDK1.0
 *
 */
public class ZPropertiesClass {
    private static Properties properties;
    
    static {
        if(properties == null) {
            properties = new Properties();
        }
    }
    // http://blog.csdn.net/jason0539/article/details/23297037/
    // 1、流加载的方式加载properties文件
    // 2、直接加载文件
    
    // 转换为Map
    public static Map<String, Object> get$ToMap() {
        
        
        return null;
    }
    
    public static void init() {
        
    }
}