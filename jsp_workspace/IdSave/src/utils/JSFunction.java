package utils;

import javax.servlet.jsp.JspWriter;

/** Utility 기능을 수행하는 클래스 
 * 
 * @author 이강은 
 * @version 1.0
 */
public class JSFunction {
		
	/** 메시지를 알림창에 띄우고, 지정한 url로 이동한다
	 * 
	 * @param msg     알람창에 띄울 메시지
 	 * @param url     이동할 URL 주소
	 * @param out     출력을 위한 jsp 내장객체
	 */
	public static void alertLocation(String msg, String url, JspWriter out) {
		try {
			String script = ""
					+ "<script>"
					+ " alert('" + msg + "');"
					+ " location.href='" + url + "';"
					+ "</script>";
			out.println(script);
		}catch(Exception e) {}
	
	}


	public static void alertBack(String msg, JspWriter out) {
		try {
			String script = ""
					      + "<script>"
					      + "alert ('" + msg + "');"
					      + "history.back();"
					      + "</script>";
			out.println(script);
		
		}catch(Exception e) {}
	}
}