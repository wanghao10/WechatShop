package com.ssm.wechatshop.entities;

import java.util.List;

/*
 * ������
 */
public class Indent {
	//�������
	private int id;
	//��Ʒ����
	private List<Ware> warelist;
	//�����ܼ�
	private float price;
	//����������
	private int userId;
	//�Ƿ����   0Ϊδ����  1Ϊ�ѽ���
	private int checkOut;
	//����״̬  0Ϊδ����   1������ 2Ϊ�������
	private int delivery;
	//����״̬(��֧��  ������   �����)
	private String status;
	//¼��ʱ��
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Ware> getWarelist() {
		return warelist;
	}
	public void setWarelist(List<Ware> warelist) {
		this.warelist = warelist;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(int checkOut) {
		this.checkOut = checkOut;
	}
	public int getDelivery() {
		return delivery;
	}
	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Indent [id=" + id + ", warelist=" + warelist + ", price=" + price + ", userId=" + userId + ", checkOut="
				+ checkOut + ", delivery=" + delivery + ", status=" + status + ", time=" + time + "]";
	}
	
}
