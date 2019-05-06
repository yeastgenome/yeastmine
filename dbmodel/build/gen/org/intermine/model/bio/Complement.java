package org.intermine.model.bio;

public interface Complement extends org.intermine.model.InterMineObject
{
    public java.lang.String getSource();
    public void setSource(final java.lang.String source);

    public java.lang.String getDirection();
    public void setDirection(final java.lang.String direction);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getNotes();
    public void setNotes(final java.lang.String notes);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.Gene getComplement();
    public void setComplement(final org.intermine.model.bio.Gene complement);
    public void proxyComplement(final org.intermine.objectstore.proxy.ProxyReference complement);
    public org.intermine.model.InterMineObject proxGetComplement();

    public java.util.Set<org.intermine.model.bio.CrossReference> getCrossReferences();
    public void setCrossReferences(final java.util.Set<org.intermine.model.bio.CrossReference> crossReferences);
    public void addCrossReferences(final org.intermine.model.bio.CrossReference arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
