package day12;

import java.util.ArrayList;

public class HighStudent {

	private int grade;
	private int classNum;
	private int stdNum;
	private String stdName;
	private ArrayList<Score> stdScores = new ArrayList<Score>();
	
	HighStudent(int grade, int classnum, int stdnum, String name){
		this.grade = grade;
		this.classNum = classnum;
		this.stdNum = stdnum;
		this.stdName = name;
	}

	public int getGrade() {
		return grade;
	}

	public int getClassNum() {
		return classNum;
	}

	public int getStdNum() {
		return stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void printInfo() {
		if(stdScores.size()==0) {
			System.out.println(stdName+"학생의 입력된 성적이 없습니다.");
		}else {
		System.out.printf("%d학년 %d반 %d번 %s 학생\n", grade, classNum, stdNum, stdName);
			for(Score i : stdScores) {
			i.printInfo();
			}
		}
		
		
	}
	
	
	public ArrayList<Score> getStdScores() {
		return stdScores;
	}
	public void setStdScores(ArrayList<Score> tmpScoreArr) {
		this.stdScores = tmpScoreArr;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classNum;
		result = prime * result + grade;
		result = prime * result + stdNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HighStudent other = (HighStudent) obj;
		if (classNum != other.classNum)
			return false;
		if (grade != other.grade)
			return false;
		if (stdNum != other.stdNum)
			return false;
		return true;
	}
	
	public Score findScore(String sub, int seme) {
		Score tmp = new Score(sub, seme);
		Score rst =null;
		for(Score i : this.getStdScores()) {
			if(tmp.equals(i)) {
				rst = i;
			} 
		}
		return rst;
	}

	
}
