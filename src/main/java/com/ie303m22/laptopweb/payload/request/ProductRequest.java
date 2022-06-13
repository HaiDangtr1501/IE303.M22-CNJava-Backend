package com.ie303m22.laptopweb.payload.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProductRequest {
	@NotEmpty(message = "Tên sản phẩm là bắt buộc")
	private String name;

	@NotEmpty(message = "Mô tả là bắt buộc")
	private String description;

	@NotEmpty(message = "Thể loại là bắt buộc")
	private String categoryName;

	@NotEmpty(message = "Nhãn hiệu là bắt buộc")
	private String brandName;

	@NotNull(message = "Giá là bắt buộc")
	@Min(value = 0, message = "Giá phải lớn hơn 0")
	private int price;

	@Min(value = 0, message = "Số lượng phải lớn hơn 0")
	private int quantity = 0;

	@Min(value = 0, message = "Discount phải nằm từ 0 dến 100")
	@Max(value = 100, message = "Discount phải nằm từ 0 đến 100")
	private int discount = 0;

	// Details List

	private String display;

	private String operatingSystem;

	private String fontCamera;

	private String rearCamera;

	private String chipName;

	private String internalMemory;

	private String externalMemory;

	private String sim;

	private String batteryCapacity;

	private String cpu;

	private String ram;

	private String hardDrive;

	private String size;

	private String design;

	private String graphicsCard;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getFontCamera() {
		return fontCamera;
	}

	public void setFontCamera(String fontCamera) {
		this.fontCamera = fontCamera;
	}

	public String getRearCamera() {
		return rearCamera;
	}

	public void setRearCamera(String rearCamera) {
		this.rearCamera = rearCamera;
	}

	public String getChipName() {
		return chipName;
	}

	public void setChipName(String chipName) {
		this.chipName = chipName;
	}

	public String getInternalMemory() {
		return internalMemory;
	}

	public void setInternalMemory(String internalMemory) {
		this.internalMemory = internalMemory;
	}

	public String getExternalMemory() {
		return externalMemory;
	}

	public void setExternalMemory(String externalMemory) {
		this.externalMemory = externalMemory;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	@Override
	public String toString() {
		return "ProductRequest [name=" + name + ", description=" + description + ", categoryName=" + categoryName
				+ ", brandName=" + brandName + ", price=" + price + ", quantity=" + quantity + ", discount=" + discount
				+ ", display=" + display + ", operatingSystem=" + operatingSystem + ", fontCamera=" + fontCamera
				+ ", rearCamera=" + rearCamera + ", chipName=" + chipName + ", internalMemory=" + internalMemory
				+ ", externalMemory=" + externalMemory + ", sim=" + sim + ", batteryCapacity=" + batteryCapacity
				+ ", cpu=" + cpu + ", ram=" + ram + ", hardDrive=" + hardDrive + ", size=" + size + ", design=" + design
				+ ", graphicsCard=" + graphicsCard + "]";
	}

}
