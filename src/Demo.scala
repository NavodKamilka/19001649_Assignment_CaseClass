import math.{ sqrt, pow }

object Demo extends App {
  val p1 = Point(2,1)
  val p2 = Point(10,7)
  val p3 = p1.move(5,10)

  println("First Point : "+p1)
  println("Second Point : "+p2)
  println("Add : "+(p1 add p2))
  println("Move : "+p3)
  println("Distance : "+(p1 distance  p2))
  println("Invert : "+(p1 invert(p1 : Point)))

}

case class Point(a: Int, b: Int){
  def x : Int = a
  def y : Int = b

  //override def toString = "("+x+","+y+")"
  def add(that:Point) = Point(this.x+that.x,this.y+that.y)

  def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)

  def distance(other: Point): Double = {
    sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
  }
  def invert(that : Point)= Point(y,x)

}
