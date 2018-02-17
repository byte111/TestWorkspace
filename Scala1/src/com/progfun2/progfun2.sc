object rationals1
{
 val x =  new Rational(2,3)

x.printme(x)



}












class Rational(x:Int,y:Int)
{
  def  num = x
  def denom = y

  def printme(r : Rational) = print(r.num + "/" + r.denom)
}
