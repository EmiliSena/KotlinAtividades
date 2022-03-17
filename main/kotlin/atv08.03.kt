//1 - Crie uma hierarquia de classes conforme abaixo com os seguintes atributos
//e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
//como características de forma que tudo o que para comum a todos os animais ficar
//na classe Animal:
//CACHORRO: Nome, Idade, Som, Correr | CAVALO: Nome, Idade, Som, Correr
//| BICHO-PREGUIÇA: Nome, Idade, Som, Subir
//2 - Implementar um programa que crie os 3 tipos de animais definidos no exercício
//anterior e invocado o método que emite o som de cada um de forma polimórfica, isto
//é, independente do tipo de animal.
*/

diversão principal() {

    val quinta = Cachorro("Quinta-feira", 15)
    val spirit = Cavalo("Espírito", 20)
    val judite = Preguica("Judite", 50)

    while (true) {

        println ("\nSELECIONE O ANIMAL\n")

        println("1 - Cachorro")
        println("2 - Cavalo")
        println("3 - Bicho-preguiça")
        println("Digite outro valor para sair")

        var opc = 0

        while (true) {
            println ("\nDigite a deseja opçãoda: ")

            tentar {
                opc = readLine()!!. toInt()
                quebrar
            } captura (e: Exceção) {
            println ("Valor inválido!")
        }
        }

        when (opc) {

            1 -> {
            println("Escolha a ação do animal")
            println("1 - Emitir som")
            println("2 - Movimentar-se")
            var acao = readLine()!!. toInt()

            if (acao == 1) {
                quinta.emitirSom()
            } else if(acao == 2) {
                quinta.correr()
            } mais {

                while (true) {
                    println("Opção inválida!")
                    println("\nEscolha a ação do animal: ")
                    println("1 - Emitir som")
                    println("2 - Movimentar-se")
                    acao = readLine()!!. toInt()

                    tentar {
                        acao = readLine()!!. toInt()
                        quebrar
                    } captura (e: Exceção) {
                    println ("Valor inválido!")
                }
                }
            }
        }

            2 -> {

            println("Escolha a ação do animal")
            println("1 - Emitir som")
            println("2 - Movimentar-se")
            var acao = readLine()!!. toInt()

            se (acao == 1) {
                spirit.emitirSom()
            } mais se (acao == 2) {
                espírito.correr()
            } mais {

                enquanto (verdade) {
                    println("Opção inválida!")
                    println("\nEscolha a ação do animal: ")
                    println("1 - Emitir som")
                    println("2 - Movimentar-se")
                    acao = readLine()!!. toInt()

                    tentar {
                        acao = readLine()!!. toInt()
                        quebrar
                    } captura (e: Exceção) {
                    println ("Valor inválido!")
                }
                }
            }
        }
            3 -> {

            println("Escolha a ação do animal")
            println("1 - Emitir som")
            println("2 - Movimentar-se")
            var acao = readLine()!!. toInt()

            se (acao == 1) {
                judite.emitirSom()
            } mais se (acao == 2) {
                judite.subir()
            } mais {

                enquanto (verdade) {
                    println("Opção inválida!")
                    println("\nEscolha a ação do animal: ")
                    println("1 - Emitir som")
                    println("2 - Movimentar-se")
                    acao = readLine()!!. toInt()

                    tentar {
                        acao = readLine()!!. toInt()
                        quebrar
                    } captura (e: Exceção) {
                    println ("Valor inválido!")
                }
                }
            }
        }

        }
    }
}