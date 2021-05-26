package dao

import models.Details
import org.springframework.boot.CommandLineRunner
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Component

@RepositoryRestResource
interface DetailsRepository : JpaRepository<Details?, Long?>

@Component
internal class DetailsInitializer(private val detailsRepository: DetailsRepository) :
    CommandLineRunner {
    @Throws(Exception::class)
    override fun run(vararg args: String) {
        var d = Details()
        d.id = 1L
        d.stock = 1
        d.price = 1.00
        d.name = "Test"
        detailsRepository.save(d)
    }
}