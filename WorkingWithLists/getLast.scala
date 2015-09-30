/*
  Find the last element of a list.
  Example:
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
*/

object getLast {
  def main(args: Array[String]) = {
    val list = List(1, 1, 2, 3, 5, 8)
    println("List we are working with is " + list)
    print("The result of last: " + last(list) + "\n")

    val stringList = List("He", "llo", ", ", "World", "!")

    println("List we are working with is " + stringList)
    print("The result of last: " + last(stringList) + "\n")
  }

  def last[T](list: List[T]): T = {
    list(list.length - 1)
  }
}