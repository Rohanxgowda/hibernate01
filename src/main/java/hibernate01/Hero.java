package hibernate01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hero 
{
	@Id
	@GeneratedValue
	private long phno;
	private String name;
	private int age;
	public long getPhno() 
	
	{
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
