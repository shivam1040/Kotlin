fun main(){
    var a="1"
    if(a is String) //is keyword to check if var a is String
        println("a")

    var b:Car3=BM()
    if(b is BM)
        (b as BM).drive() //casting one obj to another using as, as? can be used for null safety in case non bmw obj is present in var b
}

open class Car3(){
}

class BM:Car3(){
    fun drive(){
        println("b")
    }
}
