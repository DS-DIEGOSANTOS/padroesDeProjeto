package Exemplo1.abstractFactory;

import Exemplo1.model.certificate.Certificate;
import Exemplo1.model.certificate.USCertificate;
import Exemplo1.model.packing.BrazilianPacking;
import Exemplo1.model.packing.Packing;

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
