package pro.marcuss.springnetflix.playground.details

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class DetailsApplication

fun main(args: Array<String>) {
	runApplication<DetailsApplication>(*args)
}
