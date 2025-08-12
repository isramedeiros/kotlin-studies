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

    // acessando itens do array
    println("Listando todos os itens: ")
    println(shoppingList[0]) // primeiro item do array
    println(shoppingList[1]) // segundo item do array
    println(shoppingList[2]) // terceiro item do array
    println(shoppingList[3] + "\n") // quarto item + nova linha
    println("Index 2 do Array inferredShoppingList é ${inferredShoppingList[2]}")
}