/**
 *  1. Funções
 *      — Blocos de código reutilizaveis
 *      — Deixa o código organizado
 *      — Podem ter um tipo de retorno
 *      — Podem possuir ou não parametros
 */

// 2. Função sem parametros e sem retorno
// Uma função sem retorno tem por padrão o tipo Unit
// ex.: fun padrao(): Unit{}
fun olaMundo() {
    println("Olá, mundo")
}

// 3. Função sem parametros e com retorno
fun message(): String{
    return "This is a message!"
}

// 4. Função com parametro e com retorno
fun sum(a: Int, b: Int): Int{
    return a+b
}

// 5. Body inline (função que tem apenas uma instrução - uma linha)
fun subtract(a: Int, b: Int): Int = a - b

fun ageCheck(age: Int) = if (age >= 18) println("Maior de idade") else println("Menor de idade")

fun main() {
    olaMundo()

    val soma = sum(10, 10);
    println(soma)

    println(message())

    val subtracao = subtract(10, 9);
    println(subtracao)

    ageCheck(16)
    ageCheck(28)
}