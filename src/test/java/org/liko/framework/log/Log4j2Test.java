package org.liko.framework.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test {
	@Test
	public void testLog4j2() {
		Logger logger = LogManager.getLogger(Log4j2Test.class);
		logger.fatal("fatal msg.");
		logger.error("error msg");
		logger.warn("warn msg.");
		logger.info("info msg");
		logger.debug("debug msg");
		logger.trace("trace msg");
	}
}
