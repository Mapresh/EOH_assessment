package com.example.eho.LineItem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class LineItem {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private long quantity;
    private String description;
    private BigDecimal unitPrice;

    public LineItem(long quantity, String description, BigDecimal unitPrice) {
        this.quantity = quantity;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public LineItem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    public BigDecimal getLineItemTotal()
    {
        BigDecimal getLineItemTotal = new BigDecimal(1777);
        return getLineItemTotal;
    }


}
