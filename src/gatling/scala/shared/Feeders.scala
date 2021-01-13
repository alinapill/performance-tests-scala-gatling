package shared

import io.gatling.core.feeder.Feeder

object Feeders {
  val FeederRandomEmail = new Feeder[String] {
    override def hasNext = true

    override def next: Map[String, String] = {
//      val randomName = new util.Random
      Map("name" -> ("test"))
    }
  }
}
