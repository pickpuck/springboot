package util;

import org.apache.log4j.Logger;

public class RandomString {
	private static Logger log = Logger.getLogger(RandomString.class);
	public static String SOURCE	=	"abcdefghijk";
	public static String RandomString(int length,String rule) {
		return org.apache.commons.lang.RandomStringUtils.random(16, SOURCE);
	}
	public static void main(String[] args) {
		String randomStr = RandomString(15,SOURCE);
//		System.out.println(randomStr);
		log.debug("randomStr:"+ randomStr);
		log.warn("1");
	}
}
