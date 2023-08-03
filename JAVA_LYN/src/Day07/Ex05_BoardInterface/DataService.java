// DataAccess에서 메소드만 가지고 왔는데 지금 이건 인터페이스니까 기본 형태가 public이라 public은 지워도 된다.
package Day07.Ex05_BoardInterface;

public interface DataService {
	
	 Text[] selectList();
	
	 Text select(int boardNo);
	
	 int insert(Text text);
	
	 int update(Text text);
	
	 int delete(int no);

}
