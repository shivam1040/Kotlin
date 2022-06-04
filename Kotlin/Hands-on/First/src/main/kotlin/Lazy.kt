fun main(){
    val big:String by lazy {
        "a"
    } //lazy ensures that if a var which stores big data then it should only be initiallized when it is accessed thus saving memory
}