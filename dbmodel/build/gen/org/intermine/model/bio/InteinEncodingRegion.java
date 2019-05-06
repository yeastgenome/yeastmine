package org.intermine.model.bio;

public interface InteinEncodingRegion extends org.intermine.model.bio.Gene
{
    public org.intermine.model.bio.ORF getOrf();
    public void setOrf(final org.intermine.model.bio.ORF orf);
    public void proxyOrf(final org.intermine.objectstore.proxy.ProxyReference orf);
    public org.intermine.model.InterMineObject proxGetOrf();

}
