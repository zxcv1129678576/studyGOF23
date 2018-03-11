package study.chenda.observers.SelfImplements;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class JavaNewsProvider extends Observable {

        private static final long DELAY = 2 * 1000;

        public JavaNewsProvider() {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                private int titleCount = 1;
                private int contentCount = 1;
                @Override
                public void run() {
                    setChanged(); //调用setChagned方法，将changed域设置为true，这样才能通知到观察者们
                    notifyObservers(new NewsModel("title:" + titleCount++, "content:" + contentCount++));
                }
            }, DELAY, 1000);
        }
}
