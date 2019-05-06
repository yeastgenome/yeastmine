package org.intermine.model.bio;

public interface YPrimeElement extends org.intermine.model.bio.RepeatRegion, org.intermine.model.bio.Telomere
{
    public org.intermine.model.bio.Telomere getTelomere();
    public void setTelomere(final org.intermine.model.bio.Telomere telomere);
    public void proxyTelomere(final org.intermine.objectstore.proxy.ProxyReference telomere);
    public org.intermine.model.InterMineObject proxGetTelomere();

    public java.util.Set<org.intermine.model.bio.ARSConsensusSequence> getArsconsensussequences();
    public void setArsconsensussequences(final java.util.Set<org.intermine.model.bio.ARSConsensusSequence> arsconsensussequences);
    public void addArsconsensussequences(final org.intermine.model.bio.ARSConsensusSequence arg);

    public java.util.Set<org.intermine.model.bio.RepeatRegion> getRepeatregions();
    public void setRepeatregions(final java.util.Set<org.intermine.model.bio.RepeatRegion> repeatregions);
    public void addRepeatregions(final org.intermine.model.bio.RepeatRegion arg);

}
