package hstc.edu.cn.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class CryptographyUtil {

	
	/**
	 * @Description md5加密
	 * @param str
	 * @param salt
	 * @return
	 */
	public static String md5(String str,String salt){

		return new Md5Hash(str, salt).toString();
	}

	public static void main(String[] args) {
		String password="123456";
		
		System.out.println("Md5"+ CryptographyUtil.md5(password, "javacoder"));
	}
}
