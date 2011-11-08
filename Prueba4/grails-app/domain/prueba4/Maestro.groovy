package prueba4

import org.bson.types.ObjectId
import com.mongodb.WriteConcern

class Maestro implements Serializable {

    static mapWith = 'mongo'

    ObjectId id

    String nombre
    List<Detalle> detalles = []

    static embedded = ['detalles']

    static constraints = {
        nombre blank: false
    }

    static mapping = {
        nombre index: true

        writeConcern com.mongodb.WriteConcern.FSYNC_SAFE
    }

}





