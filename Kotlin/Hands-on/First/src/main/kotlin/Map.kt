fun main(){
    val stud:MutableMap<Int, String> = mutableMapOf<Int, String>()
    stud.put(1, "A")
    stud[1]="B" //same operation as above

    val b=mapOf<Int, String>(1 to "A", 2 to "W") //way to define immutable list, A value for key 1 and so on
}