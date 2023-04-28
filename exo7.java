public class exo7 {

	public static void main(String[] args) {
		int n, p, q ; boolean k;
		n = 5 ; p = 2 ; /* cas 1 */
		k= n++ > p || p++ != 3 ;
		System.out.println( "A : n = " + n + " p = " + p + " k = " + k ) ;
		n = 5 ; p = 2 ; /* cas 2 */
		k = n++ <p || p++ != 3 ;
		System.out.println( "B : n = " + n + " p = " + p + " k = " + k );
		n = 5 ; p = 2 ; /* cas 3 */
		k = ++n == 3 && ++p == 3 ;
		System.out.println( "C : n = " + n + " p = " + p + " k = " + k ) ;
		n = 5 ; p = 2 ; /* cas 4 */
		k = ++n == 6 && ++p == 3 ;
		System.out.println( "D : n = " +n + " p = " + p + " k = " + k ) ;
	}

}
