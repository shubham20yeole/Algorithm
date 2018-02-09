package DailyAlgoPractice;
public class TinyURL {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int    BASE     = ALPHABET.length();
    public static void main(String[] args) {
		decode("https://docs.google.com/document/d/1WP-E38H4uMjs2Ak3-AIud4Uh14tevaG21m_9XfcTIRg/edit?ts=59324cbb");
	}
    public static String encode(int num) {
        StringBuilder sb = new StringBuilder();
        while ( num > 0 ) {
            sb.append( ALPHABET.charAt( num % BASE ) );
            num /= BASE;
        }
        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();   
    }

    public static int decode(String str) {
        int num = 0;
        for ( int i = 0; i < str.length(); i++ )
            num = num * BASE + ALPHABET.indexOf(str.charAt(i));
        return num;
    }   
}

