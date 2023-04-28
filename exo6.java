public class exo6 {

	public static void main(String[] args) {
		int n=10, p=5, q=10, r;
		r = (int) (p = q) ;
		System.out.println("A : n=" + n + " p=" + p + " q=" + q+ " r=" + r ) ;
		n = p = q = 5 ;
		n += p += q ;
		System.out.println( "B : n=" + n + " p=" + p + " q=" + q );
		q = n < p ? n++ : p++ ;
		System.out.println("C : n=" + n + " p=" + p + " q=" + q ) ;
		q = n > p ? n++ : p++ ;
		System.out.println( "D : n="+ n + " p=" + p + " q=" + q ) ;
	}

}
