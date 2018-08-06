package com.example.eho.Invoice;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Invoice {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long id;
    private String client;
    private long vatRate;
    private Date invoiceDate;

    public Invoice() {
    }

    public Invoice(long id, String client, long vatRate, Date invoiceDate) {
        this.id = id;
        this.client = client;
        this.vatRate = vatRate;
        this.invoiceDate = invoiceDate;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public long getVatRate() {
        return vatRate;
    }

    public void setVatRate(long vatRate) {
        this.vatRate = vatRate;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public BigDecimal getSubTotal(){

        BigDecimal getSubTot = new BigDecimal(2222);
        return getSubTot;
    }
    public BigDecimal getVat(){
        BigDecimal getVat = new BigDecimal(555);
        return getVat;
    }
    public BigDecimal getTotal(){
        BigDecimal am = new BigDecimal(1777);

        return am;
    }

}
