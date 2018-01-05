package com.netease.test.controller;

import redis.clients.jedis.Jedis;

import java.io.*;

/**
 * Created by hzjiaoguangcai on 2017/6/21.
 */
public class MyJedisPool {
    public interface JedisAction {
        Object action(Jedis jedis);
    }

    public interface JedisActionVoid {
        void action(Jedis jedis) throws IOException;
    }

    public static Object execute(JedisAction jedisAction) {
        Jedis jedis = RedisUtil.getJedis();
        Object o = null;
        try {
            o = jedisAction.action(jedis);
        } catch (Exception e) {

        } finally {
            jedis.close();
        }
        return o;
    }

    public static void execute(JedisActionVoid jedisAction) {
        Jedis jedis = RedisUtil.getJedis();

        try {
            jedisAction.action(jedis);
        } catch (Exception e) {

        } finally {
            jedis.close();
        }

    }



    public static byte[] getStream(Object o) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(outputStream);
            oout.writeObject(o);
            return outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oout != null)
                try {
                    oout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return null;
    }

    public static Object getObject(byte[] bytes) throws IOException {
        ByteArrayInputStream bais;
        try {
            bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Object get(final String key) {
        return execute(new JedisAction() {
            public Object action(Jedis jedis) {
                Object o = null;
                byte[] vs = jedis.get(key.getBytes());
                if (null != vs) {
                    try {
                        o = getObject(vs);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                return o;
            }
        });
    }
    public static void set(final String key, final Object value) {

        execute(new JedisActionVoid() {
            public void action(Jedis jedis) throws IOException {
                if (key == null) {
                    return;
                }
                jedis.set(key.getBytes(), getStream(value));
            }
        });
    }

    public static void setExpired(final String key, final int time) {
        execute(new JedisActionVoid() {
            public void action(Jedis jedis) {
                jedis.expire(key, time);
            }
        });
    }
}
