package com.cardex.microservices.productenquiryservice.cardexproductenquiryservice.client;

import com.cardex.microservices.productenquiryservice.cardexproductenquiryservice.beans.ProductEnquiryBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cardex-product-stock-service")

public interface ProductStockClient {

    @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductEnquiryBean checkProductStock(@PathVariable String productName,
                                                     @PathVariable String productAvailability);

}
