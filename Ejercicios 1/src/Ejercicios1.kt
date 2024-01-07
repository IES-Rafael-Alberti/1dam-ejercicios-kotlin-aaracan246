import java.text.DecimalFormat


/*
Ejercicio 1.2.4¶
Escribe un programa que le pida al usuario una temperatura en grados Celsius,
la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.
*/
fun ej124(){
    try {
        println("Please, insert the temperature (in ºC) to be converted (to Fahrenheit): ")
        val tempCel = readln().toInt()
        println("$tempCel in ºC is ${(tempCel * 9/5) + 32}")
    }
    catch (e: NumberFormatException){
        println("*** ERROR *** That is an invalid number.")
    }
}


/*Ejercicio 1.2.6¶
Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el IVA que se ha pagado
y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).
*/
fun ej126(){
    try {
        println("Please, insert the full price of the product: ")
        val valorFinal = readln().toInt()
        val valorSinIva = valorFinal / 1.1
        println("The price of that product without VAT is: $valorSinIva, and you have paid ${valorFinal - valorSinIva}")
    }
    catch (e: NumberFormatException){
        println("*** ERROR *** That is an invalid input.")
    }
}
/*
Ejercicio 1.2.12¶
Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros),
calcule el índice de masa corporal y lo almacene en una variable,
y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa corporal calculado redondeado con dos decimales.
*/
fun ej1212(){
    try {
        println("Please, insert your weight (in kg) and your height (in m): ")
        println("Weight: ")
        val weight = readln().toFloat()
        println("Height: ")
        val height = readln().toFloat()

        println("Your BMI is ${weight / (height * height)} ")
    }
    catch (e: NumberFormatException){
        println("Please, insert a valid input.")
    }
}

/*Ejercicio 1.2.15¶
Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año.
Estos ahorros debido a intereses, que no se cobran hasta finales de año,
se te añaden al balance final de tu cuenta de ahorros.
Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario.
Después el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos decimales.

Calcula el interés: capital * (1 + interes)
*/
fun ej1215(){
    try {
        println("Please, insert your savings: ")
        val savings = readln().toFloat()
        val firstYear = savings * 1.04
        val secondYear = firstYear * 1.04
        val thirdYear = secondYear * 1.04
        val capNum = DecimalFormat("#.00")

        println("Your savings will be ${capNum.format(firstYear)} the first year, ${capNum.format(secondYear)} the second one and ${capNum.format(thirdYear)} the third one.")
    }
    catch (e: NumberFormatException){
        println("*** ERROR *** That is not a valid input.")
    }
}

/*
Ejercicio 1.2.18¶
Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre por pantalla el nombre completo del usuario tres veces,
una con todas las letras minúsculas, otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula.
El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.
*/
fun ej1218(){
    try {
        println("Please, insert your full name: ")
        val name = readln().lowercase()

        println("Your name in lowercase is ${name.lowercase()}.\n, Your name in uppercase is ${name.uppercase()}.\n")

        val list = name.split(" ")
        for (i in list){

            val item = i.replaceFirstChar { it.uppercase() }

            println("Your full name starting in capital letters: $item")
        }


    }
    catch (e: Exception){

        println("*** ERROR *** That is not a valid input.")

    }
}


/*
Ejercicio 1.2.20¶
Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código del país +34,
y la extensión tiene dos dígitos (por ejemplo +34-913724710-56).
Escribir un programa que pregunte por un número de teléfono con este formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión.
*/
fun ej1220(){
    try {
        println("Please, insert a phone number (format: +34-913724710-56): ")
        val num = readln()
        val numSeparado = num.split("-")
        println(numSeparado[1])
    }
    catch (e: Exception){
        println("*** ERROR ***")
    }
}

/*
Ejercicio 1.2.21¶
Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla la frase invertida.
*/
fun ej1221(){
    try {
        println("Please, insert a sentence to be reversed: ")
        val frase = readln()
        val fraseInv = frase.reversed()
        println(fraseInv)
    }
    catch (e: Exception){
        println("*** ERROR ***")
    }

}

/*
Ejercicio 1.2.22¶
Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal,
y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.
*/
fun ej1222(){
    try {
        println("Please, insert a sentence and a vowel: ")
        println("Please, insert a sentence: ")
        val frase = readln()
        println("Please, insert a vowel: ")
        val vocal = readln()

        println(frase.replace(vocal, vocal.uppercase()))
    }
    catch (e: Exception){
        println("*** ERROR ***")
    }

}
/*
Ejercicio 1.2.24¶
Escribir un programa que pregunte por consola el precio de un producto en euros con dos decimales
y muestre por pantalla el número de euros y el número de céntimos del precio introducido.
*/
fun ej1224(){
    try {
        println("Please, insert the price of the product (format: #.00): ")
        val valor = readln()
        val cents = valor.split(".")

        println("The full price of your product is $valor€. ${cents[0]}€ and ${cents[1]} cents.")
    }
    catch (e: Exception){
        println("*** ERROR ***")

    }

}
/*
Ejercicio 1.2.25¶
Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla, el día, el mes y el año.
Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan con un solo carácter.
*/
fun ej1225(){
    try {
        println("Please, insert your date of birth (format: dd/mm/yyyy): ")
        val fecha = readln().split("/")
        for (i in fecha){

            /** Función -> padStart: te permite capear hasta un número máx y por qué sustituirlo. */

            println(i.padStart(2, '0'))

        }
    }
    catch (e: Exception){
        println("*** ERROR ***")
    }
}

/*
Ejercicio 1.2.26¶
Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas,
y muestre por pantalla cada uno de los productos en una línea distinta.
*/
fun ej1226(){
    try {
        println("Please, insert the items in your shop list: ")
        val compra = readln().split(",")
        for (i in compra){

            println(i.trim())
        }


        println(compra)
    }
    catch (e: Exception){
        println("*** ERROR ***")

    }

}

/*
Ejercicio 1.2.27¶
Escribir un programa que pregunte el nombre el un producto, su precio y un número de unidades
y muestre por pantalla una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos enteros y 2 decimales,
el número de unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.
*/
fun ej1227(){
    /** NO ENTIENDO ESTE*/
    try {
        println("Please, insert the name of the product: ")
        val namProd = readln()
        println("Please, insert the price of the product: ")
        val priceProd = readln()
        println("Please, insert the number of units: ")
        val numberProd = readln()

        println()
    }
    catch(e: Exception){
        println("*** ERROR ***")
    }

}