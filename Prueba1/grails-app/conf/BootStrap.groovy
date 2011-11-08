import prueba1.Detalle

class BootStrap {

    def init = { servletContext ->
        Detalle.collection.ensureIndex('maestro.$id')
    }

    def destroy = {
    }

}



