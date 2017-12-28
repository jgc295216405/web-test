package com.netease.test.model;

import com.netease.test.model.Mo.RegularString;
import com.netease.test.model.Mo.RuleType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzjiaoguangcai on 2017/6/22.
 */
public class JniDemo {
    //使用JAVAH命令生成包含native方法定义的C/C++头文件。
    //该命令需要使用JDK/bin目录下javah.exe
//    public native void sayHello(int RuleJudgement,boolean b);
    static {   System.loadLibrary("demo");   };

    /**
     * @param args
     */
    public static void main(String[] args) {
        JniDemo jniDemo = new JniDemo();
        System.out.println(System.getProperty("java.library.path"));
//        jniDemo.sayHello(100,false);
    }
    /**
     * 计算子串规则
     *
     * @param str
     * @return
     */
   
}