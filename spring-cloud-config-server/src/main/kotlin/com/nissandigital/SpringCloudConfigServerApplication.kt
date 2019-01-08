package com.nissandigital

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
open class SpringCloudConfigServerApplication{
	fun main(args: Array<String>) {
		runApplication<SpringCloudConfigServerApplication>(*args)
	}
}
