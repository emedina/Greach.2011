package prueba3

class IndexController {

    def index = {
        Maestro.collection.remove([:])
        Detalle.collection.remove([:])

        Maestro maestro = new Maestro(nombre: "Maestro3")
        maestro.addToDetalles(new Detalle(nombre: "Detalle3.1"))
        maestro.addToDetalles(new Detalle(nombre: "Detalle3.2"))
        maestro.addToDetalles(new Detalle(nombre: "Detalle3.3"))
        maestro.save(flush: true, failOnError: true)

        render "CREADO MAESTRO Y SU DETALLE"
    }

    def busqueda1 = {
        def maestro = Maestro.findByNombre("Maestro3")

        render "DETALLES DE MAESTRO3 SON = " + maestro.detalles.nombre
    }

    def busqueda2 = {
        def maestro = Maestro.findByNombre("Maestro3")

        render "DETALLES ORDENADOS EN MEMORIA DE MAESTRO3 SON = " + maestro.detalles.sort { it.nombre }.nombre
    }

    def busqueda3 = {
        def maestro = Maestro.withCriteria {
            'eq' 'nombre', "Maestro3"
            detalles {
                order 'nombre'
            }
        }

        render "DETALLES ORDENADOS EN BD DE MAESTRO3 SON = " + maestro[0].detalles.nombre
    }

}
