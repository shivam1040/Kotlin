fun main(){
    println(add(5, 6))
    println(mult(5, 6))
    println(mult(num1=1, num2=3)) //concept of named arguements,explicitly mapping variable and its values, using this we can assign values to parameter in any order, just ensure to give values for all

    var fn= ::add1 //way to store function in a variable
    fn(1, 2)
    var fn1:(num1:Int, num2:Int) -> Int=::add1 //explicit definition of function var fn, this means method taking twp integers and returning integer mapped to function add
}

fun add1(num1:Int, num2:Int):Int{ //function with return type, if function has no return type then it is called Unit
    return num1+num2
}

fun mult(num1:Int, num2:Int):Int=num1*num2 //inline function, these definition variables are of val type so cant be reassigned

fun defaul(num1:Int=1, num2:Int):Int=num1*num2 //inline function, if value of num1 is not provided at the time of calling then default value 1 will be assigned

fun mult(){ //way to overload a function

}

fun localFun(){ //local function implementation
    fun a(){
        println("local")
    }
    fun b(){
        a() //making use of local function
    }

}