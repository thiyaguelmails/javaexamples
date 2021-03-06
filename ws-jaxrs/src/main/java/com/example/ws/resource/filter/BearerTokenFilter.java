package com.example.ws.resource.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import com.example.ws.annotation.TokenAuthenticated;

@Provider
@TokenAuthenticated
public class BearerTokenFilter implements ContainerRequestFilter{

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("check for Bearer");
	}
}
