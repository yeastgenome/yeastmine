package org.intermine.model.bio;

public interface XElement extends org.intermine.model.bio.Telomere
{
    public org.intermine.model.bio.Telomere getTelomere();
    public void setTelomere(final org.intermine.model.bio.Telomere telomere);
    public void proxyTelomere(final org.intermine.objectstore.proxy.ProxyReference telomere);
    public org.intermine.model.InterMineObject proxGetTelomere();

    public java.util.Set<org.intermine.model.bio.BindingSite> getBindingsites();
    public void setBindingsites(final java.util.Set<org.intermine.model.bio.BindingSite> bindingsites);
    public void addBindingsites(final org.intermine.model.bio.BindingSite arg);

    public java.util.Set<org.intermine.model.bio.ARSConsensusSequence> getArsconsensussequences();
    public void setArsconsensussequences(final java.util.Set<org.intermine.model.bio.ARSConsensusSequence> arsconsensussequences);
    public void addArsconsensussequences(final org.intermine.model.bio.ARSConsensusSequence arg);

}
