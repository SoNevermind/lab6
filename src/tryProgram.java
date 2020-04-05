public class tryProgram {
	public static void main(String[] args) {
		Counter A = new Counter();
		
		System.out.println(A.State());
		
		while(A.errorCode == null) {
			A.Increase();
			System.out.println(A.State());
		}
		System.out.println(A.errorCode);
	}	
}
