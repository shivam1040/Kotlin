fun main(){
    val circle= arrayOf(Cir1(), Cir2())

    if(circle[0] is Cir1) //type checking way to check if obj belongs to this class
        println(1)
    else
        (circle[0] as Chevk).a() //casting to Chevk type implementation


}

interface Chevk{ //way to create interface and implement it among classes basedon behaviour
    val sp:Int
    fun a()
}

abstract class Shape2{ //way to define abstract class/method
    abstract fun meth():Double
}

class Cir1():Shape2(), Chevk{ //way to implement multiple interfaces, abstract
    override fun meth(): Double {
        TODO("Not yet implemented")
    }

    override val sp: Int=1

    override fun a() {
        TODO("Not yet implemented")
    }

}

class Cir2():Chevk{

    override val sp: Int=1

    override fun a() {
        TODO("Not yet implemented")
    }

}

fun check(obj:Array<Shape2>){ //different shap types be used here

}

fun check1(obj:Array<Chevk>){ //different shap behaviours be used here
    obj[0].a()
}