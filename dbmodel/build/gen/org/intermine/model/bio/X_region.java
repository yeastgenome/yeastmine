package org.intermine.model.bio;

public interface X_region extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.MatingTypeRegion getMatingtyperegion();
    public void setMatingtyperegion(final org.intermine.model.bio.MatingTypeRegion matingtyperegion);
    public void proxyMatingtyperegion(final org.intermine.objectstore.proxy.ProxyReference matingtyperegion);
    public org.intermine.model.InterMineObject proxGetMatingtyperegion();

}
