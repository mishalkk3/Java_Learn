package com.bharath.product.dao;

import com.bharath.product.dto.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDAOImplTest {

    @Test
    public void createShouldCreateAProduct() {
        ProductDAO dao = new ProductDAOImpl();
        Product product = new Product();
        product.setId(1);
        product.setName("Iphone");
        product.setDescription("It's a luxury");
        product.setPrice(800);
        dao.create(product);
        dao.create(product);
        Product result = dao.read(1);

        assertNotNull(result);
        assertEquals("Iphone", result.getName());
    }

}
