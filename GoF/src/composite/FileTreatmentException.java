package composite;

/**
 * ファイルにEntryを追加しようとしたときに起きる例外クラス
 *
 */
public class FileTreatmentException extends RuntimeException {

	public FileTreatmentException() {
	}

	public FileTreatmentException(String msg) {
		super(msg);
	}

}
