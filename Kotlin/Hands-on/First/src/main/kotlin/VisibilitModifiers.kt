fun main(){

}

internal var b=1 //this var can be only used within a module/package
private var b1=1//can only be used within this kotlin source code

open class A{
    protected var b=1 //accessible by classes which inherit this class
}