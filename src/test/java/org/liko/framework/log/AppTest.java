package org.liko.framework.log;

import org.apache.log4j.Logger;
import org.junit.Test;

public class AppTest {
	@Test
	public void testLog() {
		Logger logger = Logger.getLogger(AppTest.class);
		logger.fatal("fatal msg.");
		logger.error("error msg");
		logger.warn("warn msg.");
		logger.info("info msg");
		logger.debug("debug msg");
		logger.trace("trace msg");
	}
}
