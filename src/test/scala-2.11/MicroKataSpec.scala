import org.ganger.microkata.MicroKata
import MicroKata.Person
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by arincon on 28/09/15.
 */
class MicroKataSpec extends FlatSpec with Matchers {

  "toUpper" should "return a seq of upper case words" in {
    val input = Seq("hola", "soy", "una", "secuencia")
    val output = Seq("HOLA", "SOY", "UNA", "SECUENCIA")
    MicroKata.toUpper(input) should be(output)
  }

  "filter" should "return a seq with the words which has less of 3 chars" in {
    val input = Seq("hola", "soy", "una", "secuencia")
    val output = Seq("soy", "una")
    MicroKata.lessThan(input, 4) should be(output)
  }

  "flat" should "return a plain seq" in {
    val input = Seq(Seq(1, 2), Seq(3, 4))
    val expected = Seq(1, 2, 3, 4)
    MicroKata.flat(input) should be(expected)
  }

  "maxAge" should "select the older" in {
    val sara = Person("Sara", 4)
    val victor = Person("Victor", 40)
    val eva = Person("Eva", 42)
    val people = Seq(sara, victor, eva)

    MicroKata.max(people) should be(eva)
  }

  "Sum all" should "sum all list elements" in {
    val input = Seq(1, 2, 3, 4)
    val expected = 10
    MicroKata.sum(input) should be(expected)
    MicroKata.sum1(input) should be(expected)
  }

  "kids" should "select the persons under 18" in {
    val sara = Person("Sara", 4)
    val victor = Person("Victor", 40)
    val eva = Person("Eva", 42)
    val ana = Person("Ana", 5)
    val people = Seq(sara, victor, eva, ana)
    val expected = Seq(sara, ana)
    MicroKata.kidsFrom(people) should be(expected)
  }


}
