package com.grammerstore.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String LONG_FORMATE="yyyy-MM-dd HH:mm:ss";
	public static final String SHORT_FORMATE="yyyy-MM-dd";
	
	public static Long getNowDate() {
		return new Date().getTime();
	}
	public static void main(String[] args) throws ParseException {
		System.out.println(parseLongToDateStr(Long.parseLong("1514289600000")));
		System.out.println(DateUtil.getNowDate());
		System.out.println(parseDate("2017-12-15 15:02:30",DateUtil.LONG_FORMATE));
		
		System.out.println(getDateDiffByMinutes("2017-12-19 14:02:30",new Date()));
	}
	
	public static String formateDate(Date date,String format) {
		SimpleDateFormat sdf =	new SimpleDateFormat(format);
		return sdf.format(date);
	}
	public static Date parseDate(String date,String format) throws ParseException {
		SimpleDateFormat sdf =	new SimpleDateFormat(format);
		return sdf.parse(date);
	}
	public static Long getDateDiff(Date small,Date big) {
		return big.getTime()-small.getTime();
	}
	public static Long getDateDiff(String small,String big) throws ParseException {
		Date smallDate =parseDate(small,DateUtil.LONG_FORMATE);
		Date bigDate =parseDate(big,DateUtil.LONG_FORMATE);
		return bigDate.getTime()-smallDate.getTime();
	}
	public static Long getDateDiff(Date small,String big) throws ParseException {
		Date bigDate =parseDate(big,DateUtil.LONG_FORMATE);
		return bigDate.getTime()-small.getTime();
	}
	public static Long getDateDiff(String small,Date big) throws ParseException {
		Date smallDate =parseDate(small,DateUtil.LONG_FORMATE);
		return big.getTime()-smallDate.getTime();
	}
	public static Long getDateDiffByMinutes(String small,Date big) throws ParseException {
		Date smallDate =parseDate(small,DateUtil.LONG_FORMATE);
		return (big.getTime()-smallDate.getTime())/(1000*60);
	}
	
	public static String parseLongToDateStr(Long time) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//前面的lSysTime是秒数，先乘1000得到毫秒数，再转为java.util.Date类型
		java.util.Date dt = new Date(time * 1000);  
		return sdf.format(dt);  //得到精确到秒的表示：08/31/2006 21:08:00
	}
	/**
	 * 
	 * @param time 时间
	 * @param fmt  指定的时间格式
	 * @return
	 */
	public static double changeToTimeStamp(String time) {
		double timestamp = 0D;
		try{
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = sdf.parse(time);
			timestamp = (double)date.getTime();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return timestamp;
	}

}
