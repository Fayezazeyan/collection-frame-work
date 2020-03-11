import java.util.ArrayList;
import java.util.Scanner;
class CustomCollectionList{
    public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>(10);
		list.add("Neha");
		list.add("Arshi");
		list.add("Humera");
		list.add("vijaya");
		list.add("Arshi");
		list.add("Danish");
		list.add("Saqib");
		list.add("Nithin");
		list.add("Manasa");
		list.add("Indira");
		System.out.println("Student names");
		//printing values in list
		for(String name:list){
			System.out.println(name);
		}
		System.out.println("Size of the students list : "+list.size());
		//using index in add() method
		list.add(3,"Preethi");
		list.add("Lovely");
		System.out.println("After adding new students list is:");
		for(String name:list){
			System.out.println(name);
		}
		System.out.println("Size of the list after adding students : "+list.size());
		//using get() method
		System.out.println("Student at the index 3 is : "+list.get(3));
		//printing last occurance of specified element
		System.out.print("Position of Arshi in list is : ");
		System.out.println(list.lastIndexOf("Arshi"));
		//checking whether the student is present or not
		if(list.contains("Vijaya")){
			System.out.println("student Vijaya is there");
		}
		else{
			System.out.println("student Vijaya is there");
		}
		//finding index of particular index in list
		System.out.println("Index of Arshi occurance in list : "+list.indexOf("Arshi"));
		//removing Arshi from list
		list.remove("Arshi");
		System.out.println("List after removing some students from list : ");
		for(String name:list){
			System.out.println(name);
		}
		System.out.println("Size of reduced list after removing some students : "+list.size());
		//replace specified element in the list
		list.set(list.indexOf("Humera"),"Janitha");
		System.out.println("Students list after replacing Humera with Janitha : ");
		for(String name:list){
			System.out.println(name);
		}
		//displaying sublist of students list from specified positions
		System.out.println("Sublist of students list from 3rd position to 6th position is : ");
		System.out.println(list.subList(3,7));
		//reducing the size of the list to current size of the list
		list.trimToSize();
		System.out.println("Size of the students list : "+list.size());
	}
}
