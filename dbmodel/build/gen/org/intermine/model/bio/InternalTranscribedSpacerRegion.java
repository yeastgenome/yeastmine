package org.intermine.model.bio;

public interface InternalTranscribedSpacerRegion extends org.intermine.model.bio.BiologicalRegion
{
    public org.intermine.model.bio.NcRNAGene getNcrna_gene();
    public void setNcrna_gene(final org.intermine.model.bio.NcRNAGene ncrna_gene);
    public void proxyNcrna_gene(final org.intermine.objectstore.proxy.ProxyReference ncrna_gene);
    public org.intermine.model.InterMineObject proxGetNcrna_gene();

}
