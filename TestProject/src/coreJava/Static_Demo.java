package coreJava;

public class Static_Demo {
		
		String name;//object bound 
		int adhar;//object bound
		static String vaccine="Covid-Shield";//Class bound Memory management
		
		public Static_Demo(String name, int adhar) {
			
			this.name = name;
			this.adhar = adhar;
		}
		//STATIC METHOD
		      static void change()
		    {
		    	vaccine="Co-vaccine";
		    }
             void display()
		{
			System.out.println(name+" "+adhar+" "+vaccine);
		}
		
		public static void main(String[] args) {
			Static_Demo p1=new Static_Demo("Gopi",12345);
			
			Static_Demo p2=new Static_Demo("Radha",12346);
			
			p1.dispaly();
			p2.display();
		}

}


