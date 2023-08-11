// DataAccess에서 메소드만 가지고 왔는데 지금 이건 인터페이스니까 기본 형태가 public이라 public은 지워도 된다.
package Day14.Board.DAO;

import java.util.List;

import Day14.Board.DTO.Text;

public interface DataService {
	
	 List<? extends Text> selectList();

	 List<? extends Text> selectList(int no);
	
	 Text select(int no);
	
	 int insert(Text text);
	
	 int update(Text text);
	
	 int delete(int no);

}
