package hibernate01;

import javax.persistence.*;

public class MainClass 
{
	public static void main(String[] args) 
	{
				EntityManagerFactory a= Persistence.createEntityManagerFactory("hiber1");
				EntityManager m=a.createEntityManager();
				EntityTransaction t=m.getTransaction();
				Hero h=new Hero();
				h.setAge(22);
				h.setName("Rohan");
				h.setPhno(7894221564l);
				
				t.begin();
				m.persist(h);
				t.commit();
				
				
	}

}
