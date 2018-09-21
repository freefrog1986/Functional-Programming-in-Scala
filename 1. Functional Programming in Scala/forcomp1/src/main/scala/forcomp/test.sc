Map(
  5 -> List("Every", "likes", "Scala"),
  7 -> List("student")
)

"representation".groupBy((c: Char) => c).map(r => (r._1, r._2.length)).toList

List("I", "love", "you").mkString


List(('a', 3), ('b', 3)) match{
  case List() => List()
  case x::xs => for{
    i <- 1 to x._2
  } yield List((x._1, i))
}

List(('a', 3), ('b', 3)).updated(1,('a',2))


