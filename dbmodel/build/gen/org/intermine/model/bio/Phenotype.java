package org.intermine.model.bio;

public interface Phenotype extends org.intermine.model.InterMineObject
{
    public java.lang.String getMutantType();
    public void setMutantType(final java.lang.String mutantType);

    public java.lang.String getStrainBackground();
    public void setStrainBackground(final java.lang.String strainBackground);

    public java.lang.String getExperimentType();
    public void setExperimentType(final java.lang.String experimentType);

    public java.lang.String getAllele();
    public void setAllele(final java.lang.String allele);

    public java.lang.String getObservable();
    public void setObservable(final java.lang.String observable);

    public java.lang.String getQualifier();
    public void setQualifier(final java.lang.String qualifier);

    public java.lang.String getExperimentComment();
    public void setExperimentComment(final java.lang.String experimentComment);

    public java.lang.String getChemical();
    public void setChemical(final java.lang.String chemical);

    public java.lang.String getReporter();
    public void setReporter(final java.lang.String reporter);

    public java.lang.String getAssay();
    public void setAssay(final java.lang.String assay);

    public java.lang.String getReporterComment();
    public void setReporterComment(final java.lang.String reporterComment);

    public java.lang.String getDetails();
    public void setDetails(final java.lang.String details);

    public java.lang.String getCondition();
    public void setCondition(final java.lang.String condition);

    public java.lang.String getAlleleComment();
    public void setAlleleComment(final java.lang.String alleleComment);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
