fun main(){
    println("A".fomatString()) //calling extendsion fucntion
    println("A".bet) //acessing extension property
    println(A4.printme()) //excessing extension companion func
}

//Extension functions are basically used to provide extra features and functionality to classes which are not open, here we have added a method formatString in string class which is not open
//private members of below class can't be used for creating extension properties/methods since this extension is made out of the string scope
fun String.fomatString():String{
    return "format$this"
}

val String.bet:Int //way to use extension to initiallize a property
    get() = 1

class A4{ //way to define companion objects
    companion object A{ //one class can have only one companion obj
        @JvmStatic //this enables the use of this method as static method in java source codes, A1.f()
        fun f(){

        }
    }

    object  B{
        fun b(){

        }
    }
}

fun A4.A.printme(){ //extension of comapanion objects
    println("a")
}