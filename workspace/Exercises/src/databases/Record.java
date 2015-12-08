package databases;

public class Record {
	private String name;
	private String dob;
	private String postcode;
	private long telephone;
	public Record(String name, String dob, String pc, String tele)
	{
		this.name = name;
		this.dob = dob;
		this.postcode = pc;
		this.telephone = Long.parseLong(tele);
	}
	public void displayRecord()
	{
		System.out.println("**********");
		System.out.println("Name: " + name);
		System.out.println("DOB: " + dob);
		System.out.println("Postcode: " + postcode);
		System.out.println("Telephone: " + telephone);
		System.out.println("**********");
	}

}
