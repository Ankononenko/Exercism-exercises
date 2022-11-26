internal fun twofer(name: String?): String {
    if(name != null)
        return "One for $name, one for me."
    if(name == "")
        return "One for , one for me."
    else
        return "One for you, one for me."
}

fun main(){
    println(twofer("Alice"))
    println(twofer("Bob"))
    println(twofer(""))
    println(twofer("Zaphod"))
    println(twofer(null))
}
