package baseball;

public class TeamVO {

	private String franchId;
	private String franchName;
	
	// 빈 생성자
	public TeamVO() {
		
	}
	
	public TeamVO(String[] teamInfoArray) {
		super();
		this.franchId = teamInfoArray[0];
		this.franchName = teamInfoArray[1];
	}
	public String getFranchId() {
		return franchId;
	}
	public void setFranchId(String franchId) {
		this.franchId = franchId;
	}
	public String getFranchName() {
		return franchName;
	}
	public void setFranchName(String franchName) {
		this.franchName = franchName;
	}
	
	
}
