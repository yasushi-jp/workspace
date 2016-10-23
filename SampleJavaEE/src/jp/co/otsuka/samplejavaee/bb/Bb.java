package jp.co.otsuka.samplejavaee.bb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author yasushi
 *
 */
@Named
@RequestScoped
public class Bb {

	private String food;
	private Double amount;


	/**
	 * @return food
	 */
	public String getFood() {
		return food;
	}
	/**
	 * @param food セットする food
	 */
	public void setFood(String food) {
		this.food = food;
	}
	/**
	 * @return amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount セットする amount
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}


}
