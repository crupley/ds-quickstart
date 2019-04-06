package com.crupley.scalabuild

import org.json4s._
import org.json4s.native.JsonMethods._

case class Info(name: String, age: Int)

object HelloBuild {
  implicit val formats = DefaultFormats

  def json2info(j: String): Info = parse(j).extract[Info]

  def main(args: Array[String]): Unit = {
    val info = json2info("""{ "name": "joe", "age": 24 }""")
    println(s"Info extracted: $info")
  }
}