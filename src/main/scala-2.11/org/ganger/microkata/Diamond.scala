package org.ganger.microkata

/**
 * Created by arincon on 13/10/15.
 */
object Diamond {

  final val initChar: Char = 'A'

  def build(finalChar: Char): Seq[String] = {
    val totalSize = finalChar - initChar + 1
    addReverse(for (currentChar <- initChar to finalChar)
      yield makeLineFor(currentChar, totalSize))
  }

  def makeLineFor(currentChar: Char, totalSize: Int) = {
    val place = totalSize - (currentChar - initChar + 1)
    val start = (
      for (x <- 0 to totalSize - 1)
        yield {
          if (x == place) currentChar.toString
          else "-"
        }).mkString("")
    val end = start.reverse.drop(1)
    (start ++ end).mkString("")
  }

  def addReverse(strings: Seq[String]): Seq[String] =
    strings ++ strings.reverse.drop(1)

}