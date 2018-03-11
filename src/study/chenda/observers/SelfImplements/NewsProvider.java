package study.chenda.observers.SelfImplements;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author chenda
 * @date Mar 11, 2018新建 
 */
public class NewsProvider implements MyObserverable{
	private static final long DELAY=2000;
	private List<MyObserver> observers ;
	
	
	public NewsProvider(){
		observers = new ArrayList<MyObserver>();
        generateNews();
	}
	
	/**
     * 模拟产生新闻，每个2s发送一次
     */
    private void generateNews() {
        Timer timer = new Timer();
        
        timer.schedule(new TimerTask() {
            int titleCount = 1;
            int contentCount = 1;

            @Override
            public void run() {
            	sendmessage(new NewsModel("title:" + titleCount++, "content:" + contentCount++));
            }
        }, DELAY, 1000);
    }


	@Override
	public void register(MyObserver observer) {
		// TODO Auto-generated method stub
		if(observer==null){
			return;
		}
		synchronized (this) {
		     if (!observers.contains(observer))
		    	 observers.add(observer);
	        }
			
		}
		
	@Override
	public void remove(MyObserver observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}


	@Override
	public void sendmessage(NewsModel news) {
		// TODO Auto-generated method stub
		for(MyObserver observer:observers){
			observer.receiveNews(news);
		}
		
	}

}
