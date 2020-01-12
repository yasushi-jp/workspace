package test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {
  private static final Logger logger = LoggerFactory.getLogger(TestMain.class);

  public static void main(String[] args) {

	  logger.debug("TestMain#main method was executed.");

	  TestSample1 testSample1 = new TestSample1();
	  testSample1.exec();

	  TestSample2 testSample2 = new TestSample2();
	  testSample2.exec();

	  TestSample3 testSample3 = new TestSample3();
	  testSample3.exec();
}
}