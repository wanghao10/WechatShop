package com.ssm.wechatshop.entities;

import java.util.List;

/*
 * ���ﳵ
 * 
 */
public class ShoppingCart {

	//���ﳵID
	private int cartId;
	//��Ʒ����
	private List<Ware> warelists;
	//���ﳵ�ܼ�
	private float price;
	//����״̬
	private int status;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public List<Ware> getWarelists() {
		return warelists;
	}
	public void setWarelists(List<Ware> warelists) {
		this.warelists = warelists;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ShoppingCart [cartId=" + cartId + ", warelists=" + warelists + ", price=" + price + ", status=" + status
				+ "]";
	}
	
}
