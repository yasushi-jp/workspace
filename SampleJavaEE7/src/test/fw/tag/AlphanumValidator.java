package test.fw.tag;

import javax.faces.application.FacesMessage;
import javax.faces.component.PartialStateHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import test.fw.utils.CheckUtils;

/**
 * 半角英数字バリデーション
 */
@FacesValidator("alphanumValid")
public class AlphanumValidator implements Validator, PartialStateHolder {

	private Boolean onlyNumber;

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (context == null) throw new NullPointerException();
		if (component == null) throw new NullPointerException();
		if (value == null) return;

		if (onlyNumber == null) onlyNumber = false;

		String text = value.toString();
		if (!CheckUtils.checkAlphanum(text, onlyNumber)) {
			//メッセージ取得
			FacesMessage fm = new FacesMessage("半角英数で入力してください。");
			throw new ValidatorException(fm);
		}
	}

	@Override
	public Object saveState(FacesContext context) {
		if (context == null) throw new NullPointerException();
		Object values[] = new Object[3];
		values[0] = this.onlyNumber;
		return values;
	}

	@Override
	public void restoreState(FacesContext context, Object state) {
		if (context == null) throw new NullPointerException();
		if (state != null) {
			Object values[] = (Object[]) state;
			this.onlyNumber = (Boolean) values[0];
		}
	}

	private boolean transientValue = false;
	private boolean initialState;

	@Override
	public boolean isTransient() {
		return transientValue;
	}
	@Override
	public void setTransient(boolean transientValue) {
		this.transientValue = transientValue;
	}

	@Override
	public void markInitialState() {
		this.initialState = true;
	}

	@Override
	public boolean initialStateMarked() {
		return this.initialState;
	}

	@Override
	public void clearInitialState() {
		this.initialState = false;
	}
}