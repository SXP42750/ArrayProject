object ArrayInteger {
  def main(args:Array[String]):Unit={
    println("enter the size")
    val size=scala.io.StdIn.readInt()
    val arr=new Array[Int](size)

    println("enter the elements ")

    for(i<-0 to arr.length-1){

      println("enter the elements at"+" "+i)
      arr(i)=scala.io.StdIn.readInt()

    }
    println("display the elements ")
    for(i<-0 to arr.length-1)
    {

      println(arr(i))

    }
  }

}
