package org.intermine.model.bio;

public interface ProteinProperty extends org.intermine.model.InterMineObject
{
    public java.lang.String getLocation();
    public void setLocation(final java.lang.String location);

    public java.lang.String getSource();
    public void setSource(final java.lang.String source);

    public java.lang.String getPropertyName();
    public void setPropertyName(final java.lang.String propertyName);

    public java.lang.String getIsReversible();
    public void setIsReversible(final java.lang.String isReversible);

    public java.lang.String getCondition();
    public void setCondition(final java.lang.String condition);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

}
