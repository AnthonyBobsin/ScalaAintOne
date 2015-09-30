/*
  Find the last element of a list.
  Example:
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
*/

def last(list: List[Int]) = {
  list(list.length - 1)
}

val list = List(1, 1, 2, 3, 5, 8)

println("List we are working with is " + list)
print("The result of last: " + last(list) + "\n")


