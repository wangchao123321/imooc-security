//package com.wangchao.social.core.validate.code;
//
//import java.time.LocalDateTime;
//
//public class ValidateCode {
//
//    private String code;
//
//    private LocalDateTime expirerTime;
//
//    public ValidateCode(String code, int expirerIn) {
//        this.code = code;
//        this.expirerTime = LocalDateTime.now().plusSeconds(expirerIn);
//    }
//
//    public ValidateCode(String code, LocalDateTime expirerTime) {
//        this.code = code;
//        this.expirerTime = expirerTime;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public LocalDateTime getExpirerTime() {
//        return expirerTime;
//    }
//
//    public void setExpirerTime(LocalDateTime expirerTime) {
//        this.expirerTime = expirerTime;
//    }
//}
