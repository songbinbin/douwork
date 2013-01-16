package main;

import java.io.*;
import java.net.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


class ISBN { 
  String isbnUrl = "http://api.douban.com/book/subject/";
	JSONObject jsonobj;
	Books book;
    /*
     * 根据传递的图书ISBN号利用豆瓣API获取json字符串
     */
	public String fetchBookInfoByXML(String isbnNo) throws IOException  {    
	    String requestUrl = isbnUrl + isbnNo+"?alt=json";    
	    URL url = new URL(requestUrl);    
	    URLConnection conn = url.openConnection();    
	    InputStream is = conn.getInputStream();    
	    InputStreamReader isr = new InputStreamReader(is, "utf-8");    
	    BufferedReader br = new BufferedReader(isr);    
	    StringBuilder sb = new StringBuilder();    
	        
	    String line = null;    
	    while ((line = br.readLine()) != null) {    
	        sb.append(line);    
	    }    
	        
	    br.close();    
	    return sb.toString();    
	}
	//把json字符串转换为json
	public JSONObject stringToJson(String str) throws JSONException
	{
		jsonobj = new JSONObject(str);
		return jsonobj;
	}
	//设置获取的图书信息并返回对象
	public Books setBookData() throws JSONException
	{
		JSONObject mesge = jsonobj.getJSONObject("summary");
		book = new Books();
		book.setSummary(mesge.getString("$t"));//设置图书概要信息
		JSONArray bookMessage = jsonobj.getJSONArray("db:attribute");
		JSONObject info;
		//设置ISBN10
		info=bookMessage.getJSONObject(0);
		book.setIsbn10(info.getString("$t"));
		//设置ISBN13
		info=bookMessage.getJSONObject(1);
		book.setIsbn13(info.getString("$t"));
		//设置书名
		info=bookMessage.getJSONObject(2);
		book.setTitle(info.getString("$t"));
		//设置图书页数
		info=bookMessage.getJSONObject(3);
		book.setPage(info.getString("$t"));
		//设置作者姓名
		info=bookMessage.getJSONObject(4);
		book.setAuthor(info.getString("$t"));
		//设置图书价格
		info=bookMessage.getJSONObject(5);
		book.setPrice(info.getString("$t"));
		//设置出版社
		info=bookMessage.getJSONObject(6);
		book.setPublisher(info.getString("$t"));
		//设置Paperback
		info=bookMessage.getJSONObject(7);
		book.setBinding(info.getString("$t"));
		//设置出版日期
		info=bookMessage.getJSONObject(8);
		book.setPubdate(info.getString("$t"));
		return book;
	}
	
	
	
	
	
	
	
	
	
	
	
}
