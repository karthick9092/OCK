package com.ockart.util.amazon.bean;

/***
 * The POJO for the product data.
 * Please refer to the instructions.txt
 *
 * @author Logesh.U
 * @version 1.0
 * Copyright (c) Refulgent Technologies Pvt. Ltd.
 */


public class ProductInfo {

    /**
     * Below fields list is not a comprehensive one.
     *
     */

    private String id;
    private String title;
    private String description;
    private Double mrp;
    private Double sellingPrice;
    private String productUrl;
    private boolean inStock;
    private boolean isEmiAvailable;

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public boolean isEmiAvailable() {
        return isEmiAvailable;
    }

    public void setEmiAvailable(boolean emiAvailable) {
        isEmiAvailable = emiAvailable;
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
