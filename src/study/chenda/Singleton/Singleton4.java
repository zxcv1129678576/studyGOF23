package study.chenda.Singleton;

/*
 * 静态内部类加载，在调用时时才加载，实现了懒加载，第一次加载是存在实例化过久问题；
 */

public class Singleton4 {
    private Singleton4() {

    }

    public static Singleton4 getinstance() {
        return Singleton4Holder.instance;

    }

    private static class Singleton4Holder {

        private static final Singleton4 instance = new Singleton4();
    }


}
