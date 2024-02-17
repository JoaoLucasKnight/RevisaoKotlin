package nf3.temas

/*
    * Paradigma Funcional
        * Funções Puras
        * Imutabilidade
        * Expressões e Avaliação
        * Recursão
        * Funções de Ordem Superior
        * Transparência Referencial
        * Lazy Evaluation
        * Composição de Funções
 */
class ParadigmaFuncional {

                // >>> Tipo Função<<< '::fun'

    //Declara
    fun soma(a: Int, b: Int):Int = soma(a, b)

    // Chama
    val f:(Int, Int) -> Int = ::soma // chama
      //   f = nome da função
      //  () = declaçaõ do tipo com parametros
      //  -> =  retorno
      //  Int = declaçao do tipo do retrono
      // ::soma = assinatura da função referencia ('f' compativel com 'soma')


                //>>> Classe Tipo Função <<< 'fun()'

    //Declara
    class funcao: (Int,Int) -> Int  {  // == soma
        override fun invoke(p1: Int, p2: Int): Int = p1 + p2
    }//funcao Classe obrigatoriamente possui o invoker
    //Chama
    val classeFuncao: (Int, Int) -> Int = funcao()
      //Muda a forma que chama


                //>>> Função Lambda <<< '={}'

    val funcaoLambda: (Int, Int) -> Int = { a,b -> a + b }

    // o retorno da função lambda é sempre a ultima expressão Ex.:
    val funcaoLambda2: (Int, Int) -> Int = { a,b ->
        println("Olha eu printando algo dentro da função Lambda")
        a + b
    }

    // sempre vc declara  { parametros -> }, se não for usar os tais coloca ' _ '

    val funcaoLambda3 = { a: Int,b: Int -> a + b }// funciona tbm


                //>>> Função Anônima <<< '->'

    val funcaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }
    val funcaoAnonima2 = fun(a: Int, b: Int): Int {
       return a + b
    }
    val funcaoAnonima3 = fun(a: Int, b: Int): Int = a + b


    // > Uma função anônima é qualquer função sem nome.
    // > Uma função lambda é um tipo específico de
    // função anônima, geralmente mais concisa e usada
    // para expressar comportamentos simples de forma direta.

    // Apenas retornar o esperado = Lambda
    // mais que um retorno = Anonima (usa muito pouco no mercado a lambda é mais popular)


            //>>> Função let <<< ''

    //Em Kotlin, let é uma função de escopo que permite que você execute um bloco de código em
    // um objeto específico. Ele é frequentemente usado para evitar a repetição de código ao
    // trabalhar com objetos que podem ser nulos.

}




