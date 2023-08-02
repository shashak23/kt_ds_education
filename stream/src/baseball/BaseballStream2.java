package baseball;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class BaseballStream2 {
	
	// battingvo 연결 생성 
	public Stream<BattingVO> readBattingCSVFile() {
		File battingFile = new File("C:\\Users\\User\\Downloads\\baseballdatabank-master\\baseballdatabank-master\\core", "Batting.csv");
		
		// 파일을 스트림으로 읽어온다.
		try {
			return	Files.lines(battingFile.toPath()) // lines의 결과가 스트림이기때문에 스트림또쓸필요없음
					.parallel()  // 스트림을 병렬로 변경, 병렬스트림은 정렬을 보장하지 못한다.
					.skip(3)
					.map(line -> new BattingVO(line.split(",")));
		} catch (IOException e) {
			return Stream.empty();
		}
		
	}
	
	// teamvo 연결 생성
	public Stream<TeamVO> readTeam() {
		File teamFile = new File("C:\\Users\\User\\Downloads\\baseballdatabank-master\\baseballdatabank-master\\core", "TeamsFranchises.csv");

		// 파일을 스트림으로 읽어온다.
		try {
			return	Files.lines(teamFile.toPath()) // lines의 결과가 스트림이기때문에 스트림또쓸필요없음
					.parallel()  // 스트림을 병렬로 변경, 병렬스트림은 정렬을 보장하지 못한다.
					.skip(1)
					.map(line -> new TeamVO(line.split(",")));
		} catch (IOException e) {
			return Stream.empty();
		}

	}
	
	public void stream1() {
		BaseballStream2 bs = new BaseballStream2();

		final int a = 10;  // 임시로 설정함
		// 1. 모든 플레이어들의 정보와 팀명을 조회
		// 배팅플레이어 = batting.csv
		// 팀 = teamsfranchiese.csv 를 조합해서 만드는 문제 
		// 누구를 기준으로 팀 정보를 뽑아올 것인가?
		bs.readBattingCSVFile()
		  .map(batting -> {  // 팀정보를 추가하기 위한 map
			  String teamId = batting.getTeamId();
			  
			  String teamName =bs.readTeam()
			    .filter(team -> team.getFranchId().equals(teamId))
			    .map(TeamVO::getFranchName)
			    .findFirst() // 한건만 가져오기 근데 first로 하면 optional이 나와야해요
			    .orElse("Unknown");  // 혹시나 없으면 언노운으로 돌리기
//			  System.out.println(a);
			  
			  TeamVO teamvo = new TeamVO();
			  teamvo.setFranchId(teamId);
			  teamvo.setFranchName(teamName);
			  
			  batting.setTeamvo(teamvo);
			  
			  
			  return batting;
		  })
//		  .forEach(batting -> {
//			  System.out.println(batting.getTeamId());
//			  System.out.println(batting.getTeamvo().getFranchName());
//		  })
;
		
		
		// 2. 
		
	}
	
	public void stream2() {
		BaseballStream2 bs = new BaseballStream2();

		// 2. boston red sox팀에서 2022년에 활동한 선수들의 아이디를 조회
		this.readTeam()
		  .filter(team -> team.getFranchName().equals("Boston Red Sox"))
		  //.map(team -> {  // map을 하게 되면 핸들링하기 어려워지는 string구조를 하고 이걸 평면화할 작업이 필요해요!
		  .flatMap(map -> {
				  return bs.readBattingCSVFile()
					  	.filter(batting -> batting.getTeamId().equals(map.getFranchId()))
					  	.filter(batting -> batting.getYear().equals("2022"));
		  })
		  .map(BattingVO::getPlayerId)
		  .forEach(System.out::println);
		
	}
	
	public void stream3() {
		// 3. Arizona Diamondbacks 팀 소속을 제외한 모든 선수들의 id만 중복없이 조회
		BaseballStream2 bs = new BaseballStream2();
//		this.readTeam()
//		  .filter(team -> team.getFranchName().equals("Arizona Diamondbacks"))
//		  
//		  .distinct()
//		  .forEach(System.out::println);
// ------------- 위 내 코드, 아래 강사님 코드 
		this.readTeam()
			//팀명이 아닌 것만 조회
			.filter(team -> !team.getFranchName().equals("Arizona Diamondbacks"))
			// Arizona Diamondbacks팀의 팀 아이디로
			// batting 정보 조회해서 stream으로 변경
			.flatMap(team -> {
				String teamId = team.getFranchId();
				return this.readBattingCSVFile()
							.filter(batting -> batting.getTeamId().equals(teamId));
			})
			// 스트림 데이터를 playerId로 변경
			.map(BattingVO::getPlayerId)
			//중복 제거 
			.distinct()
			//반복 및 출력
			.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		BaseballStream2 bs = new BaseballStream2();
		
		bs.stream2();
		bs.stream3();
	}

}
