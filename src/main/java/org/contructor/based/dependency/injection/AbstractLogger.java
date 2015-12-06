package org.contructor.based.dependency.injection;

import org.apache.log4j.Logger;

public abstract class AbstractLogger {
	final public Logger log = Logger.getLogger(getClass());

}
