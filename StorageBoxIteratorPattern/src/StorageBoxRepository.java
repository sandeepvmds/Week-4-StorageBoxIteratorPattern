
public class StorageBoxRepository implements Container {
	
	 public String storageBoxes[] = {"Cardboard Storage Boxes" , "Plastic Storage Boxes ","Fabric-Covered Storage Cubes and Boxes","Household Essentials Fabric Storage Boxes" };

	@Override
	public Iterator getIterator() {
		 
		return new StorageBoxterator();
	}

	private class StorageBoxterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < storageBoxes.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return storageBoxes[index++];
	         }
	         return null;
	      }		
	   }
	
	
	
}
