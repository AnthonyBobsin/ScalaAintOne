/*
  Find the last but one element of a list.
  Example:
  scala> penultimate(List(1, 1, 2, 3, 5, 8))
  res0: Int = 5
*/

object getBeforeLast {
  def main(args: Array[String]) = {
    val list = List(1, 1, 2, 3, 5, 8)
    println("List we are working with is " + list)
    print("The result of penultimate: " + penultimate(list) + "\n")

    val stringList = List("He", "llo", ", ", "World", "!")

    println("List we are working with is " + stringList)
    print("The result of penultimate: " + penultimate(stringList) + "\n")
  }

  def penultimate[A](list: List[A]): A = {
    list(list.length - 2)
  }
}