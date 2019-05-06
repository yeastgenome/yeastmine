package org.intermine.model.bio;

public interface ProteinAbundance extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getUnits();
    public void setUnits(final java.lang.String units);

    public java.lang.String getSource();
    public void setSource(final java.lang.String source);

    public java.lang.String getAssay();
    public void setAssay(final java.lang.String assay);

    public java.lang.String getTreatment();
    public void setTreatment(final java.lang.String treatment);

    public java.lang.String getTreatmentTime();
    public void setTreatmentTime(final java.lang.String treatmentTime);

    public java.lang.String getStrainBackground();
    public void setStrainBackground(final java.lang.String strainBackground);

    public java.lang.Float getAbundance();
    public void setAbundance(final java.lang.Float abundance);

    public java.lang.String getVisualization();
    public void setVisualization(final java.lang.String visualization);

    public java.lang.String getFoldChange();
    public void setFoldChange(final java.lang.String foldChange);

    public java.lang.String getMedia();
    public void setMedia(final java.lang.String media);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public org.intermine.model.bio.Publication getOrigPublication();
    public void setOrigPublication(final org.intermine.model.bio.Publication origPublication);
    public void proxyOrigPublication(final org.intermine.objectstore.proxy.ProxyReference origPublication);
    public org.intermine.model.InterMineObject proxGetOrigPublication();

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

}
