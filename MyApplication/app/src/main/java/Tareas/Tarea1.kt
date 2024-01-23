package Tareas

fun verificaCadena(cadena : String): Boolean{

    if (cadena.isEmpty()){
        return false
    }
    val carac1 = cadena[0]
    if(!cadena.startsWith('_') && !carac1.isLetter()){
        return false
    }
    for(caracter in cadena.substring(1)){
        if(!caracter.isLetterOrDigit() && caracter!='_'){
            return false
        }
    }
    return true
}

fun verif(cad : String):Boolean{
    val patron = Regex("^[a-zA-Z_][a-zA-Z0-9_]*$")
    return patron.matches(cad)
}

fun main(args: Array<String>) {
    println(verif("nombre")) // true
    println(verif("_nombre")) // true
    println(verif("_12")) // true
    println(verif("")) // false
    println(verif("012")) // false
    println(verif("no$")) // false
    println(verif(" ")) // false
    println(verif("nofalla")) // true
}