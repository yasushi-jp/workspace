package beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TemplateBb implements Serializable {

	private String food;
	private Integer amount;


	public String next() {
		return "temp_output";
	}


	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
