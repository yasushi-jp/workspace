package test.fw;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@Named(value="JsfCustom")
@ApplicationScoped
public class JsfCustomValidation implements Serializable {

	public void validateLength(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return;
		}
		String text = value.toString();
		if (text.length() < 2 || text.length() > 5) {
			throw new ValidatorException(new FacesMessage("2文字以上、5文字以下で入力してください。"));
		}
	}

	public void validateLongRange(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return;
		}
		if (value instanceof Integer) {
			int i = ((Integer) value).intValue();
			if (i < 10 || i > 100) {
				throw new ValidatorException(new FacesMessage("10以上、100以下で入力してください。"));
			}
		} else if (value instanceof Long) {
			long l = ((Long) value).longValue();
			if (l < 10 || l > 100) {
				throw new ValidatorException(new FacesMessage("10以上、100以下で入力してください。"));
			}
		} else {
			throw new ValidatorException(new FacesMessage("10以上、100以下で入力してください。"));
		}
	}

}
