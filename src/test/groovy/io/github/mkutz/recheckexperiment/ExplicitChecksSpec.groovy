package io.github.mkutz.recheckexperiment

import geb.spock.GebSpec

class ExplicitChecksSpec extends GebSpec {

    def "should work"() {
        expect:
        browser.go "https://google.com"
    }
}