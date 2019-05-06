package org.intermine.model.bio;

public interface ProteinHalfLife extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getUnits();
    public void setUnits(final java.lang.String units);

    public java.lang.String getSource();
    public void setSource(final java.lang.String source);

    public java.lang.String getExperiment();
    public void setExperiment(final java.lang.String experiment);

    public java.lang.Float getValue();
    public void setValue(final java.lang.Float value);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

}
