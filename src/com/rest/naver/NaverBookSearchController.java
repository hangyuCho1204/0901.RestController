package com.rest.naver;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//@Controller+@ResponseBody
public class NaverBookSearchController {
	@RequestMapping(value="/naver/book/search", method=RequestMethod.GET, produces="application/json; charset=utf-8")
	public String getBooks(@RequestParam String keyword){//8번 줄 {name}값이 9번줄 name으로 받아서 11번 줄에 setName으로 들어간다.

		String clientId = "X7k0OWswCMEJZgoTzsr4";
		 String clientSecret = "KtklfeI6hG";
		 String url = "https://openapi.naver.com/v1/search/book.xml?query="+keyword;
		 
		 HttpClient client = HttpClientBuilder.create().build();
		 HttpGet request = new HttpGet(url);
		 
		 request.addHeader("X-Naver-Client-Id", clientId);
		 request.addHeader("X-Naver-Client-Secret", clientSecret);
		 String xml = null;
		 String json = null;
		 try {
			HttpResponse response = client.execute(request);
			
			xml = EntityUtils.toString(response.getEntity());
			json = xml2json(xml);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		return json;
	}
	
	public String xml2json(String xml){//xml을 json로 바꿔서 던져주는 역할
		int PRETTY_PREING_INDENT_FACTOR=4;
		String json="";
		try {
			JSONObject jsonObject = XML.toJSONObject(xml);
			json = jsonObject.toString(PRETTY_PREING_INDENT_FACTOR);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
}
