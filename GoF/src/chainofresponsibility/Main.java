package chainofresponsibility;

/**
 * Supportたちの連鎖を作り、トラブルを起こす動作テスト用のクラス<BR>
 *
 * Client（依頼者）の役<BR>
 * Client役は、最初のConcreteHandler役に要求を出す役である。
 *
 *
 */
public class Main {

	public static void main(String[] args) {

		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support diana = new LimitSupport("Diana", 200);
		Support elmo = new OddSupport("Elmo");
		Support fred = new LimitSupport("Fred", 300);

		// 連鎖の形成
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

		// さまざまなトラブル発生
		for (int i = 0; i < 500; i++) {
			alice.support(new Trouble(i));
		}
	}

}
