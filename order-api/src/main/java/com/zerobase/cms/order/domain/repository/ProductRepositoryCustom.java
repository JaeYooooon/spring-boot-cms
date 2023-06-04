package com.zerobase.cms.order.domain.repository;

import com.zerobase.cms.order.domain.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepositoryCustom {
    List<Product> searchByName(String name);
}
