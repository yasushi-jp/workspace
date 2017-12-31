package mediator;

/**
 * 「相談役」のインターフェース（API）を定めるインターフェース<BR>
 * <BR>
 * Mediator（調停者、仲介者）の役<BR>
 * <PRE>
 * Mediator役は、Colleague役と通信を行って、調整を行うためのインタフェース（API）を定める。
 * </PRE>
 */
public interface Mediator {
	public abstract void createColleagues();
	public abstract void colleagueChanged();
}
