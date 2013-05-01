package com.evolutionnext

import org.scalatest.FunSpec
import org.scalatest.matchers.MustMatchers

/**
 *
 * @author Daniel Hinojosa
 * @since 5/1/13 1:14 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 */
class CalculatorSpec extends FunSpec with MustMatchers {
   describe("Using logging with inside of a service type class, calculator") {
      it("should add two ints and display the log") {
        val calculator = new Calculator()
        calculator.add(2,5)
      }
   }
}
