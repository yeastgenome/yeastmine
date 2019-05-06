package org.intermine.model.bio;

public interface Organism extends org.intermine.model.InterMineObject
{
    public java.lang.String getSpecies();
    public void setSpecies(final java.lang.String species);

    public java.lang.String getGenus();
    public void setGenus(final java.lang.String genus);

    public java.lang.String getTaxonId();
    public void setTaxonId(final java.lang.String taxonId);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getAnnotationVersion();
    public void setAnnotationVersion(final java.lang.String annotationVersion);

    public java.lang.String getAssemblyVersion();
    public void setAssemblyVersion(final java.lang.String assemblyVersion);

    public java.lang.String getCommonName();
    public void setCommonName(final java.lang.String commonName);

    public java.lang.String getShortName();
    public void setShortName(final java.lang.String shortName);

    public java.util.Set<org.intermine.model.bio.Strain> getStrains();
    public void setStrains(final java.util.Set<org.intermine.model.bio.Strain> strains);
    public void addStrains(final org.intermine.model.bio.Strain arg);

}
