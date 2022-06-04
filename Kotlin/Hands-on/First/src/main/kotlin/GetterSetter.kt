fun main(){
    val obj=Calc1(2, 3)
    obj.num1=-1
    println(obj.num1)
}

class Calc{
    lateinit var c:String //in kotlin it is a rule to initiallize variable either by constructor or explicitly, to avoid this one can use lateinit prefix to tell kotlin that var wold be initiallized later, lateinit is not applicable to val, boolean, int, float
    fun add(a:Int, b:Int) :Int {
        return a + b
    }
}

class Calc1(a:Int, b:Int){
    var num1:Int = a

    set(value){ //way to use setters, when a field is initiallized its value will pass through setter and processing would be done
        if(value>0)
            field=value
        else
            println("negative")
    }

    get(){ //way to use getters, when field is accessed by obj.fieldName then it will go through this and processed accordingly
        return ++field
    }

    var num2:Int = b
    set(value) { //notice how getters and setters are defined right after variable is initiallized
        if(value>0)
            field=value
        else
            println("negative")
    }
    get() {
        return ++field
    }

}