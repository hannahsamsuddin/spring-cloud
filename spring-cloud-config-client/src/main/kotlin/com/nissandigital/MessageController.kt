package com.nissandigital

import org.springframework.web.bind.annotation.RestController
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RefreshScope
open class MessageController{
	
	@Value("${message}")
	private var message:String = ""
	
	@RequestMapping("/message")
	fun getMessage():String{
		return this.message
	}
	
}