package org.intermine.model.bio;

public interface NcRNAGene extends org.intermine.model.bio.BiologicalRegion, org.intermine.model.bio.Gene
{
    public java.util.Set<org.intermine.model.bio.NonTranscribedRegion> getNontranscribedregions();
    public void setNontranscribedregions(final java.util.Set<org.intermine.model.bio.NonTranscribedRegion> nontranscribedregions);
    public void addNontranscribedregions(final org.intermine.model.bio.NonTranscribedRegion arg);

    public java.util.Set<org.intermine.model.bio.NoncodingExon> getNoncodingexons();
    public void setNoncodingexons(final java.util.Set<org.intermine.model.bio.NoncodingExon> noncodingexons);
    public void addNoncodingexons(final org.intermine.model.bio.NoncodingExon arg);

    public java.util.Set<org.intermine.model.bio.ExternalTranscribedSpacerRegion> getExternaltranscribedspacerregions();
    public void setExternaltranscribedspacerregions(final java.util.Set<org.intermine.model.bio.ExternalTranscribedSpacerRegion> externaltranscribedspacerregions);
    public void addExternaltranscribedspacerregions(final org.intermine.model.bio.ExternalTranscribedSpacerRegion arg);

    public java.util.Set<org.intermine.model.bio.InternalTranscribedSpacerRegion> getInternaltranscribedspacerregions();
    public void setInternaltranscribedspacerregions(final java.util.Set<org.intermine.model.bio.InternalTranscribedSpacerRegion> internaltranscribedspacerregions);
    public void addInternaltranscribedspacerregions(final org.intermine.model.bio.InternalTranscribedSpacerRegion arg);

}
