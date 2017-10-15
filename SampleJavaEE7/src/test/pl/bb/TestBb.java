package test.pl.bb;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class TestBb implements Serializable {

	String text1 = null;
	String text2 = null;

	public String test() {
		System.out.println("start test");
		text1 = "aaaa";
		text2 = "bbbb";
		System.out.println("end test");
		return "index.xhtml&faces?faces-redirect=true";
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
