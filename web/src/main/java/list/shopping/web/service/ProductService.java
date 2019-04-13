package list.shopping.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import list.shopping.web.entity.Product;
import list.shopping.web.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> selectAll() {
        return productRepository.findAll();
    }

}
