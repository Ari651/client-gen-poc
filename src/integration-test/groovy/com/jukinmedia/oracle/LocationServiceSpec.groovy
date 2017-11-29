package com.jukinmedia.oracle

import grails.testing.mixin.integration.Integration
import grails.transaction.*
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

import javax.xml.datatype.XMLGregorianCalendar

@Integration
@Rollback
class LocationServiceSpec extends Specification {

    @Autowired
    LocationService locationServiceClient

    void "test something"() {
        expect:'Client bean is wired'
            locationServiceClient

        when:
        FindCriteria criteria = new FindCriteria()
        criteria.fetchSize = 1

        and:
        locationServiceClient

        and:
        LocationResult result = locationServiceClient.findLocation(criteria, null)

        then:
        result
        result.value.size() == 1
        result.value.first() instanceof Location
    }
}
