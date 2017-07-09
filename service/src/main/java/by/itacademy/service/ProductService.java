package by.itacademy.service;

import by.itacademy.entity.productEntity.Product;
import by.itacademy.service.common.BaseService;

import java.util.List;


public interface ProductService  extends BaseService<Product> {
    List<Product> getByCategoryName(String name);
    List<Product> getByNumberPageAndCount(Integer numberPage, Integer numberOfProductInPage);
    Integer getNextImageNumber();
}