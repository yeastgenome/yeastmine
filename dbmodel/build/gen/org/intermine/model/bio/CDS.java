package org.intermine.model.bio;

public interface CDS extends org.intermine.model.bio.BiologicalRegion
{
    public org.intermine.model.bio.Plasmid getPlasmid();
    public void setPlasmid(final org.intermine.model.bio.Plasmid plasmid);
    public void proxyPlasmid(final org.intermine.objectstore.proxy.ProxyReference plasmid);
    public org.intermine.model.InterMineObject proxGetPlasmid();

    public org.intermine.model.bio.Location getPlasmidLocation();
    public void setPlasmidLocation(final org.intermine.model.bio.Location plasmidLocation);
    public void proxyPlasmidLocation(final org.intermine.objectstore.proxy.ProxyReference plasmidLocation);
    public org.intermine.model.InterMineObject proxGetPlasmidLocation();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.Transcript getTranscript();
    public void setTranscript(final org.intermine.model.bio.Transcript transcript);
    public void proxyTranscript(final org.intermine.objectstore.proxy.ProxyReference transcript);
    public org.intermine.model.InterMineObject proxGetTranscript();

    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

}
