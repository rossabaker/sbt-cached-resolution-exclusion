import org.specs2.mutable._

class ExcludeSpec extends Specification {
  "scalacheck jars" should {
    "not be on the classpath" in {
      val jars = System.getProperty("java.class.path").split(":").toList
      forall(jars) { _ must not contain ("org.scalacheck") }
    }
  }
}
