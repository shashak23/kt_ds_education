package baseball;

public class BattingVO {
	
	private String playerId;
	private String year;
	private String teamId;
	private String lgId;
	/**
	 * 더블 히트
	 */
	
	private int doubleHits;
	
	/**
	 * 트리플 히트
	 */
	private int tripleHits;
	
	/**
	 * 볼넷
	 * 홈런
	 * 삼진아웃
	 */
	private int bb;
	private int hr;
	private int so;
	
	public BattingVO(String[] battingArrayData) {
		this.playerId = battingArrayData[0];
		this.year =  battingArrayData[1];
		this.teamId =  battingArrayData[3];
		this.lgId =  battingArrayData[4];
		this.doubleHits = Integer.parseInt(battingArrayData[9]);
		this.tripleHits = Integer.parseInt(battingArrayData[10]);
		this.bb = Integer.parseInt(battingArrayData[11]);
		this.hr = Integer.parseInt(battingArrayData[15]);
		this.so = Integer.parseInt(battingArrayData[16]);
	}

	public BattingVO(String playerId, String year, String teamId, String lgId, int doubleHits, int tripleHits, int bb,
			int hr, int so) {
		super();
		this.playerId = playerId;
		this.year = year;
		this.teamId = teamId;
		this.lgId = lgId;
		this.doubleHits = doubleHits;
		this.tripleHits = tripleHits;
		this.bb = bb;
		this.hr = hr;
		this.so = so;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getLgId() {
		return lgId;
	}

	public void setLgId(String lgId) {
		this.lgId = lgId;
	}

	public int getDoubleHits() {
		return doubleHits;
	}

	public void setDoubleHits(int doubleHits) {
		this.doubleHits = doubleHits;
	}

	public int getTripleHits() {
		return tripleHits;
	}

	public void setTripleHits(int tripleHits) {
		this.tripleHits = tripleHits;
	}

	public int getBb() {
		return bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getSo() {
		return so;
	}

	public void setSo(int so) {
		this.so = so;
	}
	
}
