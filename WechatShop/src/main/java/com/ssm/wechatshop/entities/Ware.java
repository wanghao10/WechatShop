package com.ssm.wechatshop.entities;

/*
 * ��Ʒ��
 * 
 */
public class Ware {

	//��ƷID
	private int wareId;
	//��Ʒ��
	private String name;
	//��Ʒ����
	private String describe;
	//��Ʒ�۸�
	private float price;
	//��Ʒͼ1
	private String imageUrl1;
	//��Ʒͼ2
	private String imageUrl2;
	//��Ʒͼ3
	private String imageUrl3;
	//��Ʒ����
	private String kind;
	//¼��ʱ��
	private String date;
	//¥��id
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
