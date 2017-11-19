package Àüº´¹Î_201702068_½Ç½À10;

public class Student {

	private int _scoreKor;
	private int _scoreEng;
	private int _scoreCom;
	
	private char score2Grade(int aScore) {
		
		if (aScore >= 90) {
			return 'A' ;
		}
		else if (aScore < 90 && aScore >= 80) {
			return 'B' ;
		}
		else if (aScore < 80 && aScore >= 70) {
			return 'C' ;
		}
		else if (aScore < 70 && aScore >= 60) {
			return 'D' ;
		}
		else {
			return 'F' ;
		}
	}
	
	private double grade2Point (char aGrade) {
		
		if (aGrade == 'A') {
			return 4.0 ;
		}
		else if (aGrade == 'B') {
			return 3.0 ;
		}
		else if (aGrade == 'C') {
			return 2.0 ;
		}
		else if (aGrade == 'D') {
			return 1.0 ;
		}
		else {
			return 0.0 ;
		}
	}
	
	public Student() {
		this._scoreKor = 0 ;
		this._scoreEng = 0 ;
		this._scoreCom = 0 ;
	}
	
	public void setScoreKor (int aScore) {
		
		this._scoreKor = aScore ;
	}
	
	public int scoreKor() {
		
		return this._scoreKor;
		
	}
	
	public char gradeKor() {
		
		return this.score2Grade(this._scoreKor) ;
	}
	
	public double pointKor() {
		
		return this.grade2Point(gradeKor()) ;
	}
	
	
	
	
	
	public void setScoreEng (int aScore) {
		
		this._scoreEng = aScore ;
	}
	
	public int scoreEng() {
		
		return this._scoreEng;
		
	}
	
	public char gradeEng() {
		
		return this.score2Grade(this._scoreEng) ;
	}
	
	public double pointEng() {
		
		return this.grade2Point(gradeEng()) ;
	}
	
	
	
	
	
	public void setScoreCom (int aScore) {
		
		this._scoreCom = aScore ;
	}
	
	public int scoreCom() {
		
		return this._scoreCom;
		
	}
	
	public char gradeCom() {
		
		return this.score2Grade(this._scoreCom) ;
	}
	
	public double pointCom() {
		
		return this.grade2Point(gradeCom()) ;
	}
	
	public double gpa () {
		
		double gradePointKor, gradePointEng, gradePointCom ;
		
		gradePointKor = this.grade2Point(gradeKor());
		gradePointEng = this.grade2Point(gradeEng());
		gradePointCom = this.grade2Point(gradeCom());
		
		return (gradePointKor + gradePointEng + gradePointCom) / 3.0 ;
		
	}
	

}
