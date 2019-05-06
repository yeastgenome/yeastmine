package org.intermine.model.bio;

public interface Plus1TranslationalFrameshift extends org.intermine.model.bio.BiologicalRegion
{
    public org.intermine.model.bio.TransposableElementGene getTransposableelementgene();
    public void setTransposableelementgene(final org.intermine.model.bio.TransposableElementGene transposableelementgene);
    public void proxyTransposableelementgene(final org.intermine.objectstore.proxy.ProxyReference transposableelementgene);
    public org.intermine.model.InterMineObject proxGetTransposableelementgene();

    public org.intermine.model.bio.Pseudogene getPseudogene();
    public void setPseudogene(final org.intermine.model.bio.Pseudogene pseudogene);
    public void proxyPseudogene(final org.intermine.objectstore.proxy.ProxyReference pseudogene);
    public org.intermine.model.InterMineObject proxGetPseudogene();

    public org.intermine.model.bio.ORF getOrf();
    public void setOrf(final org.intermine.model.bio.ORF orf);
    public void proxyOrf(final org.intermine.objectstore.proxy.ProxyReference orf);
    public org.intermine.model.InterMineObject proxGetOrf();

}
