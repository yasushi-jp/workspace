package test.util;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class LoggerFactoryProducer {

    @Produces
    public Logger getLogger(InjectionPoint ip) {
    	return LoggerFactory.getLogger(ip.getMember().getDeclaringClass().getName());
    }
}
