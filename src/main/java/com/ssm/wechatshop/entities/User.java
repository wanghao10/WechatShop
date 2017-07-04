package com.ssm.wechatshop.entities;

import java.util.List;

/*
 * 用户类
 *
 * 抓取微信登录信息
 */

public class User {
    // 用户标识
    private String openId;
    // 用户昵称
    private String nickname;
    // 性别（1是男性，2是女性，0是未知）
    private int sex;
    // 国家
    private String country;
    // 省份
    private String province;
    // 城市
    private String city;
    // 用户头像链接
    private String headImgUrl;
    // 用户特权信息
//    private List<String> privilegeList;


    //补充：最后关注时间
    private String subscribeTime;

    //关注状态：1  0 未关注 未关注
    private Integer subscribe;


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }



    public String getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(String subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    @Override
    public String toString() {
        return "User{" +
                "openId='" + openId + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex=" + sex +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", headImgUrl='" + headImgUrl + '\'' +

                ", subscribeTime='" + subscribeTime + '\'' +
                ", subscribe=" + subscribe +
                '}';
    }

    public User(String openId, String nickname, int sex, String country, String province, String city, String headImgUrl, List<String> privilegeList, String subscribeTime, Integer subscribe) {
        this.openId = openId;
        this.nickname = nickname;
        this.sex = sex;
        this.country = country;
        this.province = province;
        this.city = city;
        this.headImgUrl = headImgUrl;
        this.subscribeTime = subscribeTime;
        this.subscribe = subscribe;
    }

    public User(){}
}
