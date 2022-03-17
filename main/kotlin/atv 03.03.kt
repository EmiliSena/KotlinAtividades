Crie um programa para trabalhar com estoque de uma loja, o programa deve
trabalhar com Coleção do tipo Lista do Kotlin para manipular os dados desse estoque, o
programa deve atender como seguintes funcionalidades:
Armazenar dados da Lista
Remover dados da lista;
Atualizar dados da lista.
Apresentar todos os dados da lista.
*/


diversão principal() {


    var estoque = mutableListOf<String>()

    while (verdade) {
        println(
            "\n***ESTOQUE***" + "\n\n1.Adicionar item" + "\n2.Item remover"
                    + "\n3.Atualizar item" + "\n4.Todos os itens" + "\n5.Sair" +
                    "\n\nDigite a opção escolhida:")

        var op = readLine()!!. toInt()

        when (op){
            1 -> {
            impressão("Digite um item para ser adicionado: ")
            item val = readLine()!!
            if (item.isEmpty()){
                println ("Item inválido.".)

            }mais{
                adicionar.item
                println("Item adicionado com sucesso!")
            }
        }
            2 -> {
            impressão("Digite um item para ser removido: ")
            item val = readLine()!!
            if (item.isEmpty()){
                println ("Item inválido.".)

            }mais{
                if (estoque.contém(item){{
                    estoque remove(item)
                    println ("O item $item foi removido do estoque.")
                }mais{
                    println ("O item $item não existe nenhum estoque.")
                }
                }
            }
            3 -> {
            if(estoque.isEmpty()) {
                println ("O estoque está vazio.".)

            }mais {
                println ("Selecione um item de 1 a ${estoque.size}: ")
                val pos = (readLine()!!. toInt() - 1)

                if (pos em 1.. (estoque.size)) {
                    println ("\nDigite o novo item: ")
                    item val = readLine()!!

                    [estoque[pos] = item
                } mais {
                    println ("Item não existe estoque.".)
                }
            }
        }
            4 -> {
            if (estoque.isEmpty()){
                println ("O estoque está vazio.".)

            }mais{
                println ("***ITENS DO ESTOQUE***")

                estoque.forEach{

                    println(ele)
                }


            }

        }