/**A clase Adestrador ten os serguintes :
 * atributos : id (int ), nome ( String), apelido ( String ),edade (int ), idFederacion ( String )
 * métodos :
 * concentrarse () : String
 * viaxar ( ) : pais destino
 * dirixirPartido ( ) : void
 * dirixirAdestramento ( ) : void
 */
import javax.swing.JOptionPane


class Entrenador(id: Int, nombre: String, apellido: String, edad: Int, idFederacion: String) :

    FuncionesComunes(id, nombre, apellido, edad) {


    //segundo constructor

    // metodos (fun)
    override fun concentrarse():String{
     val cuanto=JOptionPane.showInputDialog("Cuanto dura la concentraccion")
        println("El jugador  se concentra durante $cuanto horas")
        return cuanto

    }


       override fun viajar(): String {
           val donde=JOptionPane.showInputDialog("A donde es el viaje")
           println("Los entrenadores se fueron de viaje a $donde")
           return  donde

    }

    fun pautarPartido(): Unit {
        println("El entrenador $id $nombre $apellido esta pautando el partido y  ")
    }

    fun pautarEntrenamiento(): Unit {
        println("El entrenador $id $nombre $apellido esta pautando el entrenamiento y ")
    }


}
