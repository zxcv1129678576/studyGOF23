package study.chenda.Singleton;

/**
 * @author Administrator
 * 懒汉模式，线程不安全。
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {

    }

    //此处未加锁，的那个实例为空，创建时，无法确保拿到对象的完整性。
    public static Singleton1 getSingleton1() {

        if (instance == null) {
            instance = new Singleton1();
        }

        return instance;

    }

}
