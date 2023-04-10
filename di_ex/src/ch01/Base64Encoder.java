package ch01;

import java.util.Base64;

public class Base64Encoder implements IEncoder{

	@Override
	public String encode(String message) {
		// 인코딩 -> Base64 형식으로 처리
		String resulEncode = Base64.getEncoder().encodeToString(message.getBytes());
		return resulEncode;
	}

}
