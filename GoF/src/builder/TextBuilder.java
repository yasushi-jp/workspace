package builder;

/**
 * プレーンテキスト（普通の文字列）を使って文書を作るクラス<BR>
 * <BR>
 * ConcreteBuilder（具体的建築者）の役<BR>
 * ConcreteBuilder役はBuilder役のインターフェース（API）を実装しているクラス。
 * 実際のインスタンス作成で呼び出されるメソッドがここで実装される。
 * また、最終的にできた結果を得るためのメソッドが用意される。
 *
 */
public class TextBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		buffer.append("================================\n");
		buffer.append("『" + title + "』\n");
		buffer.append("\n");
	}

	@Override
	public void makeString(String str) {
		buffer.append('■' + str + "\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (String item : items) {
			buffer.append(" ・" + item + "\n");
		}
	}

	@Override
	public void close() {
		buffer.append("================================\n");
	}

	public String getResult() {		// 完成した文書
		return buffer.toString();	// StringBufferをStringに変換
	}
}
