package study.chenda.Singleton;

public class Singleton6 {
    private volatile static Singleton6 instance;

    private Singleton6() {

    }

    public static Singleton6 getinstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                instance = new Singleton6();
            }
        }

        return instance;
    }

}
