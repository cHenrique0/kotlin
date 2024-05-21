import kotlin.reflect.typeOf

fun main() {
    // 1. Tipos
    // Os tipos de dados em Kotlin são declarados implicitamente, não sendo necessário informar o tipo
    // como em linguagens como Java, C, C#, etc.

    // Ao declarar uma variável e atribuir um valor à ela, essa variável será do tipo correspondente ao
    // valor atribuído não podendo atribuír valores de outros tipos.

    // Tipos: double, float, String, int, bool

    // 1.1. Declarando uma variável do tipo int
    val intNumber = 10
    println(intNumber::class) // imprime a class

    // 1.2. Declarando uma variável do tipo double
    val doubleNumber = 2.5
    println(doubleNumber::class)

    // 1.3. Declarando uma variável do tipo float
    val floatNumber = 6.34f // ou 5.21F
    println(floatNumber::class)

    // 1.4. Declarando uma variável do tipo texto e caractere
    val stringVariable = "Texto";
    println(stringVariable::class)

    // 1.5. Declarando uma variável do tipo boolean
    val boolVariable = false;
    println(boolVariable::class)


    // 2. Inferência de tipos
    // No Kotlin, é possível inferir os tipos explicitamente.

    var otherText: String = "Outro texto"
    var price: Double = 5.5
    var discount: Float = 44.3f
    var byte: Byte = 8      // inteiro de 8-bit
    var short: Short = 16   // inteiro de 16-bit
    var int: Int = 32       // inteiro de 32-bit
    var long: Long = 64     // inteiro de 64-bit
    var boolean: Boolean = true


    // 3. Conversão de tipos

    var media = 22
    var resposta = media.toDouble()
    println(resposta)

}