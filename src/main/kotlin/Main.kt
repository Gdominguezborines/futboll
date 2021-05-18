/**En cada clase debes definir o constructor con parámetros , os métodos de acceso (¿hay que hacerlos en Kotlin?)
 *e sobreescribir o método toString da superclase .
 *3- O metodo concentrarse visualizará a mensaxe “concentrase a selección e o tempo de concentración“
 *4- O método viaxar , da superclase , visualizara a mensaxe “ viaxa a selección “. Cada subclase sobreescribe éste método ca mensaxe “ viaxan os xogadores …...”.
 *5- Define a fun main cas seguintes sentencias :
 * instancia un obxecto de cada clase
 * chama ao método concentrarse a través de cada obxecto. ¿ Que observas ?.
 * Invoca ao método viaxar a través de cada obxecto. ¿ Cal é a saida ?
 * ¿ Podes invocar a un método da superclase con un obxecto dunha subclase ?.Comprobao
 */


fun main(args: Array<String>) {

    //Creo al Jugador1
    val jugadorPro = jugador(1 ,"Gabriel","Dominguez Borines",30 ,7 ,"Defensa")
    val jugadorx = jugador(2 ,"Pedro","De La Rosa",35 ,10 ,"Delantero")
    // Creo al Entrenador
    val entrenador = Entrenador(3, "Daniel", "Prieto Alonso", 42, "134500")
    val entrenador2 = Entrenador(4, "Juan", "Martinez Perez", 46, "120020")

    // llama al metodo concentrarse pero segun quien llame se obtiene una respuesta diferente
    jugadorPro.concentrarse()
    entrenador.concentrarse()


    // llama al Viajar pero segun quien llame se obtiene una respuesta diferente
    jugadorPro.viajar()
    entrenador.viajar()
    println(" ")

    //llamaos aentrenamiento
    entrenador2.pautarEntrenamiento()
    jugadorx.entrenar()
    println(" ")

    //llamamos a jujgar
    entrenador.pautarPartido()
    jugadorPro.jugarPartido()


}
