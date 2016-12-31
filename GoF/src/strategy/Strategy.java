package strategy;

/**
 * じゃんけんの「戦略」を表すインターフェース<BR>
 * <BR>
 * Strategy（戦略）の役<BR>
 * 戦略を利用するためのインターフェース（API）を定める役。
 *
 */
public interface Strategy {
	public abstract Hand nextHand();
	public abstract void study(boolean win);
}
