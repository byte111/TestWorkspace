package com.progfun2

/**
  * Created by dbhattac on 1/2/2017.
  */
object  Zero extends  Nat{
  def isZero(x: => Nat) : Boolean  = true
  def predecessor(x: => Nat) : Nat = throw new Error()
  def sucessor(x: => Nat) : Nat =  new Succ(this)
  def +(x: => Nat) : Nat =  x+1
  def -(x: => Nat) : Nat = x
}

class Succ(x:Nat) extends Nat{
  def isZero = false
  def predecessor = n

}

