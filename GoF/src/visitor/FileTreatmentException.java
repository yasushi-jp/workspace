package visitor;

/**
 * Fileに対してaddした場合に発生する例外クラス
 *
 */
public class FileTreatmentException extends RuntimeException {

	public FileTreatmentException() {
	}

	public FileTreatmentException(String msg) {
		super(msg);
	}

}
