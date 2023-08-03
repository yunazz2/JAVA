// 검색 인터페이스
package Day08.Ex05_MultiInterface;

public interface Searchable {

	// 채널 검색 : 검색어에 해당하는 채널 번호를 반환
	int channelSearch(String keyword);
	
	// 컨텐츠 검색 : 검색어에 해당하는 컨텐츠를 반환
	// ex) ~~드라마 다시 보기!면 1화, 2화, 3화 .. 나오니까 String 배열
	String[] contentSearch(String keyword);
}
