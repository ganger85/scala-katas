import org.ganger.microkata.Diamond
import org.junit.Test
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by arincon on 13/10/15.
 */
@Test
class DiamondSpec extends FlatSpec with Matchers {


  "Diamond" should "return A with A as input" in {
    val result = Diamond.build('A')

    result should be(Seq("A"))
  }
  it should "return 3 lines with B as input" in {
    val expected = 3
    val result = Diamond.build('B')

    result.size should be(expected)

    result.mkString("\n") should be(
      "-A-\n" +
      "B-B\n" +
      "-A-")
  }
  it should "return 5 lines with C as input" in {
    val expected = 5
    val result = Diamond.build('C')

    result.size should be(expected)

    result.mkString("\n") should be(
      "--A--\n" +
      "-B-B-\n" +
      "C---C\n" +
      "-B-B-\n" +
      "--A--")
  }
  it should "return 7 lines with D as input" in {
    val expected = 7
    val result = Diamond.build('D')

    println(result.mkString("\n"))
    result.size should be(expected)


    result.mkString("\n") should be(
      "---A---\n" +
      "--B-B--\n" +
      "-C---C-\n" +
      "D-----D\n" +
      "-C---C-\n" +
      "--B-B--\n" +
      "---A---")

  }

}


