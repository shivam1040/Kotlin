fun main(){
    val a=Car1("a", 3) //way to define objects
    println(a.driveCar())

    val b=Car2(1)
    b.name //notice how parametrized a cant be accessed but name attribute can be
}

class Car1(val name:String, val km:Int){ //way to define class and parametrized constructor
    init {
        println("obj created")//this block would run after obj creation, multiple inti block can be written and executed in sequence
    }

    fun driveCar(){
        println(name+km)
    }
}

class Car2(a:Int, val b:Int, val c:Int){ //making use of constructor to use parameter scoped to this class
    val name:Int=a
    var isN: Boolean = a>1 //evaluated property example

    constructor(a:Int) : //this is secondary constructor enables us to intiallize value for parameters even if we dont pass value for it at the time of obj creation then its value will be taken from this
            this(a,2, 3) //this is calling primary constructor, s0 not providing b and c will default to 2 and 3, check obj creation in main
}