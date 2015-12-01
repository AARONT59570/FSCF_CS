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

}
