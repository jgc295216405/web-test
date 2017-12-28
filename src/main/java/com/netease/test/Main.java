package com.netease.test;

import com.netease.test.model.People;
import org.apache.commons.lang3.reflect.FieldUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hzjiaoguangcai on 2017/5/12.
 */
public class Main {
    private int anInt;
    private People people;
    public static void main(String[] args) {
        String [] s=getFieldsName(Main.class);
        for (String s1:s){
            System.out.println(s1);
        }
    }

    public static String[] getFieldsName(Class clazz) {
        Field[] fields = FieldUtils.getAllFields(clazz);
        Set<String> fieldNameSet = new HashSet<String>();
        for (int i = 0; i < fields.length; i++) {

            // 过滤掉 final 和 static
            int modifier = fields[i].getModifiers();
            if (Modifier.isFinal(modifier) || Modifier.isStatic(modifier)) {
                continue;
            }
            fieldNameSet.add(fields[i].getName());
        }
        String[] fieldNames = new String[fieldNameSet.size()];
        return fieldNameSet.toArray(fieldNames);
    }


}
