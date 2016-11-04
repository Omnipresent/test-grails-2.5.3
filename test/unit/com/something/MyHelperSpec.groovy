package com.something

import com.parsers.SomeParser
import grails.test.mixin.Mock

// import com.parsers.SomeParser
import grails.test.mixin.support.GrailsUnitTestMixin
import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import spock.lang.Specification

@TestMixin(GrailsUnitTestMixin)
@TestFor(MyHelper)
@Mock(SomeParser)
class MyHelperSpec extends Specification{

    def myHelper

    static doWithSpring = {
        someParser(SomeParser)
    }


    def setup() {
    	myHelper = new MyHelper()
    	myHelper.someParser = someParser
    }

    def "test callParser" () {
    	expect:
    		myHelper.callParser() == "from parser"
    }
}