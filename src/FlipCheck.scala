import scala.annotation.tailrec

/**
  * Created by Badrish Davay on 6/1/21.
  */
object FlipCheck extends App {

  def flipNumber(n: Int):Boolean = {
    var pal_Q = 0

    def isPal(n: Int): Int = {

      if (n == 0) {
        return 1;
      }
      pal_Q = pal_Q * 10
      pal_Q += n % 10;
      return isPal(n / 10);
    }
    isPal(n)
    return pal_Q == n
  }

    val r = (1000 to 9999).view
      .flatMap(i => (i to 9999).map(_ * i))
      .filter(n =>
        flipNumber(n))
      .max
    println(s"max was $r ")
  }
