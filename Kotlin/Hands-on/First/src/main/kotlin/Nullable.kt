fun main(){
    //non nullable types
    var a:String?=null //iff we give null here it would not compile so to do so suffix the left side by question mark which means that the variable can contain the appropriate value or null
    a?.uppercase() //way to check for null safety, call the method only when it is not null

    a?.let{//way to execute multiple statements on a variable using null safety
        println("a")
        println(it) //it var points to a or instance a
    }
    var b=a ?: "NA" //if a is null then value should be NA,?: is called elvis operator
    b=a!!.uppercase() //!! operator will throw error if a is null else function is called, not null asserted operator

}