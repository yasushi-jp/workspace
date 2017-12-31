package mediator;

/**
 * 「メンバー」のインターフェース（API）を定めるインターフェース<BR>
 * <BR>
 * Colleague（同僚）の役<BR>
 * <PRE>
 * Colleague役は、Mediator役と通信を行うインタフェース（API）を定める。
 * </PRE>
 */
public interface Colleague {
	public abstract void setMediator(Mediator mediator);
	public abstract void setClleagueEnabled(boolean enabled);
}
