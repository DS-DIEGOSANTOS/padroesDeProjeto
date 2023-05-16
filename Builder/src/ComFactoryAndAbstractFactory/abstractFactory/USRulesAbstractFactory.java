package ComFactoryAndAbstractFactory.abstractFactory;

import ComFactoryAndAbstractFactory.model.certificate.Certificate;
import ComFactoryAndAbstractFactory.model.certificate.USCertificate;
import ComFactoryAndAbstractFactory.model.packing.BrazilianPacking;
import ComFactoryAndAbstractFactory.model.packing.Packing;


public class USRulesAbstractFactory implements  CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
