package Lab;



import java.util.*;


	public class Collection{
		List<Integer> a1=new ArrayList<Integer>(); //creating array list
		public 	void storeEvenNumbers(int N) {//method to print array no
				for(int i =2; i<=N ; i+=2) {
					a1.add(i);}
					System.out.println(a1);
			}
		
		List<Integer> a2=new ArrayList<Integer>(); //creating arraylist to multiply two with all the numbers
			void printEvenNumbers() {//method to print the even numbers after multipling 2
				Iterator <Integer>itr =a1.iterator();
				while(itr.hasNext()) {
					a2.add(itr.next()*2);}
				System.out.println(a2);
				
			}
			int retrieveEvenNumber(int N) {//method to check if it contains the number
				if(a1.contains(N)) {
					return N; } 
				else
					return 0;}
				
			
			public static void main(String[] args) {//main method
				Collection c= new Collection();//creating object of the class
				
				System.out.println("Printing Even Numbers : ");
				c.storeEvenNumbers(50);
				System.out.println("Printing even numbers multiplied by 2");
				c.printEvenNumbers();
				System.out.println("Checking if the number is present or not,if present,return the number,else 0");
				System.out.println(c.retrieveEvenNumber(2));
			}}
	
