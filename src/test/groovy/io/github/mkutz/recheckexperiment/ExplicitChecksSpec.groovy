package io.github.mkutz.recheckexperiment

import de.retest.recheck.Recheck
import de.retest.recheck.RecheckImpl
import geb.spock.GebSpec

class ExplicitChecksSpec extends GebSpec {

    Recheck re = new RecheckImpl()

    def setup() {
        re.startTest("ExplicitChecks")
    }

    def "should work"() {
        when:
        go "https://google.com"

        then:
        re.check(browser.driver, "open")
        re.capTest()
    }

    def cleanup() {
        re.cap()
    }
}