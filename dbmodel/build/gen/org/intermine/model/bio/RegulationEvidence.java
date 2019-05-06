package org.intermine.model.bio;

public interface RegulationEvidence extends org.intermine.model.bio.OntologyAnnotation
{
    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
