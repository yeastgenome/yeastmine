package org.intermine.model.bio;

public interface CausalRelationship extends org.intermine.model.InterMineObject
{
    public org.intermine.model.bio.OntologyTerm getType();
    public void setType(final org.intermine.model.bio.OntologyTerm type);
    public void proxyType(final org.intermine.objectstore.proxy.ProxyReference type);
    public org.intermine.model.InterMineObject proxGetType();

    public org.intermine.model.bio.BioEntity getFeature();
    public void setFeature(final org.intermine.model.bio.BioEntity feature);
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature);
    public org.intermine.model.InterMineObject proxGetFeature();

}
