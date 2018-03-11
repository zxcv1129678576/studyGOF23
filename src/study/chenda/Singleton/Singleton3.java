package study.chenda.Singleton;

public class Singleton3 {

    //直接创建实例，预占内存开销。存在弊端，不适用于初始化时间过长的场景
    //饿汉模式
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getSingleton1() {

        return instance;

    }
}
