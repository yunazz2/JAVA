package Ex03;

class Student {
    private int no;
    private String name;
    private int score;
    private String className;

    public Student() {
    }

    public Student(int no, String name, int score, String className) {
        this.no = no;
        this.name = name;
        this.score = score;
        this.className = className;
    }


	public int getNo() {
        return no;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return no + "\t" + name + "\t" + score + "\t" + className;
    }
    
    
    public int compare(Student s1, Student s2) {
    	int scr1 = s1.getScore();
    	int scr2 = s2.getScore();
    	int num1 = s1.getNo();
    	int num2 = s2.getNo();
    	
    	int result1 = scr1 - scr2;
    	int result2 = num1 - num2;
    	
    	return result1 == 0 ? result2 : result1;
    }
}
