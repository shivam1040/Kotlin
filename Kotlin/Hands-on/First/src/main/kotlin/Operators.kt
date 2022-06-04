fun main(){
    var i=2
    var j=4
    println(i.toFloat()/j.toFloat()) //way to convert int to string
    println(i>j) //prints boolean
    println(i++ + ++i) //post and pre increment 2+4, since value of 2 gets post incremented to 3

    var k=true
    var l=false
    println(k && l)

    var m=i==2 || j==12 //showing shortcircuting if condition one passes then it wont go thourgh second
    m=!m //not operator
}