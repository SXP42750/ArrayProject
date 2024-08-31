object Maximum {
  def main(args: Array[String]): Unit = {
    println("enter the size")
    val size = scala.io.StdIn.readInt()
    val arr = new Array[Double](size)

    println("Enter the elements ")

    for (i <- 0 to arr.length - 1) {

      println("enter the elements at" + " " + i)
      arr(i) = scala.io.StdIn.readDouble()

    }

    def maximumElements(arr: Array[Double]): Double = {
      var max = arr(0)
      for (i <- 0 to arr.length - 1) {
        if (max < arr(i)) {
          max = arr(i)
        }
      }
      max
    }

    println("The maximum element in the array is:" +maximumElements(arr))

  }
}
