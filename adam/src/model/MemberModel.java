package model;

public class MemberModel {
	private Integer fans_id;
	private String 	thirdPartyId;
	private String 	name;
	
	public void setfans_id(Integer fans_id) {
		this.fans_id = fans_id;
	}
	
	public Integer getfans_id() {
		return fans_id;
	}
	
	public void setthirdPartyId(String thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}
	
	public String getthirdPartyId() {
		return thirdPartyId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
