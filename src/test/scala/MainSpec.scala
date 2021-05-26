import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must._

class MainSpec extends AnyFreeSpec with Matchers {
  "hello" - {
    "msg" in {
      msg mustBe "I was compiled by Scala 3. :)"
    }
  }
}
