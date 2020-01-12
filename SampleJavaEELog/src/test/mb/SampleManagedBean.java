package test.mb;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;

@Named
@SessionScoped
public class SampleManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String message;

	@Inject
	private transient Logger logger;

	public String execute() {
		logger.info("SampleManagedBean#execute method was executed.");
		message = name;
		return null;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message セットする message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
