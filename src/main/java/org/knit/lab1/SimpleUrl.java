package org.knit.lab1;

public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webPageName;
    private String webPageExtention;
    private String UrlValue = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";



    public SimpleUrl(String protocol, String address, String domainZone, String siteName, String webPageName, String webPageExtention, String UrlValue) {
        this.protocol = protocol;
        this.address = address;
        this.domainZone = domainZone;
        this.siteName = siteName;
        this.webPageName = webPageName;
        this.webPageExtention = webPageExtention;
        this.UrlValue = UrlValue;

    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public void setDomainZone(String domainZone) {
        this.domainZone = domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getWebPageName() {
        return webPageName;
    }

    public void setWebPageName(String webPageName) {
        this.webPageName = webPageName;
    }

    public String getWebPageExtention() {
        return webPageExtention;
    }

    public void setWebPageExtention(String webPageExtention) {
        this.webPageExtention = webPageExtention;
    }

    public String getUrlValue() {
        return UrlValue;
    }

    public void setUrlValue(String urlValue) {
        UrlValue = urlValue;
    }

    @Override
    public String toString() {
        return "protocol = " + protocol +
                "\naddress = " + address +
                "\ndomainZone = " + domainZone +
                "\nsiteName = " + siteName +
                "\nwebpageName = " + webPageName +
                "\nwebPageExtention = " + webPageName;
    }

}
