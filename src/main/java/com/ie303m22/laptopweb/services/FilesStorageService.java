package com.ie303m22.laptopweb.services;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.ie303m22.laptopweb.models.EProductImageTypeDisplay;
import com.ie303m22.laptopweb.models.Product;



public interface FilesStorageService {
    public void init();

	public Resource load(String filename);

	public void deleteAll();

	public void delete(String filename);

	public Stream<Path> loadAll();

	public String save(MultipartFile file);

	// public void saveImageForProduct(MultipartFile file, Product product, EProductImageTypeDisplay type);
}