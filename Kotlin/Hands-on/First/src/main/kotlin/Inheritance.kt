fun main(){
    val obj=Smartphone("a")
    obj.make()
}
open class Phone(val b:String){ //open keyword tells that this class can be inherited
    val a:String =""

    open fun make(){ //open keyword means method can be overriden

    }
}

class Smartphone(val c:String):Phone(c){ //way to inherit Phone class, and passing c as parameter value to Phone constructor
    fun make1(){

    }

    override fun make() {
        super.make() //calling super class method
    }

    override fun toString(): String { //overriding toString method of any class
        return "a"
    }
}
