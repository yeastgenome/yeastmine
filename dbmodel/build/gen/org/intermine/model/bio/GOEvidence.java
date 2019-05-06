package org.intermine.model.bio;

public interface GOEvidence extends org.intermine.model.bio.OntologyEvidence
{
    public java.lang.String getWithText();
    public void setWithText(final java.lang.String withText);

    public java.util.Set<org.intermine.model.bio.BioEntity> getWith();
    public void setWith(final java.util.Set<org.intermine.model.bio.BioEntity> with);
    public void addWith(final org.intermine.model.bio.BioEntity arg);

}
