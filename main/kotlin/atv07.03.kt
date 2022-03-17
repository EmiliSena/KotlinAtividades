//Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
e por menos duas opções de construtores conforme sua percepção, com os atributos:
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função principal(), não esquecer de colocar dentro de um bloco tentar pegar.//*



importar 'objeto'. Estoque
encapsulamento importação. Cliente

diversão principal() {
    println("Digite seu nome: ")
    val nome = readLine()!!

    println("Digite seu endereço: ")
    val endereco = readLine()!!

    println("Digite seu telefone: ")
    val telefone = readLine()!!

    tentar {
        val cliente = Cliente(
            nome, endereco,
            telefone
        )

        while (true){

            println ("\nMENU\n")

            println("1 - Adicionar itens no carrinho")
            println("2 - Remover itens do carrinho")
            println("3 - Listar os itens do carrinho")
            println("Digite outro valor para sair")

            var opc = 0

            while (true){
                println ("\nDigite a deseja opçãoda: ")

                tentar {
                    opc = readLine()!!. toInt()
                    quebrar
                }captura (e: Exceção){
                println ("Valor inválido!")
            }
            }

            when(opc){

                1 -> {
                println ("Digite o item a ser adicionado: ")
                item val = readLine()!!
                cliente.addCompra(item)
            }
                2 -> {
                println("Digite o item a ser removido: ")
                item val = readLine()!!
                cliente.removeCompra(item)
            }

                3 -> cliente.listarCompras()

                outra coisa -> quebrar

            }

        }

}