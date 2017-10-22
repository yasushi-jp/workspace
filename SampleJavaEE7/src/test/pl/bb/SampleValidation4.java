package test.pl.bb;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Named
@SessionScoped
public class SampleValidation4 implements Serializable {

	@Size(min=2, max=5)
	private String input1;

	@Min(10)
	@Max(100)
	private Integer input2;

	private String label = "NG";

	public String execute() {
		label = "OK";
		return null;
	}

	public String back() {
		return "index.xhtml?faces-redirect=true";
	}

	/**
	 * @return input1
	 */
	public String getInput1() {
		return input1;
	}
	/**
	 * @param input1 セットする input1
	 */
	public void setInput1(String input1) {
		this.input1 = input1;
	}
	/**
	 * @return input2
	 */
	public Integer getInput2() {
		return input2;
	}
	/**
	 * @param input2 セットする input2
	 */
	public void setInput2(Integer input2) {
		this.input2 = input2;
	}

	/**
	 * @return label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label セットする label
	 */
	public void setLabel(String label) {
		this.label = label;
	}


}
