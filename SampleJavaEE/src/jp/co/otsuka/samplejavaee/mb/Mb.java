package jp.co.otsuka.samplejavaee.mb;

import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import jp.co.otsuka.samplejavaee.bb.Bb;

/**
 * @author yasushi
 *
 */
@Named
@RequestScoped
public class Mb {

	@Inject
	private Bb bb;

	/**
	 *@return 次の画面（チェック有り）
	 */
	public String next() {

		return "output.xhtml";
	}

	/**
	 *@return 次の画面（チェック無し）
	 */
	public String next2() {

		Map<String, String> map = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		bb.setFood((String)map.get("food"));
		bb.setAmount(Double.parseDouble(map.get("amount")));
//		food = (String)map.get("food");
//		amount = Double.parseDouble(map.get("amount"));
		return "output.xhtml";
	}

//	/**
//	 * @return bb
//	 */
//	public Bb getBb() {
//		return bb;
//	}
//
//	/**
//	 * @param bb セットする bb
//	 */
//	public void setBb(Bb bb) {
//		this.bb = bb;
//	}



}
