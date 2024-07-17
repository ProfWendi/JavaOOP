/**
 * I didn't add javadocs: add some!!
 * 
 * @author Wendi
 */
public class Course implements Comparable<Course> {
    
    private String code;
    private String title;
    private double credits;
    private double grade;
    
    public Course(String code, String title, double credits) {
        setCode(code);
        setTitle(title);
        setCredits(credits);        
    }

    public Course(String code, String title, double credits, double grade) {
        this(code, title, credits);
        setGrade(grade);
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        if (code != null && !code.trim().isEmpty() && code.matches("[a-zA-Z]{4}\\d{5}"))
            this.code = code;
        else
            throw new IllegalArgumentException("Course code can't be empty.");
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCredits(double credits) {
        if (credits > 0)
            this.credits = credits;
        else
            this.credits = 3.0;
    }

    public double getCredits() {
        return credits;
    }

    public double getGrade() {
        return grade;
    }
    
    public void setGrade(double grade) {
        if (grade >= 0)
            this.grade = grade;
        else
            throw new IllegalArgumentException("Grade can't be a negative value.");
    }
    
    public double gradePoints() {
        if (grade >= 90)
            return 4.0;
        else if (grade >= 85)
            return 3.8;
        else if (grade >= 80)
            return 3.6;
        else if (grade >= 75) 
            return 3.3;
        else if (grade >= 70)
            return 3.0;
        else if (grade >= 65)
            return 2.5;
        else if (grade >= 60)
            return 3.0;
        else if (grade >= 55)
            return 1.5;
        else if (grade >= 50)
            return 1.0;
        else return 0;
    }

    public double weightedCreditValue() {
        return gradePoints() * credits;
    }

    @Override
    public String toString() {
        return String.format("%-9s: %6.2f", code, grade);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        
        if (obj instanceof Course) {
            Course c = (Course)obj;
            return c.getCode().equals(code);
        } else
            return false;
    }
	
	@Override
	public int hashCode() {
		final int prime = 89;
		int result = 5;
		result = result * prime + code.hashCode();
		return result;
	}

    @Override
    public int compareTo(Course c) {
        return code.compareTo(c.getCode());
    }       
}