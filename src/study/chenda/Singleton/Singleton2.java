package study.chenda.Singleton;

public class Singleton2 {
	private static Singleton2 instance;
	
	private  Singleton2(){
		
	}
	//此加锁，确保方法内步骤完整一致，懒汉模式
	public synchronized static Singleton2 getSingleton1(){
		
		if(instance==null){
			instance=new Singleton2();
		}
		
		return instance;
		
	}
}
