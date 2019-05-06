package org.intermine.model.bio;

public interface InteractionDetail extends org.intermine.model.InterMineObject
{
    public java.lang.String getPhenotype();
    public void setPhenotype(final java.lang.String phenotype);

    public java.lang.String getRole2();
    public void setRole2(final java.lang.String role2);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getConfidenceText();
    public void setConfidenceText(final java.lang.String confidenceText);

    public java.lang.String getRole1();
    public void setRole1(final java.lang.String role1);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.Double getConfidence();
    public void setConfidence(final java.lang.Double confidence);

    public java.lang.String getAnnotationType();
    public void setAnnotationType(final java.lang.String annotationType);

    public java.lang.String getRelationshipType();
    public void setRelationshipType(final java.lang.String relationshipType);

    public java.lang.String getShortName();
    public void setShortName(final java.lang.String shortName);

    public java.lang.String getModification();
    public void setModification(final java.lang.String modification);

    public org.intermine.model.bio.InteractionExperiment getExperiment();
    public void setExperiment(final org.intermine.model.bio.InteractionExperiment experiment);
    public void proxyExperiment(final org.intermine.objectstore.proxy.ProxyReference experiment);
    public org.intermine.model.InterMineObject proxGetExperiment();

    public org.intermine.model.bio.Interaction getInteraction();
    public void setInteraction(final org.intermine.model.bio.Interaction interaction);
    public void proxyInteraction(final org.intermine.objectstore.proxy.ProxyReference interaction);
    public org.intermine.model.InterMineObject proxGetInteraction();

    public java.util.Set<org.intermine.model.bio.InteractionRegion> getInteractingRegions();
    public void setInteractingRegions(final java.util.Set<org.intermine.model.bio.InteractionRegion> interactingRegions);
    public void addInteractingRegions(final org.intermine.model.bio.InteractionRegion arg);

    public java.util.Set<org.intermine.model.bio.Interactor> getAllInteractors();
    public void setAllInteractors(final java.util.Set<org.intermine.model.bio.Interactor> allInteractors);
    public void addAllInteractors(final org.intermine.model.bio.Interactor arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
