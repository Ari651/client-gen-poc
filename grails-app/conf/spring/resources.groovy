import org.apache.cxf.configuration.security.AuthorizationPolicy

// Place your Spring DSL code here
beans = {
    basicAuthPolicy(AuthorizationPolicy) {
        userName = application.config.getProperty('oracle.username', String, 'dummy')
        password = application.config.getProperty('oracle.password', String, 'dumbo')
        authorizationType = 'Basic'
    }
}
