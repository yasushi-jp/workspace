package beans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import util.FileUtil;

@Named
@ViewScoped
public class AjaxBb implements Serializable {

	private String text;
	{
		text = FileUtil.getText("/resources/data/toshishun.txt");
	}

	public String next() {
		save();
		return null;
	}

	public void save() {
		FileUtil.putText(text, "/resources/data/toshishun.txt");
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
