import java.util.*;
class TestJavaCollection1{
	public static void main(String args[]){
			Vector<String> v=new Vector<String>();
			v.add("Ayush");
			v.add("Amit");
			v.add("Ashish");
			v.add("Kishor");
			v.insertElementAt("nand",3);
			Iterator<String> itr=v.iterator();
			while(itr.hasNext()){
			System.out.println(itr.next());
			}
			}
}