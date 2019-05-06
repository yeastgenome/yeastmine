package org.intermine.model.bio;

public interface InteractionExperiment extends org.intermine.model.InterMineObject
{
    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getHostOrganism();
    public void setHostOrganism(final java.lang.String hostOrganism);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.InteractionTerm> getInteractionDetectionMethods();
    public void setInteractionDetectionMethods(final java.util.Set<org.intermine.model.bio.InteractionTerm> interactionDetectionMethods);
    public void addInteractionDetectionMethods(final org.intermine.model.bio.InteractionTerm arg);

    public java.util.Set<org.intermine.model.bio.Comment> getComments();
    public void setComments(final java.util.Set<org.intermine.model.bio.Comment> comments);
    public void addComments(final org.intermine.model.bio.Comment arg);

    public java.util.Set<org.intermine.model.bio.InteractionDetail> getInteractions();
    public void setInteractions(final java.util.Set<org.intermine.model.bio.InteractionDetail> interactions);
    public void addInteractions(final org.intermine.model.bio.InteractionDetail arg);

    public java.util.Set<org.intermine.model.bio.InteractionTerm> getParticipantIdentificationMethods();
    public void setParticipantIdentificationMethods(final java.util.Set<org.intermine.model.bio.InteractionTerm> participantIdentificationMethods);
    public void addParticipantIdentificationMethods(final org.intermine.model.bio.InteractionTerm arg);

}
