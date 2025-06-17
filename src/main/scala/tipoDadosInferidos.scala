val x = 10
val y = "Hello, VASCO!"
val z = true
val pi = 3.14
val list = List(1, 2, 3, 4, 5)
val map = Map("one" -> 1, "two" -> 2, "three" -> 3)

@main def main() =
    List(x, y, z, pi, list, map).foreach(item => println(s"${item.getClass.getSimpleName}: $item"))
