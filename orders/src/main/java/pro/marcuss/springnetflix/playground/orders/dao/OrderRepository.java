package pro.marcuss.springnetflix.playground.orders.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pro.marcuss.springnetflix.playground.orders.models.Order;

@RepositoryRestResource
public interface OrderRepository  extends JpaRepository<Order, Long> {

}