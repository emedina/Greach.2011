package prueba1

class IndexController {

    def index = {
        Maestro.collection.remove([:])
        Detalle.collection.remove([:])

        Maestro maestro = new Maestro(nombre: "Maestro1")
        maestro.save(flush: true, failOnError: true)

        Detalle detalle = new Detalle(nombre: "Detalle1")
        detalle.maestro = maestro
        detalle.save(flush: true, failOnError: true)

        render "CREADO MAESTRO Y SU DETALLE"
    }

    def busqueda = {
        def maestro = Maestro.findByNombre("Maestro1")
        def detalle = Detalle.findByMaestro(maestro)

        render "DETALLE DE MAESTRO1 ES = " + detalle.nombre
    }

}
