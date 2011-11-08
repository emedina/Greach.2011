package prueba2

class IndexController {

    def index = {
        Maestro.collection.remove([:])
        Detalle.collection.remove([:])

        Maestro maestro = new Maestro(nombre: "Maestro2")
        Detalle detalle = new Detalle(nombre: "Detalle2")
        maestro.detalle = detalle
        detalle.maestro = maestro
        maestro.save(flush: true, failOnError: true)

        render "CREADO MAESTRO Y SU DETALLE"
    }

    def busqueda = {
        def maestro = Maestro.findByNombre("Maestro2")

        render "DETALLE DE MAESTRO2 ES = " + maestro.detalle.nombre
    }

}
