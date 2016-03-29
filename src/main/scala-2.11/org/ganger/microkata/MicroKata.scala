package org.ganger.microkata

/**
 * Created by arincon on 29/09/15.
 */
object MicroKata {
  case class Person(name: String, age: Int)
  def toUpper(input: Seq[String]): Seq[String] = input.map(_.toUpperCase)
  def lessThan(input: Seq[String], i: Int): Seq[String] = input.filter(_.length < i)
  def flat(input: Seq[Seq[Int]]): Any = input.flatMap(_.toSeq)
  def max(people: Seq[Person]): Person = people.maxBy(_.age)
  def sum1(input: Seq[Int]): Int = input.reduceLeft(_ + _)
  def sum(input: Seq[Int]): Int = input.sum
  def kidsFrom(people: Seq[Person]): Seq[Person] = people.filter(_.age < 18)

}
