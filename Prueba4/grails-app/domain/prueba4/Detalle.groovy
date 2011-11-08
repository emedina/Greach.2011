package prueba4

import com.mongodb.WriteConcern
import org.bson.types.ObjectId

class Detalle implements Serializable {

    static mapWith = 'mongo'

    ObjectId id

    String nombre

    static constraints = {
        nombre blank: false
    }

    static mapping = {
        nombre index: true

        writeConcern com.mongodb.WriteConcern.FSYNC_SAFE
    }

}
