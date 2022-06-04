fun main(){
    val circle: Shape=Circle(4.0) //showing polymorphism, one method many representation, code behaving differently based on object
    val square:Shape=Square(5.0)
}

open class Shape{
    open fun area():Double{
        return 0.0
    }
}

class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return  radius
    }
}

class Square(val side:Double):Shape(){
    override fun area(): Double {
        return side
    }

    override fun toString(): String { //overriding Any class method toString
        return "a"
    }
}