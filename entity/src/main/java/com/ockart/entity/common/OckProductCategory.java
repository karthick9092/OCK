package com.ockart.entity.common;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ock_product_categories database table.
 * 
 */
@Entity
@Table(name="ock_product_categories")
@NamedQuery(name="OckProductCategory.findAll", query="SELECT o FROM OckProductCategory o")
public class OckProductCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="category_id")
	private long categoryId;

	@Column(name="category_name")
	private String categoryName;

	//bi-directional many-to-one association to OckProduct
	@OneToMany(mappedBy="ockProductCategory")
	private List<OckProduct> ockProducts;

	public OckProductCategory() {
	}

	public long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<OckProduct> getOckProducts() {
		return this.ockProducts;
	}

	public void setOckProducts(List<OckProduct> ockProducts) {
		this.ockProducts = ockProducts;
	}

	public OckProduct addOckProduct(OckProduct ockProduct) {
		getOckProducts().add(ockProduct);
		ockProduct.setOckProductCategory(this);

		return ockProduct;
	}

	public OckProduct removeOckProduct(OckProduct ockProduct) {
		getOckProducts().remove(ockProduct);
		ockProduct.setOckProductCategory(null);

		return ockProduct;
	}

}