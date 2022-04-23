package practice.collections.codes;

public class SingleTone {
	
	// in OOPs a Singleton Class is a Class that can have only once object (instance of the class) at a time
	// How to design Singleton Class
	// 1. make constructor as a private
	// 2. Write a static method  (getIntance) that has return type of object of this singleton class ( lazy initialization)
	// Different between normal class and singleton class 
	// For normal Class we use constructor where as singleton class we use getInstance () method for Instantiation
	
   private static SingleTone Singleton_instance = null;
   private String str;
   
   private  SingleTone() {
   str = "Hey, i am using SingleTone class pattern";
   }
   public static SingleTone getinstence() {
   if(Singleton_instance == null)
   Singleton_instance = new SingleTone ();
   return Singleton_instance;
	   
   }
   public static void main(String[] args) {
   SingleTone x =  SingleTone.getinstence();
   SingleTone y =  SingleTone.getinstence();
   SingleTone z =  SingleTone.getinstence();
   
   x.str = (x.str).toUpperCase();
   
   System.out.println(x.str);
   System.out.println(y.str);
   System.out.println(z.str);
   
}}
