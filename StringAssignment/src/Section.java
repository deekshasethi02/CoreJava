import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Section {

	 int id;
	 String name;
	 String date;
	private java.util.Date createdDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		SimpleDateFormat sm= new SimpleDateFormat("dd-MM-yyyy");
		String date = sm.format(this.createdDate);
		return date;
		
	}
	public void setDate(int year,int month, int date) {
		this.createdDate = new Date(year-1900, month-1,date);
		this.createdDate = createdDate;
		
	}
	public String  showSectionDetail() {
	 return "Section [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
	 
	
}
