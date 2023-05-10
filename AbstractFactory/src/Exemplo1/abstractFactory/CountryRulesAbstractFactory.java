package Exemplo1.abstractFactory;

import Exemplo1.model.certificate.Certificate;
import Exemplo1.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();

    Packing getPacking();
}
