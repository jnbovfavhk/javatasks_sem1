package org.knit.jnbovfavhk.sem1.lab1;

public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webPageName;
    private String webPageExtention;
    public String urlValue;
    private int intParam;
    private double doubleParam;
    private String textParameter;
    private int webPageNumber;


    public SimpleUrl(String urlValue) {
        this.urlValue = urlValue;
        this.protocol = urlValue.split(":")[0];
        this.address = urlValue.split("/")[0];
        this.domainZone = urlValue.split("/")[2].substring(urlValue.split("/")[2].indexOf(".") + 1);
        this.siteName = urlValue.split("/")[3];
        this.webPageNumber = Integer.parseInt(urlValue.split("/")[4]);
        this.webPageName = urlValue.split("/")[5].substring(0, urlValue.split("/")[5].indexOf("?"));
        this.webPageExtention = this.webPageName.split("\\.")[1];
        this.intParam = Integer.parseInt(urlValue.split("/")[5].substring(urlValue.split("/")[5].indexOf("intParam") + 9, urlValue.split("/")[5].indexOf("&")));
        this.doubleParam = Double.parseDouble(urlValue.split("&")[1].split("=")[1]);
        this.textParameter = urlValue.split("&")[2].split("=")[1];

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

    public int getIntParam() {
        return intParam;
    }

    public void setIntParam(int intParam) {
        this.intParam = intParam;
    }

    public double getDoubleParam() {
        return doubleParam;
    }

    public String getTextParameter() {
        return textParameter;
    }

    public void setTextParameter(String textParameter) {
        this.textParameter = textParameter;
    }

    public void setDoubleParam(double doubleParam) {
        this.doubleParam = doubleParam;
    }

    public int getWebPageNumber() {
        return webPageNumber;
    }

    public void setWebPageNumber(int webPageNumber) {
        this.webPageNumber = webPageNumber;
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
        return urlValue;
    }

    public void setUrlValue(String urlValue) {
        urlValue = urlValue;
    }

    @Override
    public String toString() {
        return "url = " + urlValue +
                "\nprotocol = " + protocol +
                "\naddress = " + address +
                "\ndomainZone = " + domainZone +
                "\nsiteName = " + siteName +
                "\nwebpageName = " + webPageName +
                "\nwebPageExtention = " + webPageName +
                "\nwebpageNumber = " + webPageNumber +
                "\nintParam" + intParam +
                "\ndoubleParam = " + doubleParam +
                "\ntextParameter = " + textParameter;
    }

}
