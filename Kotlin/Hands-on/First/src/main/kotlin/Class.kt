fun main(){
    val a=Car("a", 3) //way to define objects
    println(a.driveCar())
}

class Car(val name:String, val km:Int){ //way to define class
    fun driveCar(){
        println(name+km)
    }
}