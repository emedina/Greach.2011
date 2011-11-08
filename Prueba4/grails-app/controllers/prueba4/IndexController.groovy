package prueba4

import com.mongodb.DBRef
import org.bson.types.ObjectId

class IndexController {

    def index = {
        Maestro.collection.remove([:])
        Detalle.collection.remove([:])

        Maestro maestro = new Maestro(nombre: "Maestro4")
        maestro.detalles << new Detalle(nombre: "Detalle4.1")
        maestro.detalles << new Detalle(nombre: "Detalle4.2")
        maestro.detalles << new Detalle(nombre: "Detalle4.3")
        maestro.save(flush: true, failOnError: true)

        render "CREADO MAESTRO Y SU DETALLE"
    }

    def busqueda = {
        def maestro = Maestro.findByNombre("Maestro4")

        render "DETALLES DE MAESTRO4 SON = " + maestro.detalles.nombre
    }

}
