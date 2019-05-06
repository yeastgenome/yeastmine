package org.intermine.model.bio;

public interface RegulatoryRegion extends org.intermine.model.bio.BiologicalRegion
{
    public java.lang.String getExperimentCondition();
    public void setExperimentCondition(final java.lang.String experimentCondition);

    public java.lang.String getRegulationDirection();
    public void setRegulationDirection(final java.lang.String regulationDirection);

    public java.lang.String getStrainBackground();
    public void setStrainBackground(final java.lang.String strainBackground);

    public java.lang.String getRegulatorType();
    public void setRegulatorType(final java.lang.String regulatorType);

    public java.lang.String getAnnotationType();
    public void setAnnotationType(final java.lang.String annotationType);

    public java.lang.String getRegulationType();
    public void setRegulationType(final java.lang.String regulationType);

    public java.lang.String getDatasource();
    public void setDatasource(final java.lang.String datasource);

    public org.intermine.model.bio.RegulationEvidence getRegEvidence();
    public void setRegEvidence(final org.intermine.model.bio.RegulationEvidence regEvidence);
    public void proxyRegEvidence(final org.intermine.objectstore.proxy.ProxyReference regEvidence);
    public org.intermine.model.InterMineObject proxGetRegEvidence();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}
