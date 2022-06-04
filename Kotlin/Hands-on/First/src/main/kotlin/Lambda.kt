fun main(){
    val lam:(Int, Int)->Int={x:Int, y:Int->(x+y)} //taking two integer and returrning its sum accroding to labmda definitiono on lhs
    val lam1:()->Int= { //multiline lambda which returns integer(2)
        println("a")
        val a: Int = 5
        2
    }
    println(lam1()) //calling lambda function
    val lam2:(String)->Unit={msg:String->(println(msg))} //lambda expression which doesnot return anything
    val singleParameterLambda:(Int)->Int = {it+it} //it is default pointer to single parameter, the passed int will be it here
    calc1(1.0, 2.0, {a, b ->a+b}) //passing lamda as parameter to higher order function, which takes functionas parameter
}

fun calc1(a:Double, b:Double, gn:(Double, Double)->Double){ //creating higher order function can inpuut a function and return var or function
    val res=gn(a,b)
    println(res)
}