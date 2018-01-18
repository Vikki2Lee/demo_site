package com.vikki.myproject.common.utils;


import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionIdGenerator;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.UUID;

/**
 *  封装各种生成唯一性 ID 算法的工具类
 */
@Service
public class IdGen implements SessionIdGenerator{

    private static SecureRandom random = new SecureRandom();

    /**
     *  使用 SecureRandom 随机生成 Long
     * @return
     */
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","");
    }

    public static String randomBase62(int length){
        byte[] randomBytes = new byte[length];
        random.nextBytes(randomBytes);
        return Encodes.encodeBase62(randomBytes);
    }

    public Serializable generateId(Session session) {
        return IdGen.uuid();
    }
}
