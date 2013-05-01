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
class PersonSpec extends FunSpec with MustMatchers {
   describe("Using logging with inside of a model") {
      it("should display the log file") {
          Person("Bob", "Marley")
      }
   }
}
