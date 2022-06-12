package com.ie303m22.laptopweb.services;

import java.util.List;
import java.util.Optional;

import com.ie303m22.laptopweb.models.EProductImageTypeDisplay;
import com.ie303m22.laptopweb.models.Product;
import com.ie303m22.laptopweb.models.ProductImage;

public interface ProductImageService {

	public List<ProductImage> findByProductAndType(Product product, EProductImageTypeDisplay typeImage);

	public Optional<ProductImage> findFirstByProductAndType(Product product, EProductImageTypeDisplay typeImage);

	public void deleteByProduct(Product product);

	public void deleteByProductAndType(Product product, EProductImageTypeDisplay typeImage);

	public void save(Product product, String fileName, EProductImageTypeDisplay type);
}
