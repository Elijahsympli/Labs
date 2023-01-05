package Lab;






import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
//@Entity -This annotation specifies that the class is an entity.
//@Table - This annotation specifies the table in the database with
//which this entity is mapped.
//@Id - This annotation specifies the primary key of the entity.
@Getter
@Setter
@Entity//marking this class as Entity
//specifies the table name where data of this entity is to be persisted
@Table(name="Employee_Info")
public class CEmployee {
@Id //marks identifier of class
private int empId;
private String empFirstName,empLastName,empEmail,empAddr,empDept;
private double empSalary;
private long empPhone;

}
