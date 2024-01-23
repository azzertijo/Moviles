fun String.esFina(): Boolean{
    val condicion1 = !Regex("bu|ba|be").containsMatchIn(this)
    val condicion2 = Regex("[aeiou]").findAll(this).count() >= 3
    val condicion3 = Regex("(\\w)\\1").containsMatchIn(this)

    return listOf(condicion1, condicion2, condicion3).count { it } >= 2
}

fun main(args: Array<String>){
    println("bac".esFina())
    println("aza".esFina())
    println("abaca".esFina())
    println("baaa".esFina())
    println("aaab".esFina())

}