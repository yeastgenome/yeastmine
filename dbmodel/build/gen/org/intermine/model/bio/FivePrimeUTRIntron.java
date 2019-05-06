package org.intermine.model.bio;

public interface FivePrimeUTRIntron extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.ORF getOrf();
    public void setOrf(final org.intermine.model.bio.ORF orf);
    public void proxyOrf(final org.intermine.objectstore.proxy.ProxyReference orf);
    public org.intermine.model.InterMineObject proxGetOrf();

}
