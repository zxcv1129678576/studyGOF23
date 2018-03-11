/**
 * 
 */
package study.chenda.observers.SelfImplements;

/**
 * @author chenda
 * @date Mar 11, 2018新建 
 */
public class Test {
	
	public static void main(String[] args) {
		NewsProvider provider=new NewsProvider();
		for (int i = 0; i < 5; i++) {
			
			provider.register(new User("用户"+i));
		}
		
		
	}
	
}
