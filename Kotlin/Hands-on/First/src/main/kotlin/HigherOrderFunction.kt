fun main(){
    var fn: (a:Double, b:Double)->Double = ::sum //var storing function which takes parameters, lambda
    println(fn(2.0, 3.0))
    calc(5.0, 6.0, ::sum) //notice how sum's decelartion matches with gn decelartion in calc function
}

//lambda is a function which is anonymous

fun sum(a:Double, b:Double):Double{
    return a+b
}

fun calc(a:Double, b:Double, gn:(Double, Double)->Double){ //creating higher order function can inpuut a function and return var or function
    val res=gn(a,b)
    println(res)
}