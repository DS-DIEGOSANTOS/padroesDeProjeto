package ComFactoryAndAbstractFactory.abstractFactory;

import ComFactoryAndAbstractFactory.model.certificate.Certificate;
import ComFactoryAndAbstractFactory.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();

    Packing getPacking();
}
