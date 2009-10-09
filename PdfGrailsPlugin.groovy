class PdfGrailsPlugin {
    // the plugin version
    def version = "0.4.5"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Aaron Eischeid"
    def authorEmail = "a.eischeid@gmail.com"
    def title = "Provides a simple way to generate PDFs from web pages"
    def description = '''
    Pdf plugin allows your Grails application to generate PDFs and send them
    to the browser by converting existing pages or templates in your application
    to PDF on the fly. The underlying system uses the xhtmlrenderer component 
    from java.net to do the rendering.
    '''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/Pdf+Plugin"

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
