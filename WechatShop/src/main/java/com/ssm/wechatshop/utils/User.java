package com.ssm.wechatshop.utils;

/*
 * @author ����
 * 
 * ����΢�ŵĸ��ֲ���
 */
public class User {

	
	private Integer openid;//�û���Ψһ��ʶ
	private String nickname;//�û��ǳ�
	private String sex;//�û����Ա�ֵΪ1ʱ�����ԣ�ֵΪ2ʱ��Ů�ԣ�ֵΪ0ʱ��δ֪
	private String province;//�û�����������д��ʡ��
	private String city;//��ͨ�û�����������д�ĳ���
	private String country;//���ң����й�ΪCN
	private String headimgurl;//�û�ͷ�����һ����ֵ����������ͷ���С����0��46��64��96��132��ֵ��ѡ��0����640*640������ͷ�񣩣��û�û��ͷ��ʱ����Ϊ��
	private String privilege;//�û���Ȩ��Ϣ��json ���飬��΢���ֿ��û�Ϊ��chinaunicom��
	public Integer getOpenid() {
		return openid;
	}
	public void setOpenid(Integer openid) {
		this.openid = openid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	@Override
	public String toString() {
		return "User [openid=" + openid + ", nickname=" + nickname + ", sex=" + sex + ", province=" + province
				+ ", city=" + city + ", country=" + country + ", headimgurl=" + headimgurl + ", privilege=" + privilege
				+ "]";
	}
	
}
