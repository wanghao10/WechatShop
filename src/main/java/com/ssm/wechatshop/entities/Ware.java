package com.ssm.wechatshop.entities;

/*
 * 商品类
 * 
 */
public class Ware {

	//商品ID
	private int wareId;
	//商品名
	private String name;
	//商品描述
	private String describe;
	//商品价格
	private float price;
	//商品图1
	private String imageUrl1;
	//商品图2
	private String imageUrl2;
	//商品图3
	private String imageUrl3;
	//商品分类
	private String kind;
	//录入时间
	private String date;
	//楼长id
	private String managerid;
	public int getWareId() {
		return wareId;
	}
	public void setWareId(int wareId) {
		this.wareId = wareId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImageUrl1() {
		return imageUrl1;
	}
	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}
	public String getImageUrl2() {
		return imageUrl2;
	}
	public void setImageUrl2(String imageUrl2) {
		this.imageUrl2 = imageUrl2;
	}
	public String getImageUrl3() {
		return imageUrl3;
	}
	public void setImageUrl3(String imageUrl3) {
		this.imageUrl3 = imageUrl3;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getManagerid() {
		return managerid;
	}
	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}
	
}
