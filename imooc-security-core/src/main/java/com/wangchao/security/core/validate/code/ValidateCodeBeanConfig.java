///**
// *
// */
//package com.wangchao.social.core.validate.code;
//
//import com.wangchao.social.core.properties.SecurityProperties;
//import com.wangchao.social.core.validate.code.sms.DefaultSmsCodeSender;
//import com.wangchao.social.core.validate.code.sms.SmsCodeSender;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
///**
// * @author zhailiang
// *
// */
//@Configuration
//public class ValidateCodeBeanConfig {
//
//	@Autowired
//	private SecurityProperties securityProperties;
//
////	@Bean
////	@ConditionalOnMissingBean(name = "imageValidateCodeGenerator")
////	public ValidateCodeGenerator imageValidateCodeGenerator() {
////		ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
////		codeGenerator.setSecurityProperties(securityProperties);
////		return codeGenerator;
////	}
//
//	@Bean
//	@ConditionalOnMissingBean(SmsCodeSender.class)
//	public SmsCodeSender smsCodeSender() {
//		return new DefaultSmsCodeSender();
//	}
//
//}
