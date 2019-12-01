package test.pl;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class TestBackingBean implements Serializable {

	private String name1;
	private String name2;
	private String text1;
	private String text2;
	private String sporta;
	private String sportb;
	/**
	 * @return name1
	 */
	public String getName1() {
		return name1;
	}
	/**
	 * @param name1 セットする name1
	 */
	public void setName1(String name1) {
		this.name1 = name1;
	}
	/**
	 * @return name2
	 */
	public String getName2() {
		return name2;
	}
	/**
	 * @param name2 セットする name2
	 */
	public void setName2(String name2) {
		this.name2 = name2;
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
