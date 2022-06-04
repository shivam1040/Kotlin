fun main(){
    A1.f() //making use of companion
    //Kotlin doesnot have concept of static, so companion can be used to replace it, this would create an standalone obj and load with class to provide features of static
    A1.B.b() //not making use of companion
}

class A1{ //way to define companion objects
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