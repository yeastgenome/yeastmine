package org.intermine.model.bio;

public interface ExpressionDataSetTag extends org.intermine.model.InterMineObject
{
    public java.lang.String getTagname();
    public void setTagname(final java.lang.String tagname);

    public java.util.Set<org.intermine.model.bio.ExpressionDataSet> getExpressiondatasets();
    public void setExpressiondatasets(final java.util.Set<org.intermine.model.bio.ExpressionDataSet> expressiondatasets);
    public void addExpressiondatasets(final org.intermine.model.bio.ExpressionDataSet arg);

}
