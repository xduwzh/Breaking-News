package com.hang.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * ThreadLocal 工具类
 */
@SuppressWarnings("all")
public class ThreadLocalUtil {
    //static threadlocal object
    private static final ThreadLocal THREAD_LOCAL = new ThreadLocal();

    //get tl value
    public static <T> T get(){
        return (T) THREAD_LOCAL.get();
    }
	
    //set tl value
    public static void set(Object value){
        THREAD_LOCAL.set(value);
    }


    //remove tl, prevent memory leak
    public static void remove(){
        THREAD_LOCAL.remove();
    }
}
