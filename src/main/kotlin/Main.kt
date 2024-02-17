package nf3



fun main() {
    var f: (Int, Int) -> Int
    f = ::subtracao
    println(f(5, 2))
    println(f(5, 2))
    val funcaoLambda: (Int, Int) -> Int = { a,b -> a + b }
    println(funcaoLambda(5, 2))
    //==
    f = { a,b -> a + b }
    println(f(5, 2))
    val funcaoAnonima3 = fun(a: Int, b: Int): Int = a + b
    println(funcaoAnonima3(5, 2))

    soma(4,5, resultado = (::println))
}

fun soma(a: Int, b: Int, resultado: (Int)-> Unit) {
    resultado(a + b)
}

fun subtracao(a: Int, b: Int):Int = a - b