public class DifferentVectorSizeException extends Exception {

	public final int lenA, lenB;
	
	public DifferentVectorSizeException(int lenA, int lenB) {
		this.lenA = lenA;
		this.lenB = lenB;
	}
	
}
