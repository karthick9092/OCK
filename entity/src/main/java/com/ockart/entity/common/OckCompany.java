package com.ockart.entity.common;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ock_company database table.
 * 
 */
@Entity
@Table(name="ock_company")
public class OckCompany implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="company_id")
	private long companyId;

	@Column(name="company_name")
	private String companyName;

	@Column(name="create_by")
	private Long createBy;

	@Column(name="create_time")
	private Timestamp createTime;

	@Column(name="update_by")
	private Long updateBy;

	@Column(name="update_time")
	private Timestamp updateTime;

	private Long version;

	//bi-directional many-to-one association to OckProductDtl
	@OneToMany(mappedBy="ockCompany")
	private List<OckProductDtl> ockProductDtls;

	public OckCompany() {
	}

	public long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public List<OckProductDtl> getOckProductDtls() {
		return this.ockProductDtls;
	}

	public void setOckProductDtls(List<OckProductDtl> ockProductDtls) {
		this.ockProductDtls = ockProductDtls;
	}

	public OckProductDtl addOckProductDtl(OckProductDtl ockProductDtl) {
		getOckProductDtls().add(ockProductDtl);
		ockProductDtl.setOckCompany(this);

		return ockProductDtl;
	}

	public OckProductDtl removeOckProductDtl(OckProductDtl ockProductDtl) {
		getOckProductDtls().remove(ockProductDtl);
		ockProductDtl.setOckCompany(null);

		return ockProductDtl;
	}

}