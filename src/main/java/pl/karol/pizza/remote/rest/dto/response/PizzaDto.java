package pl.karol.pizza.remote.rest.dto.response;

import java.util.List;

public class PizzaDto {
    private Integer id;
    private String name;
    private List<SizeDto> Sizes;

    public PizzaDto() {
    }

    public PizzaDto(Integer id, String name, List<SizeDto> sizes) {
        this.id = id;
        this.name = name;
        Sizes = sizes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizeDto> getSizes() {
        return Sizes;
    }

    public void setSizes(List<SizeDto> sizes) {
        Sizes = sizes;
    }
}
