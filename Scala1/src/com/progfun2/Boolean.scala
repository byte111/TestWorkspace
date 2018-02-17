package com.progfun2

/**
  * Created by dbhattac on 1/1/2017.
  */
abstract class Boolean {
  def ifthenelse[T](t: => T , e: => T) : T
  def && (x: => Boolean) : Boolean  = ifthenelse(x,false)

}
