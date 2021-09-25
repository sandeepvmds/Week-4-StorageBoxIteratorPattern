
public class StorageBoxIteratorDemo {

	public static void main(String[] args) {
	 
		
		StorageBoxRepository SbRepository = new StorageBoxRepository();

	  
	  System.out.println("Storage boxes :\n");
	  
	  
	      for(Iterator iter = SbRepository.getIterator(); iter.hasNext();){
	         String sb = (String)iter.next();
	         System.out.println( sb);
	      } 	
	   }
	
	
	
}
