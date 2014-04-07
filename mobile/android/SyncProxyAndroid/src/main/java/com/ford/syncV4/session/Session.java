package com.ford.syncV4.session;

import com.ford.syncV4.protocol.enums.ServiceType;
import com.ford.syncV4.service.Service;
import com.ford.syncV4.util.logger.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew Batutin on 1/21/14
 */
public class Session {

    public static final byte DEFAULT_SESSION_ID = 0;

    private static final String CLASS_NAME = Session.class.getSimpleName();

    public static Session createSession(ServiceType serviceType,
                                        byte sessionID, boolean encrypted) {
        Session session = new Session();
        session.setSessionId(sessionID);
        Service service = new Service();
        service.setSession(session);
        service.setServiceType(serviceType);
        service.setEncrypted(encrypted);
        session.addService(service);
        return session;
    }

    private byte sessionId = DEFAULT_SESSION_ID;
    private List<Service> serviceList = new ArrayList<Service>();

    public void setSessionId(byte sessionId) {
        this.sessionId = sessionId;
    }

    public byte getSessionId() {
        return sessionId;
    }

    public void addService(Service service) {
        Logger.i(CLASS_NAME + " Add " + service + ", contains:" + serviceList.contains(service));
        if (serviceList.contains(service)) {
            return;
        }
        serviceList.add(service);
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public boolean hasService(ServiceType serviceType) {
        if (serviceList == null || serviceList.isEmpty()) {
            return false;
        }
        for (Service service : serviceList) {
            if (service.getServiceType() == serviceType) {
                return true;
            }
        }
        return false;
    }

    public Service getService(ServiceType serviceType) {
        if (serviceList == null || serviceList.isEmpty()) {
            return null;
        }
        for (Service service : serviceList) {
            if (service.getServiceType() == serviceType) {
                return service;
            }
        }
        return null;
    }

    public int getServicesNumber() {
        return serviceList != null ? serviceList.size() : 0;
    }

    public boolean isServicesEmpty() {
        return serviceList != null && serviceList.isEmpty();
    }

    @Override
    public String toString() {
        return "Session{" +
                "sessionId=" + sessionId +
                ", serviceList size=" + serviceList.size() +
                '}';
    }

    public boolean removeService(Service service) {
        boolean result = serviceList.remove(service);
        Logger.i(CLASS_NAME + " Remove " + service.getServiceType() + ", complete:" + result);
        return result;
    }

    public Service createService(ServiceType serviceType) {
        Logger.i(CLASS_NAME + " Create " + serviceType);
        Service service = new Service();
        service.setServiceType(serviceType);
        service.setSession(this);
        return service;
    }

    public void stopSession() {
        serviceList.clear();
        sessionId = 0;
        Logger.i(CLASS_NAME + " Stop " + toString());
    }
}