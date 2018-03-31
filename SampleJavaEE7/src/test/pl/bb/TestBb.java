package test.pl.bb;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import test.fw.utils.MyRunnableTask;

@Named
@SessionScoped
public class TestBb implements Serializable {

	@Resource
	ManagedExecutorService managedExecsvc;

	String text1 = null;
	String text2 = null;

	public String test() {
		System.out.println("start test");
		text1 = "aaaa";
		text2 = "bbbb";
		System.out.println("end test");
		return "index.xhtml?faces-redirect=true";
	}

	public String validation1() {
		return "validation1.xhtml?faces-redirect=true";
	}

	public String validation2() {
		return "validation2.xhtml?faces-redirect=true";
	}

	public String validation3() {
		return "validation3.xhtml?faces-redirect=true";
	}

	public String validation4() {
		return "validation4.xhtml?faces-redirect=true";
	}

	public String validation5() {
		return "validation5.xhtml?faces-redirect=true";
	}

	public String validation6() {
		return "validation6.xhtml?faces-redirect=true";
	}

	public String validation7() {
		return "validation7.xhtml?faces-redirect=true";
	}

	public String execExecutorService() {
	      MyRunnableTask task = new MyRunnableTask();
	      managedExecsvc.submit(task);
	      System.out.println("メソッド終了");
	      return null;
	}

	/**
	 * @return text1
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * @param text1 セットする text1
	 */
	public void setText1(String text1) {
		this.text1 = text1;
	}

	/**
	 * @return text2
	 */
	public String getText2() {
		return text2;
	}

	/**
	 * @param text2 セットする text2
	 */
	public void setText2(String text2) {
		this.text2 = text2;
	}


}
