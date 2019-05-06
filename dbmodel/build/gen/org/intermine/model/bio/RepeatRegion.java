package org.intermine.model.bio;

public interface RepeatRegion extends org.intermine.model.bio.BiologicalRegion
{
    public org.intermine.model.bio.YPrimeElement getYprimeelement();
    public void setYprimeelement(final org.intermine.model.bio.YPrimeElement yprimeelement);
    public void proxyYprimeelement(final org.intermine.objectstore.proxy.ProxyReference yprimeelement);
    public org.intermine.model.InterMineObject proxGetYprimeelement();

}
