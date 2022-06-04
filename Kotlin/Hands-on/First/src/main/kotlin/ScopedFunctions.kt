fun main(){
    val a=Emp()
    a.apply { //avoiding writing a.name, a.age
        name="1"
        age=22
    }

    a?.let {//way to perform operations, ? to ensure that not null is not accessed
        println(it.age)
        println(it.name)
        2//if this is given then it means return type is int, if nothing is present at the end then it means the return type is Unit
    }

    val b=with(a){ //difference between with and apply is that let is labmda function containing it and this is a noraml function pointing to current obj by this
        name="@"
        age=33
        2
    }

    a.run{//this is generally used to run functions contained in a obj

    }

}

data class Emp(var name:String="", var age:Int=1)