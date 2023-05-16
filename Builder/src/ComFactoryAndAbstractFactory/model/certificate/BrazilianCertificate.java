package ComFactoryAndAbstractFactory.model.certificate;

public class BrazilianCertificate implements  Certificate{
    @Override
    public String getCertification() {
        return "\t- Calibrating Brasilian rules\n\t- Applying Anatel's Stamp";
    }
}
