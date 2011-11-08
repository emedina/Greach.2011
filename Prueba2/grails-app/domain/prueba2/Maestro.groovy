package prueba2

import org.bson.types.ObjectId
import com.mongodb.WriteConcern

class Maestro implements Serializable {

    static mapWith = 'mongo'

    ObjectId id

    String nombre

    Detalle detalle
    //static hasOne = [detalle: Detalle]

    static constraints = {
        nombre blank: false
    }

    static mapping = {
        nombre index: true

        writeConcern com.mongodb.WriteConcern.FSYNC_SAFE
    }

}
