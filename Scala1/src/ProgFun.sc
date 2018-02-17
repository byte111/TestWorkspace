/*
def sumInts(a:Int,b:Int) : Int = if (a > b) 0 else a+sumInts(a+1,b)
sumInts(1,10000)





def product (f:Int=> Int)(a: Int, b:Int): Int =
if(a > b) 1
else
  f(a)* product(f)(a+1,b)


product(a=> a*a) (3,4)




def fact(n: Int) : Int = product(x=>x)(1,n)
fact(3)
*/

def testfun(f:Int=> Int)(a:Int) : Int = a


def testfun1(f: Int => Int)(a: Int) : Int =
if(a > 0) a+ testfun(x=>x)(a-1)
else a

def testfun2(a:Int):Int = testfun1(z=>z)(a)

testfun2(4)


