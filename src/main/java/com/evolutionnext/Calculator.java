package com.evolutionnext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Daniel Hinojosa
 * @since 5/1/13 8:31 AM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 */
public class Calculator {
    Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.debug("Adding {} and {}", a, b);
        return a + b;
    }
}
