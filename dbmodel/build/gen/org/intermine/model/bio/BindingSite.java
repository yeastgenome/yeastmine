package org.intermine.model.bio;

public interface BindingSite extends org.intermine.model.bio.BiologicalRegion
{
    public org.intermine.model.bio.Gene getRegulator();
    public void setRegulator(final org.intermine.model.bio.Gene regulator);
    public void proxyRegulator(final org.intermine.objectstore.proxy.ProxyReference regulator);
    public org.intermine.model.InterMineObject proxGetRegulator();

    public org.intermine.model.bio.XElement getXelement();
    public void setXelement(final org.intermine.model.bio.XElement xelement);
    public void proxyXelement(final org.intermine.objectstore.proxy.ProxyReference xelement);
    public org.intermine.model.InterMineObject proxGetXelement();

}
