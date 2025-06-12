package mbcboard.dto;

public class MemberDTO {

	private String mID;
	private String mPW;
	private String mname;
	private String mgen;
	private String mEmail;
	
	public String getmID() {
		return mID;
	}
	public String getmPW() {
		return mPW;
	}
	public String getMname() {
		return mname;
	}
	public String getMgen() {
		return mgen;
	}
	public String getmEmail() {
		return mEmail;
	}
	public void setmID(String mID) {
		this.mID = mID;
	}
	public void setmPW(String mPW) {
		this.mPW = mPW;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public void setMgen(String mgen) {
		this.mgen = mgen;
	}
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	
}
