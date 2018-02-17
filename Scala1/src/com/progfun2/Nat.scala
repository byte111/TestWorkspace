package com.progfun2

/**
  * Created by dbhattac on 1/2/2017.
  */
abstract class Nat {
  def isZero(x: => Nat) : Boolean
  def predecessor(x: => Nat) : Nat
  def sucessor(x: => Nat) : Nat
  def +(x: => Nat) : Nat
  def -(x: => Nat) : Nat

}

