package pl.sdacademy;

import java.util.Objects;

public class Sms {
    private final String numerTel;
    private final String trescSms;

    public Sms(String numerTel, String trescSms) {
        this.numerTel = numerTel;
        this.trescSms = trescSms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sms sms = (Sms) o;
        return Objects.equals(numerTel, sms.numerTel) && Objects.equals(trescSms, sms.trescSms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerTel, trescSms);
    }
}
