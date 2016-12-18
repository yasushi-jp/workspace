package adapter.inheritance;

/**
 * 必要なもの（直流12ボルト）<BR>
 * <BR>
 * Target（対象）の役。
 * いま必要となっているメソッドを定めている役。
 * （ノートパソコンを動かす直流12ボルト）
 * 当インターフェースがこの役をつとめる。
 */
public interface Print {
	public abstract void printWeek();
	public abstract void printStrong();
}
