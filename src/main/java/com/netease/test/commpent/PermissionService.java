package com.netease.test.commpent;

import com.netease.test.Validte.MyValidate;
import org.springframework.stereotype.Service;

/**
 * Created by hzjiaoguangcai on 2017/8/1.
 */
@Service
public class PermissionService {
    @Permission
    @MyValidate
    public void say(String name){
        System.out.println(name);
    }
}
