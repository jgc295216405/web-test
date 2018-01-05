package com.netease.test.controller;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

import java.util.concurrent.Callable;

public class RedisMain {
    private static final String HOST ="10.240.201.133";
    private static final int PORT=6379;
    private static final String PASS="admin";
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Publisher()).start();
        new Thread(new PubSub(new PubSubListener(new Callable() {
            @Override
            public Object call() throws Exception {
                return "我收到消息：";
            }
        }))).start();
        Thread.sleep(Long.MAX_VALUE);

    }
    static class Publisher implements Runnable{
        private static Jedis jedis=new Jedis(HOST,PORT);
        static {
            jedis.auth(PASS)  ;
        }
        public Publisher() {
        }

        @Override
        public void run() {

            try {
                for(int i=0;i<1000;i++){
                    jedis.publish("topic","msg"+i);
                    System.out.println("发布消息："+"msg"+i);
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class PubSub implements Runnable{
        private static Jedis jedis=new Jedis(HOST,PORT);
        static {
         jedis.auth(PASS)  ;
        }
        private JedisPubSub jedisPubSub;

        public PubSub(JedisPubSub jedisPubSub) {
            this.jedisPubSub=jedisPubSub;
        }

        @Override
        public void run() {
            jedis.subscribe(jedisPubSub,"topic");
        }
    }
    static class PubSubListener extends JedisPubSub{
        private Callable<String> callable;
        public PubSubListener(Callable callable) {
            this.callable=callable;
        }

        @Override
        public void onMessage(String channel, String message) {
            try {
                System.out.println(callable.call()+message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
