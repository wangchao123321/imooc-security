//package com.wangchao.social.core.validate.code;
//
//import com.wangchao.social.core.validate.code.sms.SmsCodeSender;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.social.connect.web.HttpSessionSessionStrategy;
//import org.springframework.social.connect.web.SessionStrategy;
//import org.springframework.web.bind.ServletRequestBindingException;
//import org.springframework.web.bind.ServletRequestUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.context.request.ServletWebRequest;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@RestController
//public class ValidateCodeController {
//
//    @Autowired
//    private ValidateCodeGenerator smsCodeGenerator;
//    @Autowired
//    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();
//    @Autowired
//    private SmsCodeSender smsCodeSender;
//
//    @GetMapping("/code/sms")
//    public void createSmsCode(HttpServletRequest request, HttpServletResponse response) throws ServletRequestBindingException {
//        ValidateCode smsCode = smsCodeGenerator.generator(new ServletWebRequest(request));
//        sessionStrategy.setAttribute(new ServletWebRequest(request),"session_key",smsCode);
//        String mobile = ServletRequestUtils.getRequiredStringParameter(request,"mobile");
//        smsCodeSender.send(mobile,smsCode.getCode());
//    }
//}
