package com.baidu.zhaocc.web.controller.consumesproduces;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

public class RequestContentTypeClient {

	public static void main(String[] args) throws IOException,
			URISyntaxException {
		String url = "http://localhost:8080/AnnotationControllers/consumes/requestContentType";
		ClientHttpRequest clientRequest = new SimpleClientHttpRequestFactory()
				.createRequest(new URI(url), HttpMethod.POST);
		clientRequest.getHeaders().set("Content-Type",
				"application/json;charset=gbk");
		String jsonData = "{\"username\":\"zhang\", \"password\":\"123\"}";
		clientRequest.getBody().write(jsonData.getBytes("gbk"));

		ClientHttpResponse clientResponse = clientRequest.execute();
		int retLength = (int) clientResponse.getHeaders().getContentLength();
		Charset charset = clientResponse.getHeaders().getContentType()
				.getCharSet();
		System.out.println("len:" + retLength + " charset:"
				+ charset.toString());

		byte[] bytes = new byte[retLength];
		InputStream is = clientResponse.getBody();
		is.read(bytes);
		String ret_str = new String(bytes, charset);
		System.out.println("status code = "
				+ clientResponse.getStatusCode().toString() + " ret str = "
				+ ret_str);
	}
}
