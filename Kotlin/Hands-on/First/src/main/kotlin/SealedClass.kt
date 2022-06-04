fun main(){
    val tile=Red("Mush")
    val tile1=Blue(1)
    val tile2:A3=Red("A")
    val a = when(tile2){ //making use of sealed class, notice how one object can be checkd amongst limited number of choices
        is Red -> tile2.type
        is Blue -> 1
    }
    println(a)
}

sealed class A3
class Red(val type:String):A3()
class Blue(val point:Int):A3()