/**
 * CONDICIONALES
 * */
/**
 *Ejercicio 2.1.2¶
 * Escribir un programa que almacene la cadena de caracteres contraseña en una variable,
 * pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
 */
fun ej212(){
    try {
        println("Please, insert your password: ")
        val password = "Miguelito"
        val passwordWritten = readln()
        if (passwordWritten != password){
            println("*** ERROR *** Invalid password.")
        }
        else{
            println("Correct password.")
        }
    }
    catch (e: Exception){
        println("*** ERROR *** Something unexpected happened.")
    }
}
/**
 *Ejercicio 2.1.3¶
 * Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error.
 */
fun ej213(){
    try {
        println("Please, insert the first number: ")
        val primerNum = readln().toFloat()
        println("Please, insert the second number: ")
        val segundNum = readln().toFloat()
        if (segundNum.toInt() == 0){
            println("*** ERROR *** Divisions by 0 are prohibited.")
        }


        val solucion = primerNum / segundNum

        println("The product of that division is: $solucion")
    }
    catch (e: NumberFormatException){
        println("*** ERROR *** Invalid numeric input.")
    }
}
/**
 *Ejercicio 2.1.6¶
 * Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre.
 * El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto.
 * Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.
 */
fun ej216(){
    try {
        println("Please, insert your name: ")
        val nombre = readln()
        println("Please, insert your gender: ")
        val mujer = "M"
        val hombre = "H"
        val gender = readln()

        if (gender == mujer && nombre.lowercase() < "m"){
            println("Your group is A.")
        }
        else if (gender == hombre && nombre.lowercase() > "n"){
            println("Your group is A.")
        }
        else{
            println("Your group is B.")
        }


    }
    catch (e: Exception){
        println("*** ERROR *** Something unexpected happened.")
    }
}
/**
 * Ejercicio 2.1.8¶
 * En una determinada empresa, sus empleados son evaluados al final de cada año. Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores beneficios.
 * Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas.
 * A continuación se muestra una tabla con los niveles correspondientes a cada puntuación. La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.
 *
 * Nivel	Puntuación
 * Inaceptable	0.0
 * Aceptable	0.4
 * Meritorio	0.6 o más
 * Escribir un programa que lea la puntuación del usuario e indique su nivel de rendimiento, así como la cantidad de dinero que recibirá el usuario.
 *
 */
fun ej218(){
    try {
        println("Please, insert your score: ")
        val score = readln().toFloat()

        if (score < 0.1){
            println("You have been slacking. This is Unacceptable. Your bonus will be ${2400 * 0.1}")
        }
        else if(score in 0.3..0.5){
            println("You have been working. This is Acceptable. Your bonus will be ${2400 * 0.4}")
        }
        else{
            println("You have been sent by God. This is Commendable. Your bonus will be ${2400 * 0.6}")
        }
    }
    catch (e: Exception){
        println("*** ERROR ***")
    }
}
/**
 * Ejercicio 2.1.10¶
 * La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes. Los ingredientes para cada tipo de pizza aparecen a continuación.
 *
 * Ingredientes vegetarianos: Pimiento y tofu.
 * Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.
 * Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no,
 * y en función de su respuesta le muestre un menú con los ingredientes disponibles para que elija.
 * Solo se puede eligir un ingrediente además de la mozzarella y el tomate que están en todas la pizzas.
 * Al final se debe mostrar por pantalla si la pizza elegida es vegetariana o no y todos los ingredientes que lleva.
 */
 /**fun ej2110(){
    try {
        println("Would you like a vegetarian option?")
        val vegan = readln().lowercase()
        if (vegan == "yes"){
            menuVegan()
            pedirOpVegan()





        }
        else if (vegan == "no"){
            println("Our non-vegan options are: peperoni, ham and salmon. Please, choose:")
            menuCarne()
            pedirOpCarne()

        }
    }
    catch (e: Exception){
        println("*** ERROR ***")
    }
 }

fun pedirOpCarne(): List<String> {
    try {

        val listaVacia: List<String> = emptyList<String>()
        val opcion = readln()

        if (opcion == "1") {
            listaVacia.addFirst("Peperoni")
        } else if (opcion == "2") {
            listaVacia.addFirst("Ham")
        } else if (opcion == "3") {
            listaVacia.addFirst("Salmon")
        }
        return listaVacia
    } catch (e: NumberFormatException) {
        println("*** ERROR *** Invalid input.")
    }

}
fun pedirOpVegan(): List<String> {
    try {

        val listaVacia: List<String> = emptyList<String>()
        val opcion = readln()
        if (opcion == "1") {
            listaVacia.addFirst("Tofu")
        } else if (opcion == "2") {
            listaVacia.addLast("Green Peppers")
        }

        return listaVacia

    } catch (e: NumberFormatException) {
        println("*** ERROR *** Invalid input.")
    }
}

fun menuVegan(){
    println("Our vegetarian options include: tofu and green peppers. Please, choose: ")
    println("1. Tofu")
    println("2. Green Peppers")

}

fun menuCarne(){
    println("Our non-vegan options are: peperoni, ham and salmon. Please, choose:")
    println("1. Peperoni")
    println("2. Ham")
    println("3. Salmon")
}
*/



/**
 * ITERATIVAS
 * */

/**
 *Ejercicio 2.2.2¶
 * Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
 */
fun ej222(){
    try {
        println("Please, insert a number: ")
        val numEdad = readln().toInt()
        for (i in 1..numEdad){
                print("$i, ")
        }
    }
    catch (e: NumberFormatException){
        println("*** ERROR *** Invalid number input.")
    }
}
/**
 * Ejercicio 2.2.3¶
 * Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
 */
fun ej223(){
    try {
        println("Please, insert an integer number: ")
        val num = readln().toInt()
        if (num < 0){
            println("*** ERROR *** the number must be ")
        }
        else{
            for (i in 1..num){
                if (i % 2 != 0){
                    println(i)
                }
            }
        }
    }
    catch (e: NumberFormatException){
        print("*** ERROR *** ")
    }
}
/**
 * Ejercicio 2.2.6¶
 * Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.
 *
 * *
 * **
 * ***
 * ****
 * *****
 */
fun ej226(){
    try {
        println("Please, insert an integer number: ")
        val numEntero = readln().toInt()
        for (i in 1..numEntero){
            for (j in 1.. i){
                print("* ")
            }
            println()
        }
    }
    catch (e: NumberFormatException){
        println("*** ERROR *** Invalid numeric input.")
    }
}
/**
 * Ejercicio 2.2.8¶
 * Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo.
 *
 * 1
 * 3 1
 * 5 3 1
 * 7 5 3 1
 * 9 7 5 3 1
 */
fun ej228(){
    /**
    * Este no me sale
    * */
    try {
        println("Please, insert an integer number: ")
        val numEntero = readln().toInt()
        for (i in 1..numEntero){
            if (i % 2 != 0) for (j in 1.. i) {
                print(i)
            }
            println()
        }
    }
    catch (e: NumberFormatException){
        println("*** ERROR *** Invalid numeric input.")
    }
}

/**
 * Ejercicio 2.2.13¶
 * Escribir un programa que muestre el eco de todo lo que el usuario introduzca hasta que el usuario escriba “salir” que terminará.
 *
 */
fun ej2213(){
    try {
        println("Welcome to the Echo chambers!! Anything you say will be repeated.")
        while (true) {
            val echo = readln()

            if (echo.lowercase() == "salir"){
                println("We hope to see you soon!!")
            }
            else{
                println(echo)
            }
        }

    }
    catch (e: Exception){
        println("*** ERROR *** Something unexpected happened.")
    }
}
 /**
 *Ejercicio 2.2.15¶
 * Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente, mostrar la sumatoria de todos los números positivos ingresados.
 */
fun ej2215(){
    try {
        println("Please, insert the positive integer numbers to be summed: ")
        var sum = 0
        while (true) {

            val num = readln().toInt()
            if (num == 0) {
                break
            }
            else if (num > 0){
                sum += num
            }

        }
        println("The sum of those numbers is: $sum")
    }
    catch (e: NumberFormatException){
        println("*** ERROR *** Invalid numeric input. ERROR: $e")
    }
}
/** Ejercicio 2.2.18¶
 * Solicitar al usuario que ingrese números enteros positivos y, por cada uno, imprimir la suma de los dígitos que lo componen.
 * La condición de corte es que se ingrese el número -1. Al finalizar, mostrar cuántos de los números ingresados por el usuario fueron números pares.
 *
  */
fun ej2218(){
    try {
        println("Please, insert positive integer numbers: ")
        var sum = 0
        val listaNums = mutableListOf<String>()
        while (true){

            val num = readln().toInt()
            listaNums.plus(num.toString())
            if (num == -1){
                break
            }
            else if(num > 0){
                sum += num
            }


        }
        println("The sum of those numbers is: $sum")
        /** Esto siempre está vacío parece: */
        for (i in listaNums){
            if (i.toInt() % 2 == 0){
                println(i)
            }

        }

    }
    catch (e: NumberFormatException){
        println("*** ERROR *** Invalid numeric input.")
    }
}
/** Ejercicio 2.2.19¶
 * Mostrar un menú con tres opciones:
 * 1- comenzar programa,
 * 2- imprimir listado,
 * 3- finalizar programa.
 * A continuación, el usuario debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción incorrecta, informarle del error.
 * El menú se debe volver a mostrar luego de ejecutada cada opción, permitiendo volver a elegir. Si elige las opciones 1 ó 2 se imprimirá un texto.
 * Si elige la opción 3, se interrumpirá la impresión del menú y el programa finalizará.
 */
fun ej2219(){

    println("Hello! Welcome to our app:")
    println("1. Comenzar programa")
    println("2. Imprimir listado")
    println("3. Finalizar programa")
    try {
        while (true){
            val elegirOp = readln().toInt()
            if (elegirOp == 1){
                println("My name is Yoshikage Kira. I'm 33 years old. My house is in the northeast section of Morioh, where all the villas are, and I am not married. I work as an employee for the Kame Yu department stores, and I get home every day by 8 PM at the latest. I don't smoke, but I occasionally drink. I'm in bed by 11 PM, and make sure I get eight hours of sleep, no matter what. After having a glass of warm milk and doing about twenty minutes of stretches before going to bed, I usually have no problems sleeping until morning. Just like a baby, I wake up without any fatigue or stress in the morning. I was told there were no issues at my last check-up. I'm trying to explain that I'm a person who wishes to live a very quiet life. I take care not to trouble myself with any enemies, like winning and losing, that would cause me to lose sleep at night. That is how I deal with society, and I know that is what brings me happiness. Although, if I were to fight I wouldn't lose to anyone.")

                println(" ")
                println("1. Comenzar programa")
                println("2. Imprimir listado")
                println("3. Finalizar programa")
            }
            else if (elegirOp == 2){
                println("My name is Yoshikage Kira. I'm 33 years old. My house is in the northeast section of Morioh, where all the villas are, and I am not married. I work as an employee for the Kame Yu department stores, and I get home every day by 8 PM at the latest. I don't smoke, but I occasionally drink. I'm in bed by 11 PM, and make sure I get eight hours of sleep, no matter what. After having a glass of warm milk and doing about twenty minutes of stretches before going to bed, I usually have no problems sleeping until morning. Just like a baby, I wake up without any fatigue or stress in the morning. I was told there were no issues at my last check-up. I'm trying to explain that I'm a person who wishes to live a very quiet life. I take care not to trouble myself with any enemies, like winning and losing, that would cause me to lose sleep at night. That is how I deal with society, and I know that is what brings me happiness. Although, if I were to fight I wouldn't lose to anyone.")

                println(" ")
                println("1. Comenzar programa")
                println("2. Imprimir listado")
                println("3. Finalizar programa")
            }
            else if (elegirOp == 3){
                println("Vuelva pronto!!")
                break
            }
            else{
                println("*** ERROR *** That is not a valid option.")
            }

        }




    }
    catch (e: Exception){
        println("*** ERROR *** Invalid numeric input. Error: $e")
    }
}
 /**
 * Ejercicio 2.2.25¶
 * Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga (en caso de haber más de una, mostrar la primera)
 * y cuántas palabras había. Precondición: se tomará como separador de palabras al carácter “ “ (espacio), ya sea uno o más.
 *
 */
fun ej2225(){

}
/**
 * EXCEPCIONES
 */
/**
 * Ejercicio 2.3.2¶
 * Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
 */

fun ej232(){
    try {
        println("Pleasae, insert a positive integer number: ")
        val num = readln().toInt()
        for (i in 1..num){
            if (i % 2 != 0){

                print("$i, ")

            }
        }
        println()

    }
    catch (e: NumberFormatException){
        println("*** ERROR *** Invalid numeric input.")
    }
}

/**
 * Ejercicio 2.3.3¶
 * Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas. Deberá solicitar el número hasta introducir uno correcto.
 */
fun ej233(){
   do {

       try {
        println("Please, insert a positive integer number: ")
        val num = readln().toInt()
        if (num > 0){
            for (i in num downTo 1) {

                println(i)
            }
        }
        println()

    }
    catch (e: NumberFormatException){
        println("*** ERROR *** Invalid numeric input.")
    }
}
       while (true)}
/**
 * Ejercicio 2.3.4¶
 * Escribir un programa que pida al usuario un número entero, si la entrada no es correcta, mostrará el mensaje "La entrada no es correcta" y lanzará la excepción capturada.
 */
fun ej234(){
    try {
        println("Please, insert an integer number: ")
        val num = readln().toInt()
        println(num)
    }
    catch (e: NumberFormatException){
        println("*** ERROR *** Invalid numeric input. EXCEPTION: $e")
    }
}