/**
 * I didn't add javadocs: add some!!
 * 
 * @author Wendi
 */
public class Course implements Comparable<Course> {
    
    private String code;
    private double grade;
    
    public Course(String code, double grade) {
        setCode(code);
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
    
    public double getGrade() {
        return grade;
    }
    
    public void setGrade(double grade) {
        if (grade >= 0)
            this.grade = grade;
        else
            throw new IllegalArgumentException("Grade can't be a negative value.");
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