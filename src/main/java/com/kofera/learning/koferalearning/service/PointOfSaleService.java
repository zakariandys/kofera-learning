package com.kofera.learning.koferalearning.service;

import com.kofera.learning.koferalearning.domain.TotalCartRequest;
import com.kofera.learning.koferalearning.domain.TotalCartResponse;

public interface PointOfSaleService {
    public TotalCartResponse totalCart(TotalCartRequest request);
}
