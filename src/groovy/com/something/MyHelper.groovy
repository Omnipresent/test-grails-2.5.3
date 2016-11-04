package com.something

import com.parsers.SomeParser
import org.springframework.beans.factory.annotation.Autowired

class MyHelper {


	@Autowired
	SomeParser someParser

	String callParser() {
		return someParser.fromParser()
	}


}