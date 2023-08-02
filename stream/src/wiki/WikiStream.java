package wiki;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WikiStream {

	
	public Stream<WikiVO> readContentsFile(){
		
		String path = "C:\\Users\\User\\Downloads\\data\\data";
		String fileName = "10K.ID.CONTENTS";
		
		File file = new File(path, fileName);
		
		try {
			return Files.lines(file.toPath())
						.parallel()
						.map(line -> {
							String[] lineArray = line.split("\t");
							String id = lineArray[0].trim();
							String content = "";
							if(lineArray.length == 2) {
								content = lineArray[1].trim();
							}
							WikiVO wikivo = new WikiVO(id,"",content);
							return wikivo;
						});
		} catch(IOException e ) {
			return Stream.empty();
		}
	}

	// count로 읽기
	public void stream1() {
		long count = this.readContentsFile()
						.count();
		System.out.println(count);
	}
	
	// forEach로 읽기
	public void stream2() {
		this.readContentsFile()
			.forEach(wiki -> {
				System.out.println(wiki.getDesc());
			});
	}
	
	// content가 없는 거 찾아보기
	public void stream3() {
		this.readContentsFile()
		.filter(wiki -> wiki.getDesc().length() > 0)
		.forEach(wiki -> {
			System.out.println(wiki.getDesc());
		});
		
	}
	
	// 영어만 가져오기, 영단어가 모든 문장에서 몇번 쓰였는지 하기
	public void stream4() {
		// 모드 위키 내용에서 몇개의 영단어가 사용되었는지 확이낳기
		long wordCount = this.readContentsFile()
							.map(WikiVO::getDesc)  // 내용만 가져오세요
							// 영문자를 제외한 나머지는 " "으로 변경
							.map(desc -> desc.replaceAll("[^a-zA-Z]", " ")) 
							// 문장을 " "으로 자른다 stream 배열로 형태가 바뀐다.
							// 우리는 배열이 아닌 stream으로 바뀐 게 궁금한거니까? 
							// 단어를 가진 스트림으로 변경한다.
							.flatMap(desc -> Stream.of(desc.split(" ")))
							// 모든 단어를 소문자로 변경시킨다
							.map(word -> word.toLowerCase().trim())
							// 단어의 길이가 1개 이상인 것만 가져온다
							.filter(word -> word.length() > 1)
							// 디버깅용 (추줄된 단어를 미리 출력해 본다)
							.peek(System.out::println)
							.distinct()
							.count();
		System.out.println(wordCount);
		
	}
	
	// 문장의 길이가 100글자 이상인것들만 모아서 list로 변경한다.
	public void stream5() {
		List<WikiVO> wikiList = this.readContentsFile()
									.filter(wiki -> wiki.getDesc().length()>=100)
									.collect(Collectors.toList());
		// 리스트를 vo에 할당하고 리스트 형태로 출력
		for(WikiVO wikiVO : wikiList) {
			System.out.println(wikiVO.getId()+ ">");
			System.out.println(wikiVO.getDesc());
			
		}
	
	}
	
	
	// 3글자 이상의 단어들만 추출해서 list로 변경한다.
	public void stream6() {
		// 모드 위키 내용에서 몇개의 영단어가 사용되었는지 확인하기
		List<String> wordsList = this.readContentsFile()
										.map(WikiVO::getDesc)  // 내용 가져오기
										.map(desc -> desc.replaceAll("[^a-zA-Z]", " "))
										.flatMap(desc -> Stream.of(desc.split(" ")))
										.map(word -> word.toLowerCase().trim())
										.filter(word -> word.length() >= 3)
										.peek(System.out::println)
										.collect(Collectors.toList());
		System.out.println(wordsList);
	}
	
	
	// 3글자 이상의 단어들 중 A로 시작하는(대소문자 관계없이) 단어만 추출해서 list로 변경한다.
	public void stream7() {
		// 모든 위키 내용에서 몇개의 영단어가 사용되었는지 확인하기
		// 구분할려는 대소문자를 소문자열이나 대문자열로 바꿔서 하기
		// 대문자로 바꿔서 대문자열로 하기
		List<String> wordsList = this.readContentsFile()
										.map(WikiVO::getDesc)  // 내용만 가져오세요
										// 영문자를 제외한 나머지는 " "으로 변경
										.map(desc -> desc.replaceAll("[^a-zA-Z]", " ")) 
										.flatMap(desc -> Stream.of(desc.split(" ")))
										// 모든 단어를 대문자로 변경시킨다
										.map(word -> word.toUpperCase().trim())
										// 단어의 길이가 1개 이상인 것만 가져온다
										.filter(word -> word.length() >= 3)
						                .filter(word -> word.startsWith("A")) // 문자열로 시작하는거 가져오기
										// 중복, 디버깅용, 리스트로 변환하기 
						                .distinct()
										.peek(System.out::println)
										.collect(Collectors.toList());
		System.out.println(wordsList);
	
	}
	
	// 내용이 없는 문서의 번호만 추출해 list로 변경한다
	public void stream8() {
        List<String> contentList = this.readContentsFile()
							           .filter(wiki -> wiki.getDesc().isEmpty()) // 내용이 비어있는 문서를 필터링
							           .map(WikiVO::getId) // 문서의 번호만 추출
							           .collect(Collectors.toList()); // 추출된 문서 번호들을 리스트로 수집

        // 추출된 내용이 없는 문서의 번호들을 리스트 형태로 출력
        for (String documentNumber : contentList) {
            System.out.println(documentNumber);
        }
    }
	
	
	// 내용이 없는 문서의 제목을 추출해 출력한다 
	public void stream9() {
        this.readContentsFile()
                .filter(wiki -> wiki.getDesc().isEmpty()) // 내용이 비어있는 문서를 필터링
                .map(WikiVO::getTitle) // 문서의 제목을 추출
                .forEach(System.out::println); // 추출된 제목들을 출력
    }
	
	
	public static void main(String[] args) {
		WikiStream ws = new WikiStream();
//		ws.stream1();
//		ws.stream2();
//		ws.stream3();
//		ws.stream4();
//		ws.stream5();
//		ws.stream6();
//		ws.stream7();
//		ws.stream8();
		ws.stream9();
		
	}
}
