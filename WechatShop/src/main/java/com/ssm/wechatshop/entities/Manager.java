package com.ssm.wechatshop.entities;

public class Manager {

	// Ψһ��ʶ ¥�����
	private int managerId;
	// ¥������
	private String name;
	// ����
	private String password;
	// ¥��
	private String buildingNo;
	// ѧУ(��ȷ��У��)
	private String school;
	// �绰
	private String phone;
	// ���֤��
	private String idNumber;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", name=" + name + ", password=" + password + ", buildingNo="
				+ buildingNo + ", school=" + school + ", phone=" + phone + ", idNumber=" + idNumber + "]";
	}

}
