package Day07.Ex05_BoardInterface;

public class CommentAccess extends JDBConnection implements DataService {

	@Override
	public Text[] selectList() {
		return null;
	}

	@Override
	public Text select(int boardNo) {
		return null;
	}

	@Override
	public int insert(Text text) {
		return 0;
	}

	@Override
	public int update(Text text) {
		return 0;
	}

	@Override
	public int delete(int no) {
		return 0;
	}
	

}
