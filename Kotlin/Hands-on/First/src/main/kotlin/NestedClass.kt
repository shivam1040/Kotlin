fun main(){
    val obj=Outer.B() //making obj of inner class
    obj.test()
    val obj1=Outer()
    val obj2=obj1.Inner() //notice how inner class can only be created using the object of outer class
    obj2.a()

}

class Outer{
    var i=0
    class B{ //Nested class example, exits with Outer context but cant access outer's feature
        fun test(){
            println("A")
        }
    }

    inner class Inner{ //inner classes are used to access features of outer class
        fun a(){
            println(i)
        }
    }
}