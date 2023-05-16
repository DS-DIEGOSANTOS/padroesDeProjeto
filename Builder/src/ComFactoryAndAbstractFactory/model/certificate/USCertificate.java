package ComFactoryAndAbstractFactory.model.certificate;

public class USCertificate implements  Certificate{
    @Override
    public String getCertification() {
        return "\t- Calibrating US rules";
    }
}
