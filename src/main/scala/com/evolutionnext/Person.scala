package com.evolutionnext

import com.typesafe.scalalogging.slf4j.Logging

/**
 *
 * @author Daniel Hinojosa
 * @since 5/1/13 1:10 AM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 */
case class Person(firstName: String, lastName: String) extends Logging {

  //Using regular info
  logger.info("Instantiating Person")

  //Using debug
  logger.debug("Instantiating Person with {} and {}", firstName, lastName)

  //Using warn with string interpolation
  logger.warn(s"We are using string interpolation for ${firstName} and ${lastName}")

  require(firstName != null)
  require(lastName != null)
}
