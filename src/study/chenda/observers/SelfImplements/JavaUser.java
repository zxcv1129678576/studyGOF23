package study.chenda.observers.SelfImplements;

import java.util.Observable;
import java.util.Observer;

public class JavaUser implements Observer {
    private String mName;

    public JavaUser(String name) {
        mName = name;
    }

    @Override
    public void update(Observable observable, Object data) {
        NewsModel model = (NewsModel) data;
        System.out.println(mName + " receive news:" + model.getTitle() + "  " + model.getContent());
    }
}
