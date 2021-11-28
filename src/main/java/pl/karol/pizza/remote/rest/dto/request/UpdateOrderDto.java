package pl.karol.pizza.remote.rest.dto.request;

import pl.karol.pizza.domain.model.StatusType;
import pl.karol.pizza.remote.rest.dto.common.PersonOrderDto;
import pl.karol.pizza.remote.rest.dto.common.PizzaOrderDto;

import java.util.List;

public class UpdateOrderDto {

    private StatusType status;

    private List<PizzaOrderDto> pizzas;

    private PersonOrderDto person;

    public UpdateOrderDto() {
    }

    public UpdateOrderDto(StatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
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

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
