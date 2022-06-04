fun main(){
    println(che.num)
    var a=object { //way to create anonymous objects, known as obj expresiion
        val b=10
    }

    var b=object:Cd{ //anonymous obj implementing an interface
        override fun clone() {
            TODO("Not yet implemented")
        }

    }

    var c=object:D("che"){ //inherting a class to anonymous obj
        override fun b() {
            super.b()
            println("a")
        }
    }
 }

object che{ //object decelaration, this object is singleton. static
    val num:Int=10
}

interface Cd{
    fun clone()
}

open class D(val a:String){
    open fun b()= println(a)
}