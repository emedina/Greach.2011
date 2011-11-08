package prueba1

import com.mongodb.WriteConcern
import org.bson.types.ObjectId

class Detalle implements Serializable {

    static mapWith = 'mongo'

    ObjectId id

    String nombre
    Maestro maestro

    static constraints = {
        nombre blank: false
        maestro nullable: false
    }

    static mapping = {
        nombre index: true
        maestro index: true

        writeConcern WriteConcern.FSYNC_SAFE
    }

}



