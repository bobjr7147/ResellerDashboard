package com.example.reseller_dashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResellerController {

    // Endpoint to calculate profit
    @GetMapping("/calculateProfit")
    public double calculateProfit(@RequestParam double costPrice, @RequestParam double sellingPrice) {
        return sellingPrice - costPrice; // Profit = Selling Price - Cost Price
    }
}
