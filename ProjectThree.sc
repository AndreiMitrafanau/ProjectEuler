def primeFactor(number: Long, list: List[Long], i: Long): Long = {
  number match {
    case x if x % i == 0 && x != i => primeFactor(x / i, list.+:(i), 2L)
    case x if x % i != 0 && x != i => primeFactor(x, list, i + 1)
    case _ => list.+:(i).max
  }
}
val a = primeFactor(600851475143L, List(), 2L)
