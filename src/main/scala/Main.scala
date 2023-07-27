def msg = "I was compiled by Scala 3. :)"

val someStrings: List[String] = List(
  "Here's a strang",
  "And another strang",
  "here's strang # 3!",
  "Wow so many strangs",
  "I think this will be the last",
  "Just kidding"
)

extension (s: String)
  def makeInts(radix: Int): List[Int] =

    val intSeq = for (c <- s) yield Integer.parseInt(s, radix)

    intSeq.toList

extension (sl: List[String])
  def makeIntList(): List[List[Int]] =
    for (s <- sl) yield s.makeInts(2)

@main def Program: Unit = {
  println(someStrings.makeIntList())
}
