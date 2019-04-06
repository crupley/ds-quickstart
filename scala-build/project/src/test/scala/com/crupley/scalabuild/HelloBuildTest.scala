package com.crupley.scalabuild

import org.scalatest.{FlatSpec, Matchers}

class HelloBuildTest extends FlatSpec with Matchers {

  "HelloBuild" should "extract info from json string" in {
    HelloBuild.json2info("""{ "name": "iris", "age": 28 }""") shouldBe Info("iris", 28)
  }
}