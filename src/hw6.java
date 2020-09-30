
public class hw6 {

public class Biblebook {
	
		public String name;
		public int chapter;
		public String desc;
		
		public Biblebook(String name, int chapter, String desc){
			this.name=name;
			this.chapter=chapter;
			this.desc=desc;
		}
		
		public void display() {
			System.out.println(this.name+" has "+this.chapter+" chapters and is "+this.desc+".");
		}
	}

}
