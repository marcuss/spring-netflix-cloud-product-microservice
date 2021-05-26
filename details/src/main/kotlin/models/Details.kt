package models

import lombok.ToString
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@ToString
@Entity
data class Details(
    @Id
    @GeneratedValue
    var id: Long? = null,
    var stock: Int = 0,
    var price: Double = 0.0,
    var name: String? = null
)