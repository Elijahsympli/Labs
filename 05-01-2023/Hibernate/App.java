package Lab;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
//Configuration -activates hibernate framework
    	//configure -read both cfg files and mapping details
    	//buildSsessionFactory -from cfg object it takes jdbc information and creaete a jdbc connection
    	SessionFactory s=new Configuration().configure().buildSessionFactory();
    //opens an connection with db and session object perform CRUD
    	Session ses=s.openSession();//one of the method of session factory to get session object
    	//operation performed in db, save permanent 
    	Transaction t=ses.beginTransaction();
    	//create object of persistent class
    	CEmployee st =new CEmployee();
    	CEmployee st1 =new CEmployee();
    	CEmployee st2=new CEmployee();
    	CEmployee st3=new CEmployee();
    	CEmployee st4 =new CEmployee();
    	
    	//use object to enter data in table using setter method
    	
    	st.setEmpId(101);
    	st.setEmpFirstName("Paul");
    	st.setEmpLastName("lama");
    	st.setEmpEmail("paul@gmail.com");
    	st.setEmpPhone(6766445645l);
    	st.setEmpAddr("kolkata");
    	st.setEmpDept("IT");
    	st.setEmpSalary(100000);
    	
    	st1.setEmpId(102);
    	st1.setEmpFirstName("Juri");
    	st1.setEmpLastName("Rai");
    	st1.setEmpEmail("juri@gmail.com");
    	st1.setEmpPhone(7766445645l);
    	st1.setEmpAddr("kolkata");
    	st1.setEmpDept("IT");
    	st1.setEmpSalary(100000);
    	
    	st2.setEmpId(103);
    	st2.setEmpFirstName("Joy");
    	st2.setEmpLastName("lama");
    	st2.setEmpEmail("joy@gmail.com");
    	st2.setEmpPhone(6766445645l);
    	st2.setEmpAddr("Chennai");
    	st2.setEmpDept("KL");
    	st2.setEmpSalary(150000);
    	
    	st3.setEmpId(104);
    	st3.setEmpFirstName("amrita");
    	st3.setEmpLastName("das");
    	st3.setEmpEmail("amri@gmail.com");
    	st3.setEmpPhone(6897445645l);
    	st3.setEmpAddr("Delhi");
    	st3.setEmpDept("SK");
    	st3.setEmpSalary(100000);
    	
    	st4.setEmpId(105);
    	st4.setEmpFirstName("Adarsh");
    	st4.setEmpLastName("Kumar");
    	st4.setEmpEmail("ada@gmail.com");
    	st4.setEmpPhone(6007445645l);
    	st4.setEmpAddr("Bihar");
    	st4.setEmpDept("AR");
    	st4.setEmpSalary(100000);
    	
    	//session object is used to save the persistent object
    	ses.save(st);
    	ses.save(st1);
    	ses.save(st2);
    	ses.save(st3);
    	ses.save(st4);
    	
    	//transaction object to commit changes
    	t.commit();
    

    	//closing session
    	ses.close();
    	
    	
    }
}
