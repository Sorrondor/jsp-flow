package com.app.vo;

import java.util.Objects;

public class MemberVO {
	Long id;
	String memberEmail;
	String memberPassword;
	String memberName;
	
	public MemberVO() {;}
	public MemberVO(Long id, String memberEmail, String memberPassword, String memberName) {
		super();
		this.id = id;
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMemeberEmail() {
		return memberEmail;
	}
	public void setMemeberEmail(String memeberEmail) {
		this.memberEmail = memeberEmail;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", memeberEmail=" + memberEmail + ", memberPassword=" + memberPassword
				+ ", memberName=" + memberName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, memberName, memberPassword, memberEmail);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(memberName, other.memberName)
				&& Objects.equals(memberPassword, other.memberPassword)
				&& Objects.equals(memberEmail, other.memberEmail);
	}
	
	
	
}
