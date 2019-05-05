package com.example.lib;

public class ServiceFactory {
    private ServiceFactory () {
    }

    private static final ServiceFactory mInstance = new ServiceFactory();
    private ILoginService mLoginService;

    public static ServiceFactory getInstance () {
        return mInstance;
    }

    public ILoginService getLoginService () {
        return mLoginService;
    }

    public void setLoginService (ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }
}
