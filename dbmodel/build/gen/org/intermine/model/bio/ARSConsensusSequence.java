package org.intermine.model.bio;

public interface ARSConsensusSequence extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.XElement getXelement();
    public void setXelement(final org.intermine.model.bio.XElement xelement);
    public void proxyXelement(final org.intermine.objectstore.proxy.ProxyReference xelement);
    public org.intermine.model.InterMineObject proxGetXelement();

    public org.intermine.model.bio.ARS getArs();
    public void setArs(final org.intermine.model.bio.ARS ars);
    public void proxyArs(final org.intermine.objectstore.proxy.ProxyReference ars);
    public org.intermine.model.InterMineObject proxGetArs();

    public org.intermine.model.bio.YPrimeElement getYprimeelement();
    public void setYprimeelement(final org.intermine.model.bio.YPrimeElement yprimeelement);
    public void proxyYprimeelement(final org.intermine.objectstore.proxy.ProxyReference yprimeelement);
    public org.intermine.model.InterMineObject proxGetYprimeelement();

}
