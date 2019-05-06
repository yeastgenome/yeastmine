package org.intermine.model.bio;

public interface Interactor extends org.intermine.model.InterMineObject
{
    public java.lang.String getAnnotations();
    public void setAnnotations(final java.lang.String annotations);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.Integer getStoichiometry();
    public void setStoichiometry(final java.lang.Integer stoichiometry);

    public java.lang.String getBiologicalRole();
    public void setBiologicalRole(final java.lang.String biologicalRole);

    public org.intermine.model.bio.BioEntity getParticipant();
    public void setParticipant(final org.intermine.model.bio.BioEntity participant);
    public void proxyParticipant(final org.intermine.objectstore.proxy.ProxyReference participant);
    public org.intermine.model.InterMineObject proxGetParticipant();

    public java.util.Set<org.intermine.model.bio.Interaction> getInteractions();
    public void setInteractions(final java.util.Set<org.intermine.model.bio.Interaction> interactions);
    public void addInteractions(final org.intermine.model.bio.Interaction arg);

}
