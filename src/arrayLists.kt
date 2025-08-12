fun main() {

    arrayLists()
}

fun arrayLists() {
    // lista de filmes 1
    var movies = ArrayList<String> ()
    movies.addAll(listOf(
        "Matrix",
        "Vingadores",
        "Jurassic Park",
        "De Volta para o Futuro"
    ))

    // lista de filmes 2
    var movies2 = ArrayList<String> ()
    movies2.add("Homem-Aranha: De Volta ao Lar")
    println(movies)
    println(movies.count())

    println(movies2)
    println(movies2.count())


    movies2.remove("Homem-Aranha: De Volta ao Lar")
    println(movies2)
    println("\n")

    // verificando se determinado elemento está na list
    if (movies.contains("Matrix")) {
        println("Matrix está na minha lista de filmes favoritos!")
    }

    // listas da esposa
    var myWifeMovies = listOf(
        "De Repente 30",
        "Mensagem para você",
        "Sintonia de Amor",
        "De Volta para o Futuro",
        "Jurassic Park"
    )

    // juntando as duas listas
    // criando lista com todos os filmes
    var allMovies = movies + myWifeMovies
    println(allMovies)
    println("\n")
}