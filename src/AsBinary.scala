import scala.annotation.tailrec

/**
  * Created by Badrish Davay on 6/2/21.
  */
object AsBinary extends App {


  def buildNumber(n: Int): String = {
    @tailrec def binary(acc: String, n: Int): String = {
      n match {
        case 0 | 1 => n+acc
        case _ => binary((n % 2)+acc, (n / 2))
      }
    }
    binary("",n)
  }
  (1 to 10).foreach {i =>
    val twoPower = Math.pow(2.0, i).toInt
    val twoPowerPlusOne = twoPower + 1

    println(i,buildNumber(twoPower))
    println(i,buildNumber(twoPowerPlusOne))
  }
}
