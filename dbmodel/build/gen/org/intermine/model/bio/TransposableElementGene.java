package org.intermine.model.bio;

public interface TransposableElementGene extends org.intermine.model.bio.ProteinCodingGene
{
    public java.util.Set<org.intermine.model.bio.Plus1TranslationalFrameshift> getPlus1translationalframeshifts();
    public void setPlus1translationalframeshifts(final java.util.Set<org.intermine.model.bio.Plus1TranslationalFrameshift> plus1translationalframeshifts);
    public void addPlus1translationalframeshifts(final org.intermine.model.bio.Plus1TranslationalFrameshift arg);

}
