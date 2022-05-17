package com.ie303m22.laptopweb.services;

import java.nio.file.Path;
import java.util.stream.Stream;

import com.ie303m22.laptopweb.model.EProductImageTypeDisplay;
import com.ie303m22.laptopweb.model.Product;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;



public interface FilesStorageService {
    public void init();

	public Resource load(String filename);

	public void deleteAll();

	public void delete(String filename);

	public Stream<Path> loadAll();

	public String save(MultipartFile file);

	// public void saveImageForProduct(MultipartFile file, Product product, EProductImageTypeDisplay type);
}
