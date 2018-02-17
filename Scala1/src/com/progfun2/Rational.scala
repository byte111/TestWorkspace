package com.progfun2

/**
  * Created by dbhattac on 12/24/2016.
  */
class Rational(x:Int, y: Int) {
  def num = x;
  def denom = y;



}

object rationals
{
  def main(args: Array[String]): Unit = {
    val rat1 = new Rational(2,3);
    println(rat1.num)

  }


}


