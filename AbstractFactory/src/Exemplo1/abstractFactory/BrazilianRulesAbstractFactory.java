package Exemplo1.abstractFactory;

import Exemplo1.model.certificate.BrazilianCertificate;
import Exemplo1.model.certificate.Certificate;
import Exemplo1.model.packing.BrazilianPacking;
import Exemplo1.model.packing.Packing;

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
