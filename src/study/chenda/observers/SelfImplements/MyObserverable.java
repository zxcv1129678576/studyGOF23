/**
 *
 */
package study.chenda.observers.SelfImplements;

/**
 * 被观察者，可被观察接口
 *
 * @author chenda
 * @date Mar 11, 2018新建
 */
public interface MyObserverable {

    void register(MyObserver observer);

    void remove(MyObserver observer);

    void sendmessage(NewsModel news);
}
