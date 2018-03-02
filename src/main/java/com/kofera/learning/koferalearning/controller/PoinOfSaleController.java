package com.kofera.learning.koferalearning.controller;

import com.kofera.learning.koferalearning.domain.TotalCartRequest;
import com.kofera.learning.koferalearning.domain.TotalCartResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoinOfSaleController {

    @RequestMapping(value = "/point_of_sale/total", method = RequestMethod.POST, produces = "application/json")
    public TotalCartResponse totalCartResponse(@RequestBody TotalCartRequest totalCartRequest) {
        return null;
    }

}
