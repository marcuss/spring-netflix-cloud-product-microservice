package pro.marcuss.springnetflix.playground.orders.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private int quantity;

    private double price;
}