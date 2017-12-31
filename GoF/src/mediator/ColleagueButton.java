package mediator;

import java.awt.Button;

/**
 * Colleagueインターフェースを実装。ボタンを表すクラス<BR>
 * <BR>
 * ConcleteColleague（具体的な同僚）の役<BR>
 * <PRE>
 * ConcleteColleague役は、Colleague役のインタフェース（API）を実装する。
 * </PRE>
 */
public class ColleagueButton extends Button implements Colleague {

	/** 相談役 */
	@SuppressWarnings("unused")
	private Mediator mediator;

	public ColleagueButton(String caption) {
		super(caption);
	}

	@Override
	public void setMediator(Mediator mediator) {	// Mediatorを保持
		this.mediator = mediator;
	}

	@Override
	public void setClleagueEnabled(boolean enabled) {	// Mediatorから有効/無効が支持される
		setEnabled(enabled);
	}

}
