fun main(){
    var a=5
    while(a>0){
        println("Hry")
        a--;
    }

    a.toString()//convert to string

    do {
        println("Entered")
    }while(5<1)

    loop@for(i in 1..6 step 2) {
        continue
        break@loop //labelled breaking
        println(i)//i increments by 2
    }

    for(i in 1 until 3) //upper range 3 is not included
        println(i)

    for(i in 10 downTo 1) //decreasing loops, steps can be used here too
        println(i)

    println("$a +${a} =")//print formatting
}