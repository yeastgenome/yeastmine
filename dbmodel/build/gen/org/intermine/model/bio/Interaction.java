package org.intermine.model.bio;

public interface Interaction extends org.intermine.model.InterMineObject
{
    public org.intermine.model.bio.BioEntity getParticipant2();
    public void setParticipant2(final org.intermine.model.bio.BioEntity participant2);
    public void proxyParticipant2(final org.intermine.objectstore.proxy.ProxyReference participant2);
    public org.intermine.model.InterMineObject proxGetParticipant2();

    public org.intermine.model.bio.Complex getComplex();
    public void setComplex(final org.intermine.model.bio.Complex complex);
    public void proxyComplex(final org.intermine.objectstore.proxy.ProxyReference complex);
    public org.intermine.model.InterMineObject proxGetComplex();

    public org.intermine.model.bio.BioEntity getParticipant1();
    public void setParticipant1(final org.intermine.model.bio.BioEntity participant1);
    public void proxyParticipant1(final org.intermine.objectstore.proxy.ProxyReference participant1);
    public org.intermine.model.InterMineObject proxGetParticipant1();

    public java.util.Set<org.intermine.model.bio.InteractionDetail> getDetails();
    public void setDetails(final java.util.Set<org.intermine.model.bio.InteractionDetail> details);
    public void addDetails(final org.intermine.model.bio.InteractionDetail arg);

}
