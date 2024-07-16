package com.ahnis.ecommerce.product;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.MediaType.*;

@Service
@RequiredArgsConstructor
public class ProductClient {
    //TODO
//    @Value("${application.config.product-url}")
    private String productUrl;
    private final RestTemplate restTemplate;

    public List<PurchaseResponse> purchaseProducts(List<PurchaseRequest> requestBody) {
        var headers = new HttpHeaders();
        headers.set(CONTENT_TYPE, APPLICATION_JSON_VALUE);
        HttpEntity<List<PurchaseRequest>> request = new HttpEntity<>(requestBody, headers);
        ParameterizedTypeReference<List<PurchaseResponse>> responseType =
//                new ParameterizedTypeReference<>() {
//                };
//        ResponseEntity<List<PurchaseResponse>> responseEntity =
//                restTemplate.exchange(productUrl+"/purchase",
//                        POST,
//                        req)
                //TODO
                ;return null;

    }
}
