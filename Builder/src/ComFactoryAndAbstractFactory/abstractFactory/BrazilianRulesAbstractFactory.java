package ComFactoryAndAbstractFactory.abstractFactory;

import ComFactoryAndAbstractFactory.model.certificate.BrazilianCertificate;
import ComFactoryAndAbstractFactory.model.certificate.Certificate;
import ComFactoryAndAbstractFactory.model.packing.BrazilianPacking;
import ComFactoryAndAbstractFactory.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements  CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
