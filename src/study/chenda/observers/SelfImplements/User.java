/**
 *
 */
package study.chenda.observers.SelfImplements;

/**
 * @author chenda
 * @date Mar 11, 2018新建
 */
public class User implements MyObserver {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receiveNews(NewsModel news) {
        // TODO Auto-generated method stub
        System.out.println(name + "接收到的Title:" + news.getTitle());
        System.out.println(name + "接收到的Content:" + news.getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
