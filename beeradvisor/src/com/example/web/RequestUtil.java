package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
import java.io.*;

public class RequestUtil{
	
	public static void printRequestInfo(HttpServletRequest request) throws IOException{

		System.out.println("cookies: " + Arrays.asList(request.getCookies()));
		System.out.println("user port: " + request.getRemotePort());
		System.out.println("local port: " + request.getLocalPort());
		System.out.println("server port: " + request.getServerPort());
		System.out.println("method: " + request.getMethod());
		System.out.println("input stream: " + request.getInputStream());
		System.out.println("query string: " + request.getQueryString());

		Enumeration<String> enums = request.getHeaderNames();
		System.out.println("headers: ");
		while(enums.hasMoreElements()){
			String headerName = enums.nextElement();
			String headerValue = request.getHeader(headerName);
			System.out.println(headerName + " : "+ headerValue);
		}
	}
}