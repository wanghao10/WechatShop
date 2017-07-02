package com.ssm.wechatshop.entities;

import java.util.List;

/*
 * 订单类
 *
 */
public class Indent {
    //订单编号
    private int id;
    //商品序列
    private List<Ware> warelist;
    //订单总价
    private float price;
    //订单发起人
    private int userId;
    //楼长手机号
    private String managerPhone;
    //是否结算   0为未结算  1为已结算
    private int checkOut;
    //配送状态  0为未配送   1配送中 2为配送完成
    private int delivery;
    //交易状态(待支付  带评价   已完成)
    private String status;
    //录入时间
    private String time;
    /**
	 * @return managerPhone
	 */
	public String getManagerPhone() {
		return managerPhone;
	}
	/**
	 * @param managerPhone 要设置的 managerPhone
	 */
	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}
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
