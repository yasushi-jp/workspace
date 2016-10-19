package beans;

import javax.ejb.Singleton;

@Singleton
public class GlobalMemo {

	private String cache;	// Singletonで記録する文字列

	public String getCache() {
		return cache;
	}

	public void setCache(String cache) {
		this.cache = cache;
	}
}
