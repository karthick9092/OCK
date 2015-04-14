package com.ockart.entity.common;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ock_product database table.
 * 
 */
@Entity
@Table(name="ock_product")
@NamedQuery(name="OckProduct.findAll", query="SELECT o FROM OckProduct o")
public class OckProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_id")
	private long productId;

	@Column(name="product_name")
	private String productName;

	//bi-directional many-to-one association to OckProductCategory
	@ManyToOne
	@JoinColumn(name="category_id")
	private OckProductCategory ockProductCategory;

	//bi-directional many-to-one association to OckProductDtl
	@OneToMany(mappedBy="ockProduct")
	private List<OckProductDtl> ockProductDtls;

	public OckProduct() {
	}

	public long getProductId() {
		return this.productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public OckProductCategory getOckProductCategory() {
		return this.ockProductCategory;
	}

	public void setOckProductCategory(OckProductCategory ockProductCategory) {
		this.ockProductCategory = ockProductCategory;
	}

	public List<OckProductDtl> getOckProductDtls() {
		return this.ockProductDtls;
	}

	public void setOckProductDtls(List<OckProductDtl> ockProductDtls) {
		this.ockProductDtls = ockProductDtls;
	}

	public OckProductDtl addOckProductDtl(OckProductDtl ockProductDtl) {
		getOckProductDtls().add(ockProductDtl);
		ockProductDtl.setOckProduct(this);

		return ockProductDtl;
	}

	public OckProductDtl removeOckProductDtl(OckProductDtl ockProductDtl) {
		getOckProductDtls().remove(ockProductDtl);
		ockProductDtl.setOckProduct(null);

		return ockProductDtl;
	}

}