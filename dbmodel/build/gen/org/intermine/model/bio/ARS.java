package org.intermine.model.bio;

public interface ARS extends org.intermine.model.bio.OriginOfReplication
{
    public java.lang.String getGeneSummary();
    public void setGeneSummary(final java.lang.String geneSummary);

    public java.util.Set<org.intermine.model.bio.ARSConsensusSequence> getArsconsensussequences();
    public void setArsconsensussequences(final java.util.Set<org.intermine.model.bio.ARSConsensusSequence> arsconsensussequences);
    public void addArsconsensussequences(final org.intermine.model.bio.ARSConsensusSequence arg);

}
