package io.nuvo.kaptcha

import java.util.Properties
import io.nuvo.kaptcha.impl.DefaultKaptcha
import io.nuvo.kaptcha.util.Config

/**
 * This object provides a simplyfied access to the Kaptcha API.
 */
object Kaptcha {

  lazy val k = Kaptcha(new Properties())

  /**
   * Creates a new Kaptcha configured with the specific properties
   * @param p the property file
   * @return a kaptcha instance
   */
  def apply(p: Properties): DefaultKaptcha = {
    val k = new DefaultKaptcha()
    k.setConfig(new Config(p))
    k
  }

  /**
   * Generate a textual captcha.
   *
   * @return the generated captcha
   */
  def text() = k.createText()

  /**
   * Generates an image that represents the captcha passed as argument
   *
   * @param text the text to be rendered
   * @return the captcha text as an image
   */
  def image(text: String) = k.createImage(text)
}
