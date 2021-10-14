package com.cjss.training.model;

import java.util.List;

public class ProductsModel {

    private String productId;
    private String productName;
    private List<SkuModel> skus;


    public ProductsModel(String productId, String productName, List<SkuModel> skus) {
        this.productId = productId;
        this.productName = productName;
        this.skus = skus;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public List<SkuModel> getSkus() {
        return skus;
    }

    @Override
	public String toString() {
		return "ProductsModel [productId=" + productId + ", productName=" + productName + ", skus=" + skus + "]";
	}

	public void setSkus(List<SkuModel> skus) {
        this.skus = skus;
    }
}