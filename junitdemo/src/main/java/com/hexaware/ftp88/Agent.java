package com.hexaware.ftp88;
public class Agent {
    private int agentId;
    private String agentname;
    private double premium;
    private PaymentMode paymentmode;
    private MaritalStatus maritalStatus;
    private String city;

    public Agent() {

    }
    public Agent(final int argagentId,final String argagentname,
             final double argpremium,final PaymentMode paymentmode, final MaritalStatus maritalStatus,
             final String argcity) {
                 this.agentId = argagentId;
                 this.agentname = agentname;
                 this.premium = argpremium;
                 this.paymentmode = paymentmode;
                 this.maritalStatus = maritalStatus;
                 this.city = argcity;
             }

            public final int getagentId() {

                return agentId;
            }
            public final void setagentId(final int argagentId) {

            this.agentId = argagentId;

            }
            public final String getagentname() {
                   return agentname;
            }
            public final void setagentname(final String argagentname) {
                this.agentname = argagentname;
            }
            public final double getpremium() {
                   return premium;
            }
            public final void setpremium(final double argpremium) {
                this.premium = argpremium;
            }
            public final PaymentMode getPaymentMode() {
                return paymentmode;
            }
            public void setPaymentMode(final PaymentMode argpaymentmode) {
                this.paymentmode = argpaymentmode;
            }
            public final MaritalStatus getmaritalStatus() {
                return maritalStatus;
            }
            public void setmaritalStatus(final MaritalStatus argmaritalStatus) {
                this.maritalStatus = argmaritalStatus;
            }
            public final String getcity() {
                   return city;
            }
            public final void setcity(final String argcity) {
                this.city = argcity;
            }

}