package com.cardex.microservices.productenquiryservice.cardexproductenquiryservice.client;

import com.cardex.microservices.productenquiryservice.cardexproductenquiryservice.beans.ProductEnquiryBean;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cardex-product-stock-service", url="localhost:8800")
//@FeignClient(name="cardex-product-stock-service")
//@LoadBalancerClient(name = "cardex-product-stock-service",configuration=LoadBalancerConfiguration.class)
public interface ProductStockClient {

    @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductEnquiryBean checkProductStock(@PathVariable String productName,
                                                     @PathVariable String productAvailability);

}
