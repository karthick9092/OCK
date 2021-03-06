package com.ockart.entity.common;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigInteger;
import java.math.BigDecimal;


/**
 * The persistent class for the ock_product_dtl database table.
 * 
 */
@Entity
@Table(name="ock_product_dtl")
public class OckProductDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="provider_id")
	private long providerId;

	private BigInteger discount;

	@Column(name="item_number")
	private String itemNumber;

	@Column(name="item_price")
	private BigDecimal itemPrice;

	private String offers;

	private String product_URL;

	//bi-directional many-to-one association to OckCompany
	@ManyToOne
	@JoinColumn(name="company_id")
	private OckCompany ockCompany;

	//bi-directional many-to-one association to OckProduct
	@ManyToOne
	@JoinColumn(name="product_id")
	private OckProduct ockProduct;

	public OckProductDtl() {
	}

	public long getProviderId() {
		return this.providerId;
	}

	public void setProviderId(long providerId) {
		this.providerId = providerId;
	}

	public BigInteger getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigInteger discount) {
		this.discount = discount;
	}

	public String getItemNumber() {
		return this.itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public BigDecimal getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getOffers() {
		return this.offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	public String getProduct_URL() {
		return this.product_URL;
	}

	public void setProduct_URL(String product_URL) {
		this.product_URL = product_URL;
	}

	public OckCompany getOckCompany() {
		return this.ockCompany;
	}

	public void setOckCompany(OckCompany ockCompany) {
		this.ockCompany = ockCompany;
	}

	public OckProduct getOckProduct() {
		return this.ockProduct;
	}

	public void setOckProduct(OckProduct ockProduct) {
		this.ockProduct = ockProduct;
	}


}