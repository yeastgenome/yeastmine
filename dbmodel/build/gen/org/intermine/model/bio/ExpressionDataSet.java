package org.intermine.model.bio;

public interface ExpressionDataSet extends org.intermine.model.InterMineObject
{
    public java.lang.String getNumGenes();
    public void setNumGenes(final java.lang.String numGenes);

    public java.lang.String getGeoID();
    public void setGeoID(final java.lang.String geoID);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getTitle();
    public void setTitle(final java.lang.String title);

    public java.lang.String getPubmedID();
    public void setPubmedID(final java.lang.String pubmedID);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getJournal();
    public void setJournal(final java.lang.String journal);

    public java.lang.String getChannelCount();
    public void setChannelCount(final java.lang.String channelCount);

    public java.lang.String getPlatformID();
    public void setPlatformID(final java.lang.String platformID);

    public java.lang.String getAllAuthors();
    public void setAllAuthors(final java.lang.String allAuthors);

    public java.lang.Integer getNumConds();
    public void setNumConds(final java.lang.Integer numConds);

    public java.lang.String getTags();
    public void setTags(final java.lang.String tags);

    public java.lang.String getPublicationYear();
    public void setPublicationYear(final java.lang.String publicationYear);

    public java.lang.String getFileName();
    public void setFileName(final java.lang.String fileName);

    public java.lang.String getAuthor();
    public void setAuthor(final java.lang.String author);

    public java.util.Set<org.intermine.model.bio.ExpressionCondition> getExpressionconditions();
    public void setExpressionconditions(final java.util.Set<org.intermine.model.bio.ExpressionCondition> expressionconditions);
    public void addExpressionconditions(final org.intermine.model.bio.ExpressionCondition arg);

    public java.util.Set<org.intermine.model.bio.ExpressionDataSetTag> getExpressiondatasettags();
    public void setExpressiondatasettags(final java.util.Set<org.intermine.model.bio.ExpressionDataSetTag> expressiondatasettags);
    public void addExpressiondatasettags(final org.intermine.model.bio.ExpressionDataSetTag arg);

}
