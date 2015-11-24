package linkedList;

public class Link 
{

	 private String Name;

	 private int age;

	 private String favBand="Spice Girls";

	 private boolean inARelationship=false;

	 //pointer to next linkObject

	 private Link nextLink=null;

	 public Link(String Name, int age, String favBand, boolean inARelationship)
	 {

		 this.Name=Name;
	
		 this.age=age;
	
		 this.favBand=favBand;
	
		 this.inARelationship=inARelationship;

	 }

	 public String getName() 
	 {

		 return Name;

	 }

	 public void setName(String name) 
	 {

		 Name = name;

	 }

	 public int getAge() 
	 {

		 return age;

	 }

	 public void setAge(int age) 
	 {

		 this.age = age;

	 }

	 public String getFavBand() 
	 {

		 return favBand;

	 }
	 public void setFavBand(String favBand) 
	 {

		 this.favBand = favBand;
		 
	 }

	 public boolean isInARelationship() 
	 {

		 return inARelationship;

	 }

	 public void setInARelationship(boolean inARelationship) 
	 {

		 this.inARelationship = inARelationship;

	 }

	 public Link getNextLink() 
	 {

		 return nextLink;

	 }

	 public void setNextLink(Link nextLink) 
	 {

		 this.nextLink = nextLink;

	 }

	 public void displayLink()
	 {
		 System.out.println(" ");

		 System.out.println("***********");

		 System.out.println("Name: " + this.getName());

		 System.out.println("Age: " + this.getAge());

		 System.out.println("Band: " + this.getFavBand());

		 System.out.println("Relationship?: " + this.isInARelationship());

		 System.out.println("***********");
	 }

}