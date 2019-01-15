package com.prj.common;

import static org.junit.Assert.*;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import org.junit.Test;

public class UploadUtilTest {

	@Test
	public void test() throws Exception {
		String access_token = WeiXinUtil.getAccess_Token();
		String path ="D:/1.jpg";
		String MEDID = UploadUtil.upload(path, access_token, "image");
		System.out.println(MEDID);
		
	}

}
