package prueba1

import org.bson.types.ObjectId
import com.mongodb.WriteConcern

class Maestro implements Serializable {

    static mapWith = 'mongo'

    ObjectId id

    String nombre

    static constraints = {
        nombre blank: false
    }

    static mapping = {
        nombre index: true

        writeConcern WriteConcern.FSYNC_SAFE
    }

}
