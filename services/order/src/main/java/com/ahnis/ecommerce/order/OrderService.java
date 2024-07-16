package com.ahnis.ecommerce.order;

import com.ahnis.ecommerce.customer.CustomerClient;
import com.ahnis.ecommerce.exception.BusinessException;
import com.ahnis.ecommerce.product.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final CustomerClient customerClient;
    private final ProductClient productClient;
    public Integer createOrder(OrderRequest request) {
        //Check The Customer OPEN FIEGN
        var customer = customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot Create Order"));

        //Purchase The products using product Microservice( RestTemplate)


        //Persist The Order Object
        //Persist The Order Lines
        //TODO
        //Issue The Payment Process
        //TODO
        //Send Order Confirmation --> Notification-ms --KAFKA

    }
}
