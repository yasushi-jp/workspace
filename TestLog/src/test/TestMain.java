package test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chapters.configuration.Foo;

public class TestMain {
  final static Logger logger = LoggerFactory.getLogger(TestMain.class);

  public static void main(String[] args) {
    logger.info("Entering application.");
    logger.debug("debug.");

    Foo foo = new Foo();
    foo.doIt();
    logger.info("Exiting application.");
  }
}