//al nombrarla con open lo declarado en esta clase se estiende a las demas podiendo asi usar los metodos abstractos y inicializarlos al gusto
open abstract class FuncionesComunes {


    var id: Int
    var nombre: String
    var apellido: String
    var edad: Int


    constructor(id: Int, nombre: String, apellido: String, edad: Int) {
        this.id = id
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
    }


    abstract fun concentrarse(): String


    open fun viajar(): String = "La selecion viaja"


    override fun toString(): String {
        return "Seleccion(id=$id, nombre='$nombre', apellido='$apellido', edad=$edad)"
    }


}

