package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSample1 {

	private static final Logger logger = LoggerFactory.getLogger(TestSample1.class);

	public void exec() {
		logger.debug("TestSample1#exec method was executed.");
	}
}
