package beans;

public class Meibo {
	private Integer number;
	private String name;
	private String mail;
	private boolean editable;

	public Meibo() {
	}

	public Meibo(Integer number, String name, String mail) {
		super();
		this.number = number;
		this.name = name;
		this.mail = mail;
	}


	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
}
