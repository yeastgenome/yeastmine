package org.intermine.model.bio;

public interface ORF extends org.intermine.model.bio.ProteinCodingGene
{
    public java.util.Set<org.intermine.model.bio.Plus1TranslationalFrameshift> getPlus1translationalframeshifts();
    public void setPlus1translationalframeshifts(final java.util.Set<org.intermine.model.bio.Plus1TranslationalFrameshift> plus1translationalframeshifts);
    public void addPlus1translationalframeshifts(final org.intermine.model.bio.Plus1TranslationalFrameshift arg);

    public java.util.Set<org.intermine.model.bio.InteinEncodingRegion> getInteinencodingregions();
    public void setInteinencodingregions(final java.util.Set<org.intermine.model.bio.InteinEncodingRegion> inteinencodingregions);
    public void addInteinencodingregions(final org.intermine.model.bio.InteinEncodingRegion arg);

    public java.util.Set<org.intermine.model.bio.uORF> getUORFs();
    public void setUORFs(final java.util.Set<org.intermine.model.bio.uORF> uORFs);
    public void addUORFs(final org.intermine.model.bio.uORF arg);

    public java.util.Set<org.intermine.model.bio.FivePrimeUTRIntron> getFiveprimeutrintrons();
    public void setFiveprimeutrintrons(final java.util.Set<org.intermine.model.bio.FivePrimeUTRIntron> fiveprimeutrintrons);
    public void addFiveprimeutrintrons(final org.intermine.model.bio.FivePrimeUTRIntron arg);

    public java.util.Set<org.intermine.model.bio.TelomericRepeat> getTelomericRepeats();
    public void setTelomericRepeats(final java.util.Set<org.intermine.model.bio.TelomericRepeat> telomericRepeats);
    public void addTelomericRepeats(final org.intermine.model.bio.TelomericRepeat arg);

}
