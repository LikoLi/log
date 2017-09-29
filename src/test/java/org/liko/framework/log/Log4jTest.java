package org.liko.framework.log;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
	@Test
	public void testLog() {
		Logger logger = Logger.getLogger(Log4jTest.class);
		logger.fatal("fatal msg.");
		logger.error("error msg");
		logger.warn("warn msg.");
		logger.info("info msg");
		logger.debug("debug msg");
		logger.trace("trace msg");
	}
}
