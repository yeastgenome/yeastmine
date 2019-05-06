package org.intermine.model.bio;

public interface Complex extends org.intermine.model.InterMineObject
{
    public java.lang.String getProperties();
    public void setProperties(final java.lang.String properties);

    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getSystematicName();
    public void setSystematicName(final java.lang.String systematicName);

    public java.lang.String getFunction();
    public void setFunction(final java.lang.String function);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

    public java.util.Set<org.intermine.model.bio.Interactor> getAllInteractors();
    public void setAllInteractors(final java.util.Set<org.intermine.model.bio.Interactor> allInteractors);
    public void addAllInteractors(final org.intermine.model.bio.Interactor arg);

    public java.util.Set<org.intermine.model.bio.GOAnnotation> getGoAnnotation();
    public void setGoAnnotation(final java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation);
    public void addGoAnnotation(final org.intermine.model.bio.GOAnnotation arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
