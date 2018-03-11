package study.chenda.observers.SelfImplements;


/**
 * 消息实体
 * @author chenda
 * @date Mar 11, 2018新建
 */
public class NewsModel {
	
	private String title;
	private String content;
	
	public NewsModel(String title,String content){
		this.title=title;
		this.content=content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
