package org.intermine.model.bio;

public interface ExpressionCondition extends org.intermine.model.InterMineObject
{
    public java.lang.String getConditionname();
    public void setConditionname(final java.lang.String conditionname);

    public java.lang.Integer getOrdernumber();
    public void setOrdernumber(final java.lang.Integer ordernumber);

    public org.intermine.model.bio.ExpressionDataSet getExpressiondataset();
    public void setExpressiondataset(final org.intermine.model.bio.ExpressionDataSet expressiondataset);
    public void proxyExpressiondataset(final org.intermine.objectstore.proxy.ProxyReference expressiondataset);
    public org.intermine.model.InterMineObject proxGetExpressiondataset();

}
