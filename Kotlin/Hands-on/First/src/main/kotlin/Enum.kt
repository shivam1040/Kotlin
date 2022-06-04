fun main(){
    val day=Day.Monday
    println(day)
    println(day.number)
    day.print()

    for(i in Day.values())
        println(i)
}

//values and variables within enum are instances, so Monday is variable 1 is its value, in enum every variable can only have one instance
enum class Day(val number:Int){ //way to create enum with parametrized constructor
    Monday(1), //1 denotes value for parameter number and enum variable Monday
    Tuesday(2),
    Wednesday(3);

    fun print(){ //function within an enum which prints the current value and variable enum is pointing to
        println(this)
    }
}