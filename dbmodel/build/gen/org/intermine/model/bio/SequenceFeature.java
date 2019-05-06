package org.intermine.model.bio;

public interface SequenceFeature extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getBriefDescription();
    public void setBriefDescription(final java.lang.String briefDescription);

    public java.lang.Double getScore();
    public void setScore(final java.lang.Double score);

    public java.lang.String getScoreType();
    public void setScoreType(final java.lang.String scoreType);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getStatus();
    public void setStatus(final java.lang.String status);

    public java.lang.Integer getLength();
    public void setLength(final java.lang.Integer length);

    public java.lang.String getFeatureType();
    public void setFeatureType(final java.lang.String featureType);

    public java.lang.String getQualifier();
    public void setQualifier(final java.lang.String qualifier);

    public java.lang.String getFeatAttribute();
    public void setFeatAttribute(final java.lang.String featAttribute);

    public org.intermine.model.bio.Strain getStrain();
    public void setStrain(final org.intermine.model.bio.Strain strain);
    public void proxyStrain(final org.intermine.objectstore.proxy.ProxyReference strain);
    public org.intermine.model.InterMineObject proxGetStrain();

    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm();
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm);
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm);
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm();

    public org.intermine.model.bio.Location getChromosomeLocation();
    public void setChromosomeLocation(final org.intermine.model.bio.Location chromosomeLocation);
    public void proxyChromosomeLocation(final org.intermine.objectstore.proxy.ProxyReference chromosomeLocation);
    public org.intermine.model.InterMineObject proxGetChromosomeLocation();

    public org.intermine.model.bio.Sequence getSequence();
    public void setSequence(final org.intermine.model.bio.Sequence sequence);
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence);
    public org.intermine.model.InterMineObject proxGetSequence();

    public org.intermine.model.bio.Chromosome getChromosome();
    public void setChromosome(final org.intermine.model.bio.Chromosome chromosome);
    public void proxyChromosome(final org.intermine.objectstore.proxy.ProxyReference chromosome);
    public org.intermine.model.InterMineObject proxGetChromosome();

    public java.util.Set<org.intermine.model.bio.SequenceFeature> getOverlappingFeatures();
    public void setOverlappingFeatures(final java.util.Set<org.intermine.model.bio.SequenceFeature> overlappingFeatures);
    public void addOverlappingFeatures(final org.intermine.model.bio.SequenceFeature arg);

    public java.util.Set<org.intermine.model.bio.SequenceFeature> getChildFeatures();
    public void setChildFeatures(final java.util.Set<org.intermine.model.bio.SequenceFeature> childFeatures);
    public void addChildFeatures(final org.intermine.model.bio.SequenceFeature arg);

}
