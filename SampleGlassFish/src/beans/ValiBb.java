package beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

@Named
@RequestScoped
public class ValiBb implements Serializable {

	private String code;
	private Integer amount;
	private BigDecimal rate;
	private Date date;

	public String next() {
		return "vali_output";
	}

	@IdPattern(from=2014, to=2018, item="ID")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	@Min(100)
	@Max(10000)
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@DecimalMax("20.5")
	@DecimalMin("0.5")
	@Digits(integer=2, fraction=2)
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	@Past
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
