// environment specific settings
environments {
    development {
        grails {
            mongo {
                host = "localhost"
                port = 27017
                databaseName = "prueba4"
                // Por defecto, siempre WriteConcern.FSYNC_SAFE.
                options {
                    // TODO: De momento no lo permite...
                    //w = 1
                    //wtimeout = 0
                    //fsync = true
                }
            }
        }
    }
}