package pl.karol.pizza.remote.rest.dto.common;

import pl.karol.pizza.domain.model.StatusType;
import pl.karol.pizza.remote.rest.dto.common.PersonOrderDto;
import pl.karol.pizza.remote.rest.dto.common.PizzaOrderDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private StatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto persons;

    public OrderDto() {
    }

    public OrderDto(Integer id, StatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto persons) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.persons = persons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPersons() {
        return persons;
    }

    public void setPersons(PersonOrderDto persons) {
        this.persons = persons;
    }
}
