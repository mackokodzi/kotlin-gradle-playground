package org.mackokodzi

import spock.lang.Specification
import spock.lang.Subject

class AppTest extends Specification {

    @Subject
    App classUnderTest = new App()

    def 'app should have a greeting'() {
        when:
        def result = classUnderTest.greeting

        then:
        result == "Hello world."
    }
}