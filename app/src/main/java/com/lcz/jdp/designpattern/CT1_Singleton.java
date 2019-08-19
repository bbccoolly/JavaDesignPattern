package com.lcz.jdp.designpattern;

/**
 * desc: 单例模式 -
 * date: 2019/8/16 12:15 by lcz
 */
public class CT1_Singleton {

    /**应用场景：
     * 1. 某类只要求生成一个对象的时候，如一个班的班长，个人的身份证号
     * 2. 对象需要被共享的场合，节省内存加快访问速度，数据库的连接池
     * 3. 某类需要频繁实例化，而创建的对象又频繁被销毁，如 多线程的线程池，网络连接池
     */

    private static CT1_Singleton instance;

    public static synchronized CT1_Singleton getInstance() {
        if (instance == null) {
            instance = new CT1_Singleton();
        } else {
            //已存在该 单例对象
        }
        return instance;
    }


    /**
     * 1. 懒汉单例 - 当第一次调用 getInstance 时才会创建该单例
     */
    public static class LazySingleton {
        //保证线程同步，避免线程安全问题，但会耗性能资源
        private static volatile LazySingleton instance = null;

        private LazySingleton() {

        }

        public static synchronized LazySingleton getInstance() {
            if (instance == null) {
                instance = new LazySingleton();
            }
            return instance;
        }

    }

    /**
     * 2. 饿汉单例 - 类一加载就创建一个单例
     */

    public static class HungrySingleton {

        //类在创建的同时，就已经创建好一个静态的对象，以后不再改变，线程安全，可直接用于多线程
        private static final HungrySingleton instance = new HungrySingleton();

        private HungrySingleton() {

        }

        public static HungrySingleton getInstance() {
            return instance;
        }
    }

}
