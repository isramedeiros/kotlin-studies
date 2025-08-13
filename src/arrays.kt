fun main () {
    // declaring an array of ints
    val numeros = arrayOf(10, 20, 30)

    // accessing a index and changing it
    numeros[0] = 100
    println(numeros.contentToString())

    // we can specify an index and the value to change it
    numeros.set(1,100)
    println(numeros.contentToString())

    // mixed arrays:
    val mixed: Array<Any> = arrayOf(1, "dog", 3.14, true)

    println(mixed.contentToString())

    /*
    multi-line comments looks like this
     */
}