package utils;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;


@Dependent
public class LoggerProducer {

	@Inject
	InjectionPoint pont;

	@Produces
	public Logger getLogger() {
		String className = pont.getMember().getDeclaringClass().getName();
		Logger logger = Logger.getLogger(className);
		logger.setLevel(Level.ALL); // すべてのレベルのログを出力する
		return logger;
	}
}
