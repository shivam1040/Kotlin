fun main(){
    val a=Container<Int, String>(1) //way to use generic classes
}

class Container<T:Int, U>(var a:T){ //restricting T to only int

}

