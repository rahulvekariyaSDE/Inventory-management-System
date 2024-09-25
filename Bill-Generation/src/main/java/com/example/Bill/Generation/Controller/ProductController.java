package com.example.Bill.Generation.Controller;

import com.example.Bill.Generation.Model.Product;
import com.example.Bill.Generation.Model.ResponseDTO;
import com.example.Bill.Generation.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("save-product-list")
    public ResponseDTO<List<Product>> saveProduct(@RequestBody List<Product> products){
        return productService.saveProduct(products);
    }

}
