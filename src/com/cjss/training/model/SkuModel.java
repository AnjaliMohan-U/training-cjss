package com.cjss.training.model;

public class SkuModel {

    private String skuId;
    private String skuSize;
    private Float price;

    public SkuModel(String skuId, String skuSize, Float price) {
        this.skuId = skuId;
        this.skuSize = skuSize;
        this.price = price;
    }

    @Override
	public String toString() {
		return "SkuModel [skuId=" + skuId + ", skuSize=" + skuSize + ", price=" + price + "]";
	}

	public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuSize() {
        return skuSize;
    }

    public void setSkuSize(String skuSize) {
        this.skuSize = skuSize;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

}