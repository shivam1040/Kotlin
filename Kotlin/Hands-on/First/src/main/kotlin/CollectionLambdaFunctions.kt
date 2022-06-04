 fun main(){
     val num:List<Int> = listOf(1, 2, 3, 4)
     val num1=num.filter(::isOdd) //using lambda expression from collection library
     val list=num.filter { a:Int -> a%2!=0 }
     val list1=num.filter { it%2!=0 } //same as above

     val list2=num.map { it*it } //map is used to change data from one to another, here it is returning square
     val user= listOf(User(11))
     val newUser=user.map { NewUser(it.id, "A") } //mapping one class to another

     user.forEach{println(it)} //way for iterating through elements
 }

 fun isOdd(a:Int): Boolean{
     return a%2!=0
 }

 data class User(val id:Int)
 data class NewUser(val id:Int, val name:String)