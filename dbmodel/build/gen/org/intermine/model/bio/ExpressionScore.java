package org.intermine.model.bio;

public interface ExpressionScore extends org.intermine.model.InterMineObject
{
    public java.lang.Float getScore();
    public void setScore(final java.lang.Float score);

    public org.intermine.model.bio.ExpressionCondition getExpressioncondition();
    public void setExpressioncondition(final org.intermine.model.bio.ExpressionCondition expressioncondition);
    public void proxyExpressioncondition(final org.intermine.objectstore.proxy.ProxyReference expressioncondition);
    public org.intermine.model.InterMineObject proxGetExpressioncondition();

}
