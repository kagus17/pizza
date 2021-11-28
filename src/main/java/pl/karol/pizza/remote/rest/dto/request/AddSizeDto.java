package pl.karol.pizza.remote.rest.dto.request;

import pl.karol.pizza.domain.model.SizeType;

import java.math.BigDecimal;
import java.util.List;

public class AddSizeDto {

    private SizeType size;
    private BigDecimal price;

    public AddSizeDto() {
    }

    public AddSizeDto(SizeType size, BigDecimal price) {
        this.size = size;
        this.price = price;
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
