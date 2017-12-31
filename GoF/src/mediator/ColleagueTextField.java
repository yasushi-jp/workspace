package mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Colleagueインターフェースを実装。テキスト入力を行うクラス<BR>
 * <BR>
 * ConcleteColleague（具体的な同僚）の役<BR>
 * <PRE>
 * ConcleteColleague役は、Colleague役のインタフェース（API）を実装する。
 * </PRE>
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {

	/** 相談役 */
	private Mediator mediator;

	public ColleagueTextField(String text, int columns) {	// コンストラクタ
		super(text, columns);
	}

	@Override
	public void setMediator(Mediator mediator) {	// Mediatorを保持
		this.mediator = mediator;
	}

	@Override
	public void setClleagueEnabled(boolean enabled) {	// Mediatorから有効/無効が支持される
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	@Override
	public void textValueChanged(TextEvent e) {	// 文字列が変化したらMediatorに通知
		mediator.colleagueChanged();
	}

}
