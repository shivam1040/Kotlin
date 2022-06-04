fun main(){
    val a=A2(1, "2")
    val b=a.copy(id=1) //way to copy already created obj by changing one data
    val(id, name)=b //this will destructure b into id and name
    println(id)
    println(a.component1()) // gives the value of first parameter of a object's class
}

data class A2(val id:Int, val name:String){ //similar to model class in java, provides overridden toString, do ensure to define at least a single parameter
}

