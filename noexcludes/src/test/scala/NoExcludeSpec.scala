import org.specs2.mutable._

class NoExcludeSpec extends Specification {
  "scalacheck jars" should {
    "be on the classpath" in {
      val jars = System.getProperty("java.class.path").split(":").toList
      ((_:String) must contain ("org.scalacheck")).atLeastOnce(jars)
    }
  }
}
