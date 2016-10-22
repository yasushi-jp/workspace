package jp.co.otsuka.samplejavaee.mb;

import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
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
	 *@return 次の画面
	 */
	public String next() {

		Map<String, String> map = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		food = (String)map.get("food");
		amount = Double.parseDouble(map.get("amount"));
		return "output.xhtml";
	}

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
