package uk.ac.westminster.products_api;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts() {
        products.add(new Product(nextId, "Product Name",255));
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);

        return product;
    }

    public Optional<Product>getProductById(Long Id){
        return products
                .stream()
                .filter(product -> product.getId().equals(Id))
                .findFirst();
    }
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

}
