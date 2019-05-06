package org.intermine.model.bio;

public interface RegulationSummary extends org.intermine.model.InterMineObject
{
    public java.lang.String getSummaryParagraph();
    public void setSummaryParagraph(final java.lang.String summaryParagraph);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
