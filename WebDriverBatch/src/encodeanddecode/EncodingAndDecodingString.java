package encodeanddecode;

import org.apache.commons.codec.binary.Base64;

public class EncodingAndDecodingString {

	public static void main(String[] args) {
		String string = "Test123";
		byte[] encodedString = Base64.encodeBase64(string.getBytes());
		System.out.println(encodedString);
		byte[] decodeString = Base64.decodeBase64(encodedString);
		System.out.println(new String(decodeString));
	}

}
