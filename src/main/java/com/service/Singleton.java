package com.service;

import javax.websocket.Session;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Singleton {
//    设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。
/***单例模式
 * 定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
 */
    private  Singleton(){
        //private 避免类在外部被实例化
        // 存储已经登录成功的账号信息（什么样的java数据结构）
        /**
         * 四种群集：
         * 1.直接存取群集（数组、ArrayList）
         * 2.顺序存储群集（以线性为主，主要是栈、队列）
         * 3.层群集（二维及以上的结构，比如二维数组、HashMap、三维数组、树）
         * 4.组群集（链表、链对链、用链表构建的数组集合、图）
         *
         * */
//        实例化
        this.userrol=new HashMap<String, Session>();
    }
    private static Singleton s;
/***
 * synchronized
 *
 * 1.存在共享数据
 * 2.多线程共同操作共享数据。关键字synchronized可以保证在同一时刻，
 * 只有一个线程可以执行某个方法或某个代码块，同时synchronized可
 * 以保证一个线程的变化可见（可见性），即可以代替volatile。
 *
 * 实现原理
 * synchronized可以保证方法或者代码块在运行时，同一时刻只有一个方法可
 * 以进入到临界区，同时它还可以保证共享变量的内存可见性
 *
 *三种应用方式
 * Java中每一个对象都可以作为锁，这是synchronized实现同步的基础：
 * 1.普通同步方法（实例方法），锁是当前实例对象 ，进入同步代码前要获得当前实例的锁
 * 2.静态同步方法，锁是当前类的class对象 ，进入同步代码前要获得当前类对象的锁
 * 3.同步方法块，锁是括号里面的对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁
 *
 * Synchronized解决并发问题
 * synchronized 修饰实例方法
 * 曾经的分为懒汉式和饿汉式
 * */
    public synchronized static Singleton getsl(){
//        getsl方法前加同步
        if (s==null){
            s=new Singleton();
        }
        return s;
    }
//    创建了泛型 hashmap，如果使用int报错，其实java没有int类型，在底层都转化成Integer
//    类型转换耗费资源
    private Map<String, Session> userrol;

//    解决：多线程并发的问题
    public synchronized void saveuser(String uid,Session session){
        this.userrol.put(uid,session);
    }

//查询用户是否已经登录
    public synchronized Boolean isol(String uid){
        Session s1=this.userrol.get(uid);
        if (s1==null){
            return true;
        }else {
            return false;
        }
    }

//    点对点发送消息
    public synchronized void sendmsg(String uid,String msg) {
        Session s1= this.userrol.get(uid) ;
        try {
            s1.getBasicRemote().sendText(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void removeuser(String uid){
        this.userrol.remove(uid);
    }

//    群发
    public synchronized void  qunfa(String msg){
        return;
    }
}
