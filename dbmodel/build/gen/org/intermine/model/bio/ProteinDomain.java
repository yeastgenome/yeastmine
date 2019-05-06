package org.intermine.model.bio;

public interface ProteinDomain extends org.intermine.model.InterMineObject
{
    public java.lang.String getMethod();
    public void setMethod(final java.lang.String method);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getInterpro();
    public void setInterpro(final java.lang.String interpro);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.Integer getStart();
    public void setStart(final java.lang.Integer start);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getRunDate();
    public void setRunDate(final java.lang.String runDate);

    public java.lang.Integer getEnd();
    public void setEnd(final java.lang.Integer end);

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

}
