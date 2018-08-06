package com.example.eho.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
   private InvoiceRepository invoiceRepository;

    public Invoice addInvoice(Invoice invoice){
        return invoiceRepository.save(invoice);
    }
    public Iterable<Invoice> viewAllInvoices(){
        return invoiceRepository.findAll();
    }
    public Optional<Invoice> viewAllInvoice(int id){
        return invoiceRepository.findById(id);
    }
}
