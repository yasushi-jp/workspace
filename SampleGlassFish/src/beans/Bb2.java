package beans;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named
@RequestScoped
public class Bb2 {

	private boolean mail;
	private Integer[] cities;
	private Integer[] cities2;
	private Integer[] cities3;
	private Integer[] cities4;
	private Integer[] cities5;
	private Integer city;
	private Integer city2;
	private Integer city3;

	private static Map<String, Integer> items;
	static {
		items = new LinkedHashMap<>();
		items.put("東京", 1);
		items.put("大阪", 2);
		items.put("福岡", 3);
	}

	public Map<String, Integer> getItems() {
		return items;
	}

	private static SelectItem[] items2 = {
		new SelectItem(1, "東京"),
		new SelectItem(2, "大阪"),
		new SelectItem(3, "福岡")
	};

	public SelectItem[] getItems2() {
		return items2;
	}

	private static Map<String, Integer> items3;
	static {
		items3 = new LinkedHashMap<>();
		items3.put("札幌", 1);
		items3.put("仙台", 2);
		items3.put("東京", 3);
		items3.put("大阪", 4);
		items3.put("福岡", 5);
		items3.put("沖縄", 6);
	}

	public Map<String, Integer> getItems3() {
		return items3;
	}

	public String next() {
		return "output_select";
	}

	@Override
	public String toString() {
		return Arrays.toString(cities);
	}

	public String toString2() {
		return Arrays.toString(cities2);
	}

	public String toString3() {
		return Arrays.toString(cities3);
	}

	public String toString4() {
		return Arrays.toString(cities4);
	}

	public String toString5() {
		return Arrays.toString(cities5);
	}

	public boolean isMail() {
		return mail;
	}

	public void setMail(boolean mail) {
		this.mail = mail;
	}

	public Integer[] getCities() {
		return cities;
	}

	public void setCities(Integer[] cities) {
		this.cities = cities;
	}

	public Integer[] getCities2() {
		return cities2;
	}

	public void setCities2(Integer[] cities2) {
		this.cities2 = cities2;
	}

	public Integer[] getCities3() {
		return cities3;
	}

	public void setCities3(Integer[] cities3) {
		this.cities3 = cities3;
	}


	public Integer[] getCities4() {
		return cities4;
	}

	public void setCities4(Integer[] cities4) {
		this.cities4 = cities4;
	}


	public Integer[] getCities5() {
		return cities5;
	}

	public void setCities5(Integer[] cities5) {
		this.cities5 = cities5;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getCity2() {
		return city2;
	}

	public void setCity2(Integer city2) {
		this.city2 = city2;
	}

	public Integer getCity3() {
		return city3;
	}

	public void setCity3(Integer city3) {
		this.city3 = city3;
	}


}
