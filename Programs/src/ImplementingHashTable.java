import java.util.ArrayList;
	
	class HNode<k, v>{
		k key;
		v value;
		HNode<k, v> next;
		
		HNode(k key, v value){
			this.key = key;
			this.value = value;
		}
	}
	
	class ImplementingHashTable<k, v>{
		private ArrayList<HNode<k, v>> bucketArray;
		private int bucketCapacity;
		private int bucketSize;
		
		ImplementingHashTable(){
			bucketArray = new ArrayList<>();
			bucketCapacity = 10;
			bucketSize = 0;
			
			for(int i = 0; i < bucketCapacity; i++)
				bucketArray.add(null);
		}
		
		public int size() {
			return bucketSize;
		}
		
		public boolean isEmpty() {
			return  (size() == 0);
		}
		
		public int bucketIndex(k curKey) {
			int hash = curKey.hashCode();
			int index = hash % bucketCapacity;
			return index;
		}
		
		public v remove(k curKey) {
			int curIndex = bucketIndex(curKey);
			HNode<k, v> curNode = bucketArray.get(curIndex);
			HNode<k, v> prev = null;
			while(curNode != null) {
				if(curNode.key.equals(curKey))
					break;
				prev = curNode;
				curNode = curNode.next;
			}
			if(curNode == null)
				return null;
			bucketSize--;
			if(prev != null)
				prev.next = curNode.next;
			else
	            bucketArray.set(curIndex, curNode.next);
			return curNode.value;   // seee
		}
		
		public v getValue(k curKey) {
			int curIndex = bucketIndex(curKey);
			HNode<k, v> curNode = bucketArray.get(curIndex);
			while(curNode != null) {
				if(curNode.key.equals(curKey))
					return curNode.value;
				curNode  = curNode.next;
		}
		return null;
	}
		
		public void add(k curKey, v curValue) {
			int curIndex = bucketIndex(curKey);
			HNode<k, v> curNode = bucketArray.get(curIndex);
			while(curNode != null) {
				if(curNode.key.equals(curKey)) {
					curNode.value = curValue;
					return;}
				curNode = curNode.next;
				}
			bucketSize++;
			HNode<k, v> newNode = new HNode<k, v>(curKey, curValue);
			curNode = bucketArray.get(curIndex);
			newNode.next = curNode;
			bucketArray.set(curIndex, newNode);
			if(bucketCapacity - bucketSize == 2) {
				bucketCapacity = bucketCapacity + 10;
				for(int i = bucketSize; i < bucketCapacity; i++)
					bucketArray.add(null);
			}
		}
		
		public void display() {
			for(int i = 0; i < bucketCapacity; i++) {
				HNode<k, v> curNode = bucketArray.get(i);
				while(curNode != null) {
					System.out.println("key "+curNode.key+ " value "+curNode.value);
					curNode = curNode.next;
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementingHashTable map = new ImplementingHashTable();
		 map.add("this",1 );
	     map.add("coder",2 );
	     map.add("this",4 );
	     map.add("hi",5 );
	        System.out.println(map.size());
	        System.out.println(map.remove("this"));
	        System.out.println(map.remove("this"));
	        System.out.println(map.size());
	        System.out.println(map.isEmpty());

	}

}
