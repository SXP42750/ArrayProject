object SumArray {
  def main(args: Array[String]): Unit = {
    var arr = Array(10, 20, 30, 40, 50)

    def calculateSum(arr: Array[Int]): Int = {
      var sum = 0
      for (i <- 0 to arr.length - 1) {
        sum = sum + arr(i)
      }
      sum
    }

    println(calculateSum(arr))

  }
}
