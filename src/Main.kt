fun main(args: Array<String>) {
    var nomeFaculdade = "FIAP"
    println(nomeFaculdade)

    nomeFaculdade = "Faculdade de Informática e Administração Paulista"
    println(nomeFaculdade)

    val nome = "Israel"
    println(nome)

    // calling a function
    arrays()
}

fun arrays() {
    // array vazio
    val emptyArray = arrayOf<String>()

    // array de strings
    val shoppingList = arrayOf<String>("Leite", "Pão", "Manteiga", "Açúcar")

    // usando inferência
    val inferredShoppingList = arrayOf("Leite", "Pão", "Manteiga", "Açúcar")

    // testando se um array está vazio
    if (shoppingList.isEmpty()) {
        println("A lista de compras está vazia")
    } else {
        println("A lista de compras não está vazia")
    }

    // recuperando o total de elementos do Array
    println("Nossa lista de compras possui ${shoppingList.size} itens")
}