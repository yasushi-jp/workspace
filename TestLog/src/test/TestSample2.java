package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSample2 {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public void exec() {
		logger.debug("TestSample2#exec method was executed.");
	}
}
