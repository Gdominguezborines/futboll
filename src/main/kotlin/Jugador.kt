/**A clase Xogador ten os seguintes :
 * atributos : id (int ), nome ( String), apelido ( String ),edade (int ), dorsal ( int ), demarcación
 *( String ).
 * métodos :
 *concentrarse () : String
 *viaxar ( ) : devuelve el pais destino
 * xogarPartido ( ) : void
 * entrenar ( ) : void
 */

class jugador(id: Int, nombre: String, apellido: String, edad: Int, dorsal: Int, demarcacion: String) :
    FuncionesComunes(id, nombre, apellido, edad) {


    override fun concentrarse(): String {
        return "La seleccion se concentra durante  8 horas"

    }

     override fun viajar(): String {

        return "Los jugadores viajan a jamaica"

    }


    fun jugarPartido(): Unit {
        println("El jugador $id $nombre $apellido jugara el partido ")
    }

    fun entrenar(): Unit {
        println("El jugador  $id $nombre $apellido  no entrenara mañana")
    }

}


