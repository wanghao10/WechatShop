package com.ssm.wechatshop.entities;

import java.util.List;

import net.sf.json.JSONArray;

/*
 * 订单类
 *
 */
public class Indent {
    //订单编号
    private int id;
    //商品序列
    private String wareList;
    //订单总价
    private float price;
    //订单发起人
    private String userId;
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
    public String getWarelist() {
		return wareList;
    }
    @SuppressWarnings("unchecked")
    public List<Ware> getWares() {
		JSONArray jsonArray = JSONArray.fromObject(wareList);
		 return (List<Ware>) JSONArray.toCollection(jsonArray, Ware.class);
	}
    public void setWarelist(String wareList) {
        this.wareList = wareList;
    }
	public void setWares(List<Ware> wareist) {
    	JSONArray jsonArray = JSONArray.fromObject(wareist);
		this.wareList= jsonArray.toString();
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
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
        return "Indent [id=" + id + ", warelist=" + wareList + ", price=" + price + ", userId=" + userId + ", checkOut="
                + checkOut + ", delivery=" + delivery + ", status=" + status + ", time=" + time + "]";
    }

}
