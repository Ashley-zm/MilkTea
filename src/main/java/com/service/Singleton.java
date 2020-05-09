package com.service;

public class Singleton {
//    设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。
/***单例模式
 * 定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
 */
    private  Singleton(){
        //private 避免类在外部被实例化
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
 * 3.同步方法块，锁是括号里面的对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁。
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
}
