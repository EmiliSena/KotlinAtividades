//1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida chorar um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

diversão principal() {

    val cliente1 = Cliente()

    cliente1.nome = "Emili Sena"
    cliente1.usuario = "EmiSena"
    cliente1.email = "emilisena@gmail.com"
    cliente1.senha = "12345678"
    cliente1.dataNas = "03/10/1994"

    println("CADASTRO CLIENTE ${(cliente1.nome).uppercase()}" +
            "\n\nNome: ${ cliente1.nome}" + "\nUsuário: ${ cliente1.usuario}" +
            "\nEmail: ${cliente1.email}" + "\nSenha: ${cliente1.senha}" +
            "\nData de Nascimento: ${cliente1.dataNas}"

    )

   // 2) Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida gritar um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
    //*

    diversão principal() {

        val voo23 = Aviao()

        voo23.codVoo = 1234
        voo23.cidOrigem = "São Paulo-Gru"
        voo23.cidDestino = "Ilheus- IOS"
        voo23.capacidade = 200
        voo23.vagas = 56
        voo23.tempoVoo = 2

        println("INFORMAÇÕES VOO ${(voo23.codVoo)}" +
                "\n\nCidade de Origem: ${voo23.cidOrigem}" +
                "\nCidade de Destino: ${voo23.cidDestino}" +
                "\nTempo de chegada prevista: ${voo23.tempoVoo} horas" +
                "\nCapacidade de Passageiros: ${voo23.capacidade}" +
                "\nAssentos Disponíveis: ${voo23.vagas}"
        )

    }

    //4) Crie uma classe funcionário e apresente os atributos e métodos
    referentes esta classe, em grito seguida um objeto funcionário, defina
    como instancias este objeto e apresente as informações deste objeto no console.
    */

    diversão principal() {

        val funcionario = Func()

        funcionario.nome = "Emili Sena de Oliveira Gama"
        funcionario.codFunc = 12345
        funcionario.idade = 27
        funcionario.cargo = "Desenvolvedor Mobile"
        funcionario.email = "emilisena@gmail.com"
        funcionario.telefone = "11945683918"
        funcionario.endereco = "São Paulo - SP"

        println("CADASTRO DO FUNCIONÁRIO" +
                "\n\nCódigo: ${funcionario.codFunc}" +
                "\nNome: ${funcionario.nome}" +
                "\nCargo: ${funcionario.cargo}" +
                "\nIdade: ${funcionario.idade}" +
                "\nTelefone: ${funcionario.telefone}" +
                "\nEmail: ${funcionario.email}" +
                "\nEndereço: ${funcionario.endereco}"
        )
    }
