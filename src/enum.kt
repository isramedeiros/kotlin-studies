/*
    enum is a special type that defines a set of named constants in programming
    this makes code easier to read by using names instead of numbers for values
    enums help reduce bugs by restricting variables to defined values only
 */

// definindo um enum fora da função main

enum class Compass {
    north,
    south,
    east,
    west
}

fun main(args: Array<String>) {
    // criando variável do tipo Compass
    var direction = Compass.north

    /*
    como kotlin trabalha com inferência de tipo, podemos usar apenas
    .valor, caso o tipo seja definido explicitamente
     */

    var direction2 = Compass.south
    println("Minha direção é $direction2")

    when (direction) {
        Compass.north -> println("Estamos indo para o Norte")
        Compass.south -> println("Estamos indo para o Sul")
        Compass.east -> println("Estamos indo para o Leste")
        Compass.west -> println("Estamos indo para o Oeste")
    }

    Compass.values().forEach {
        println(it)
    }
}