package pl.sdacademy;

public class SmsService {
    private SmsGateway smsGateway;

    public SmsService(SmsGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

    public void wyslijSms(String numerTel, String trescSms) {
        smsGateway.send(new Sms(numerTel, trescSms));
    }
}
