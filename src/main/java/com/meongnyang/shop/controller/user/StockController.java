package com.meongnyang.shop.controller.user;

import com.meongnyang.shop.service.user.UserStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    private UserStockService userStockService;

//    @GetMapping("/product/stock")
//    public ResponseEntity<?> getCurrentStock(@RequestParam List<Long> productIds) {
////        System.out.println("현재재고 요청" + productId);
//        return ResponseEntity.ok().body(userStockService.getCurrentStock(productIds));
//    }
}
