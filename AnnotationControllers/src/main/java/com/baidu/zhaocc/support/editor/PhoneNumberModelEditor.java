package com.baidu.zhaocc.support.editor;

import java.beans.PropertyEditorSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

import com.baidu.zhaocc.support.model.PhoneNumberModel;

public class PhoneNumberModelEditor extends PropertyEditorSupport {

	Pattern pattern = Pattern.compile("^(\\d{3,4})-(\\d{7,8})$");

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("setAsText text:" + text);
		if (text == null || !StringUtils.hasLength(text)) {
			setValue(null);
		} else {
			Matcher matcher = pattern.matcher(text);
			if (matcher.matches()) {
				PhoneNumberModel phoneNumber = new PhoneNumberModel();
				phoneNumber.setAreaCode(matcher.group(1));
				phoneNumber.setPhoneNumber(matcher.group(2));
				setValue(phoneNumber);
			} else {
				throw new IllegalArgumentException(String.format("电话格式应该是[010-12345678],但格式是%s", text));
			}
		}
	}

	@Override
	public String getAsText() {
		System.out.println("getAsText");
		PhoneNumberModel phoneNumber = (PhoneNumberModel)getValue();
		return phoneNumber != null ? phoneNumber.getAreaCode() + "-" +phoneNumber.getPhoneNumber() : "";
	}
}
