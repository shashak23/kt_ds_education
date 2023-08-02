package baseball;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseballStream {

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

	public static void main(String[] args) {

		BaseballStream bs = new BaseballStream();
//		bs.readBattingCSVFile()
//		.forEach((batting) -> {
//			System.out.println(batting.getPlayerId());
//		});
		
		// 1. csv내의 모든 파일 내용을 전부 출력
		bs.readBattingCSVFile()
		  .forEach((batting) -> {
			  // 출력을 일일히 해주기
//			  System.out.println("PlayerId - " + batting.getPlayerId());
//			  System.out.println("Year" + batting.getYear());
//			  System.out.println("TeamId" + batting.getTeamId());
//			  System.out.println("LgId" + batting.getLgId());
//			  System.out.println("Double Hits" + batting.getDoubleHits());
//			  System.out.println("Triple Hits" + batting.getTripleHits());
//			  System.out.println("BB -" + batting.getBb());
//			  System.out.println("HR -" + batting.getHr());
//			  System.out.println("SO-" + batting.getSo());
//			  System.out.println(" -" .repeat(50)); // 50번 반복을 해라
		  });
		
		// 2. csv내의 모든 플레이어 아이디를 오름차순으로 정력하기
		bs.readBattingCSVFile()
		  .map(BattingVO::getPlayerId)
		  .distinct()  // 정렬 연산의 비요잉 크므로 정렬전 중복데이터를 모두 제거한다.
		  .sorted()    // map이 없으면 정렬이 이상하게 나오는데 솔티드로 기본 오름차순가능하다 
		  .forEach(System.out::println)
		  ;
		  
		
		
		// 3. csv내의 모든 playerId만 조회하는데, playerId를 내림차순 정렬해서 출력
		bs.readBattingCSVFile()
		  .map(BattingVO::getPlayerId)
		  .distinct()
//		  .sorted((batting1, batting2)->batting1.compareTo(batting2)) //오름차숨
		  .sorted((batting1, batting2)->batting2.compareTo(batting1)) //내림차순
		  //.forEach(System.out::println)
		  ;
		
		// 정렬은 컴페디트? 써야해요
		
		// 4. 홈런을 31개 보다 적게 친 선수들의 정보를 홈런의 개수로 오름차순 정렬해 출력
		// 파일부터 읽어오기
		bs.readBattingCSVFile()
		  .filter(batting -> batting.getHr() < 31)
		  .sorted((batting1, batting2) -> batting1.getHr()-batting2.getHr())
		  .forEach((batting) -> {
			  // 출력을 일일히 해주기
//			  System.out.println("PlayerId - " + batting.getPlayerId());
//			  System.out.println("Year" + batting.getYear());
//			  System.out.println("TeamId" + batting.getTeamId());
//			  System.out.println("LgId" + batting.getLgId());
//			  System.out.println("Double Hits" + batting.getDoubleHits());
//			  System.out.println("Triple Hits" + batting.getTripleHits());
//			  System.out.println("BB -" + batting.getBb());
//			  System.out.println("HR -" + batting.getHr());
//			  System.out.println("SO-" + batting.getSo());
//			  System.out.println(" - " .repeat(50)); // 50번 반복을 해라
		  });
		  
		// 5. 홈런이 31개 보다 적게 친 선수들은 몇 명인지 구하기
		long hrPlayerCount = bs.readBattingCSVFile()
							  .filter(batting -> batting.getHr() < 31)
							  .count();
//			System.out.println(hrPlayerCount);;
			
			
		// 6. 2022년 볼넷을 가장 많이 당한 선수 5명 조회하기 
		bs.readBattingCSVFile()
		  .filter(batting -> batting.getYear().equals("2022"))
		  .sorted((batting1, batting2) -> batting2.getBb() - batting1.getBb())
		  .limit(5)
		  .forEach((batting) -> {
			  // 출력을 일일히 해주기
//			  System.out.println("PlayerId - " + batting.getPlayerId());
//			  System.out.println("Year" + batting.getYear());
//			  System.out.println("TeamId" + batting.getTeamId());
//			  System.out.println("LgId" + batting.getLgId());
//			  System.out.println("Double Hits" + batting.getDoubleHits());
//			  System.out.println("Triple Hits" + batting.getTripleHits());
//			  System.out.println("BB -" + batting.getBb());
//			  System.out.println("HR -" + batting.getHr());
//			  System.out.println("SO-" + batting.getSo());
//			  System.out.println(" - " .repeat(50)); // 50번 반복을 해라
		  });
		
		// 7. 2022년에 홈런을 한번이라도 친 선수 중 아무나 한명 조회하기
		Optional<BattingVO> player = bs.readBattingCSVFile()
									  .filter(batting -> batting.getYear().equals("2022"))
									  .filter(batting -> batting.getHr() > 0)
									  .findAny();
//		System.out.println(player.orElse(new BattingVO()).getPlayerId());
		
		BattingVO player1 = bs.readBattingCSVFile()
							  .filter(batting -> batting.getYear().equals("2022"))
							  .filter(batting -> batting.getHr() > 0)
							  .findAny()
							  
							  .orElse(new BattingVO());  // 기본생성자가 없어서 에러가 남
//		  System.out.println(" = " .repeat(50)); // 50번 반복을 해라
//		  System.out.println("PlayerId - " + player1.getPlayerId());
//		  System.out.println("Year" + player1.getYear());
//		  System.out.println("TeamId" + player1.getTeamId());
//		  System.out.println("LgId" + player1.getLgId());
//		  System.out.println("Double Hits" + player1.getDoubleHits());
//		  System.out.println("Triple Hits" + player1.getTripleHits());
//		  System.out.println("BB -" + player1.getBb());
//		  System.out.println("HR -" + player1.getHr());
//		  System.out.println("SO-" + player1.getSo());
//		  System.out.println(" = " .repeat(50)); // 50번 반복을 해라
//		  
		  
		  // 8. woodswi01 이 선수가 출전해 2루타를 한번이라도 친 경기연도를
		  // 내림차순으로 정렬해서 조회 
		  bs.readBattingCSVFile()
		    .filter(batting -> batting.getPlayerId().equals("yastrmi01"))
		    .filter(batting -> batting.getDoubleHits() > 0)
		    .collect(Collectors.toList())  // 스트림 종료
		    .stream()  // 스트림 다시 시작 
 		    .sorted((b1, b2) -> b2.getYear().compareTo(b1.getYear()))
		    .forEach((batting) -> {
//		    		  System.out.println(" = " .repeat(50)); // 50번 반복을 해라
//					  System.out.println("PlayerId - " + player.getPlayerId());
//					  System.out.println("Year" + player.getYear());
//					  System.out.println("TeamId" + player.getTeamId());
//					  System.out.println("LgId" + player.getLgId());
//					  System.out.println("Double Hits" + player.getDoubleHits());
//					  System.out.println("Triple Hits" + player.getTripleHits());
//					  System.out.println("BB -" + player.getBb());
//					  System.out.println("HR -" + player.getHr());
//					  System.out.println("SO-" + player.getSo());
		    });
		    
		  
		  // 9. 홈런, 2루타, 3루타, 볼넷, 삼진데이터가 모두 0보다 큰 선수들의
		  // 선수아이디만 내림차순 정렬해 조회한다.( 선수 아이디만 조회1 ) 
		  bs.readBattingCSVFile()
		    .filter(batting -> batting.getHr() > 0)
		    .filter(batting -> batting.getDoubleHits() > 0)
		    .filter(batting -> batting.getTripleHits() > 0)
		    .filter(batting -> batting.getBb() > 0)
		    .map(BattingVO::getPlayerId) // 변형을 하고 
		    .collect(Collectors.toList()) // 병렬이라서 정렬을 해야하니까 스트림을 종료 시키고
		    .stream()  // 단일스트림을 다시 시작시키고 
 		    .sorted((b1, b2) -> b2.compareTo(b1))
		    .distinct(); // 중복제거
//		    .forEach(System.out::println);
	}

}