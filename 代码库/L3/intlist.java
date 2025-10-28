public class intlist{
	public int first;
	public intlist rest;

	public intlist(int f, intlist r){
		first = f;
		rest = r;

	}
	/* Return the size of the list using recursion */
	public int size(){
		if (rest == null){
			return 1;
		}
		return 1 + this.rest.size()
	}

	public static void main(String[] args){
		intlist L = new intlist(15, null);
		L = new intlist(10, L);
		L = new intlist(5, L);

		System.out.println(L.size());
	}
}