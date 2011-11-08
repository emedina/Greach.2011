package prueba3

import org.bson.types.ObjectId
import com.mongodb.WriteConcern

class Maestro implements Serializable {

    static mapWith = 'mongo'

    ObjectId id

    String nombre

    static hasMany = [detalles: Detalle]

    static constraints = {
        nombre blank: false
    }

    static mapping = {
        nombre index: true

        writeConcern com.mongodb.WriteConcern.FSYNC_SAFE
    }

}
