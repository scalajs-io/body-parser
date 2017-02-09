package io.scalajs.npm.bodyparser

import io.scalajs.npm.express.Express
import org.scalatest.FunSpec

/**
  * BodyParser Test
  * @author lawrence.daniels@gmail.com
  */
class BodyParserTest extends FunSpec {

  describe("BodyParserTest") {

    it("is an Express.js middleware") {
      val app = Express()

      // parse application/x-www-form-urlencoded
      app.use(BodyParser.urlencoded(new UrlEncodedBodyOptions(extended = false)))

      // parse application/json
      app.use(BodyParser.json())
    }

  }

}
