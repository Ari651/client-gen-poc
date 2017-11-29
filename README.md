# client-gen-poc
Simple Grails 3 client class generation from Oracle Cloud Financial Services SOAP API, using the **cxf-client** plugin
## Try it out
1. Add configuration keys (and values) for **oracle.username** and **oracle.password**
2. Run `grails test-app` and watch it fail to compile
3. Run `grails wsdl-to-java` to generate the client classes
4. Run `grails test-app` and watch the test pass
