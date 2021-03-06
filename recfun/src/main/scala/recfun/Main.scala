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
  def pascal(c: Int, r: Int): Int = {
    if (c == 0)
      1
    else if (c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    parenthesisCount(chars, 0)
  }

  def parenthesisCount(chars: List[Char], count: Int): Boolean = {
    if (count < 0)
      false
    else if (chars.isEmpty) {
      if (count == 0) {
        true
      } else {
        false
      }
    }
    else {
      if (chars.head == '(') {
        parenthesisCount(chars.tail, count + 1)
      } else if (chars.head == ')') {
        parenthesisCount(chars.tail, count - 1)
      } else {
        parenthesisCount(chars.tail, count)
      }
    }
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) {
      0
    } else if (coins.isEmpty) {
      0
    } else {
      1
    }
  }
}
