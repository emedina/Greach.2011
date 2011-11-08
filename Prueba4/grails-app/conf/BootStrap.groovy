import prueba4.Maestro

class BootStrap {

    def init = { servletContext ->
        Maestro.collection.ensureIndex("detalles.nombre")
    }

    def destroy = {
    }

}
