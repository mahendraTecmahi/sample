package com.einfo.mahi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product_details_tab")
public class Product {

	@Id
	@GeneratedValue(generator = "prod_gen")
	@SequenceGenerator(sequenceName = "prod_sql_seq", name = "prod_gen")
	@Column(name = "prod_id_col")
	private Integer prodId;

	@Column(name = "prod_name_col")
	private String prodName;

	

	@Column(name = "prod_stock_col")
	private String prodStock;

	@Column(name = "prod_cost_col")
	private Double prodCost;

	@Column(name = "prod_note_col")
	private String prodNote;

	@Column(name = "prod_img_col")
	private String prodImg;

}
