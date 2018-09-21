package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = if ((c == 0) || (c == r)) 1 else (pascal(c, r - 1) + pascal(c - 1, r - 1))

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def loop(str: List[Char], brace: Int): Boolean = {
      if (brace < 0) false
      else if (str.isEmpty) brace == 0
      else if (str.head == '(') loop(str.tail, brace + 1)
      else if (str.head == ')') loop(str.tail, brace - 1)
      else loop(str.tail, brace)
    }

    loop(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (coins.isEmpty || money < 0) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}
