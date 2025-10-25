public class intlist{
	public int first;
	public intlist rest;

	public intlist(int f, intlist r){
		first = f;
		rest = r;

	}

	public static void main(String[] args){
		intlist L = new intlist(15, null);
		L = new intlist(10, L);
		L = new intlist(5, L);
	}
}