/*
2520 is the smallest number that can be divided 
by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly 
divisible by all of the numbers from 1 to 20?
 */

def check(number: Int, div: Int): Int = {
  number % div match {
    case 0 if div == 20 => number
    case 0 => check(number, div + 1)
    case _ => check(number + 20, 1)
  }
}
check(20, 2)
