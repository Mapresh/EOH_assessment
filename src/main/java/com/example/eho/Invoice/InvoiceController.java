package com.example.eho.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping(method = RequestMethod.POST, value = "/invoices")
    public Invoice addInvoice(@RequestBody Invoice invoice){
        return invoiceService.addInvoice(invoice);
    }
    @RequestMapping("/invoices")
    public List<Invoice> viewAllInvoices(){
        return (List<Invoice>) invoiceService.viewAllInvoices();
    }
    @RequestMapping("/invoices/{id}")
    public Optional<Invoice> viewAllInvoice(@PathVariable int id){
        return invoiceService.viewAllInvoice(id);
    }
}
