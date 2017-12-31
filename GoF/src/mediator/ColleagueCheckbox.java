package mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Colleagueインターフェースを実装。チェックボックス（ここではラジオボタン）を表すクラス<BR>
 * <BR>
 * ConcleteColleague（具体的な同僚）の役<BR>
 * <PRE>
 * ConcleteColleague役は、Colleague役のインタフェース（API）を実装する。
 * </PRE>
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {

	/** 相談役 */
	private Mediator mediator;

	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
		super(caption, group, state);
	}

	@Override
	public void setMediator(Mediator mediator) {	// Mediatorを保持
		this.mediator = mediator;
	}

	@Override
	public void setClleagueEnabled(boolean enabled) {	// Mediatorから有効/無効が支持される
		setEnabled(enabled);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {		// 状態が変化したらMediatorに通知
		mediator.colleagueChanged();
	}

}
