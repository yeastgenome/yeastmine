package org.intermine.model.bio;

public interface XElementCombinatorialRepeat extends org.intermine.model.bio.RepeatRegion, org.intermine.model.bio.Telomere
{
    public org.intermine.model.bio.Telomere getTelomere();
    public void setTelomere(final org.intermine.model.bio.Telomere telomere);
    public void proxyTelomere(final org.intermine.objectstore.proxy.ProxyReference telomere);
    public org.intermine.model.InterMineObject proxGetTelomere();

    public java.util.Set<org.intermine.model.bio.Insertion> getInsertions();
    public void setInsertions(final java.util.Set<org.intermine.model.bio.Insertion> insertions);
    public void addInsertions(final org.intermine.model.bio.Insertion arg);

}
