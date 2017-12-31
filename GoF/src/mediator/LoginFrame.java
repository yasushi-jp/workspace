package mediator;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Mediatorインターフェースを実装。ログインダイアログを表すクラス<BR>
 * <BR>
 * ConcreteMediator（具体的な調停者、仲介者）の役<BR>
 * <PRE>
 * ConcleteMadiator役は、Mediator役のインタフェース（API）を実装し、実際の調整を行う。
 * </PRE>
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;

	// コンストラクタ
	// Colleagueたちを生成し、配置した後に表示を行う
	public LoginFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		// レイアウトマネージャを使って４×２のグリッドを作る
		setLayout(new GridLayout(4, 2));
		// Colleagueたちの生成
		createColleagues();
		// 配置
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username:"));
		add(textUser);
		add(new Label("Password:"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		// 有効/無効の初期設定
		colleagueChanged();
		// 表示
		pack();
		setVisible(true);
	}

	@Override
	public void createColleagues() {
		// 生成
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		// Mediatorのセット
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		// Listenerのセット
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	// Colleagueからの通知で各Colleagueの有効/無効を判定する
	@Override
	public void colleagueChanged() {
		if (checkGuest.getState()) {	// Guestモード
			textUser.setClleagueEnabled(false);
			textPass.setClleagueEnabled(false);
			buttonOk.setClleagueEnabled(true);
		} else {						// Loginモード
			textUser.setClleagueEnabled(true);
			userpassChanged();
		}
	}

	// textUser または textPass の変更があった
	// 各Colleagueの有効/無効を判定する
	private void userpassChanged() {
		if (textUser.getText().length() > 0) {
			textPass.setClleagueEnabled(true);
			if (textPass.getText().length() > 0) {
				buttonOk.setClleagueEnabled(true);
			} else {
				buttonOk.setClleagueEnabled(false);
			}
		} else {
			textPass.setClleagueEnabled(false);
			buttonOk.setClleagueEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		System.exit(0);
	}

}
