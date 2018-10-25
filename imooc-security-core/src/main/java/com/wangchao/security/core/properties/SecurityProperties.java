package com.wangchao.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "imooc.social")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    private SocialProperties socialProperties = new SocialProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

    public SocialProperties getSocialProperties() {
        return socialProperties;
    }

    public void setSocialProperties(SocialProperties socialProperties) {
        this.socialProperties = socialProperties;
    }
}
