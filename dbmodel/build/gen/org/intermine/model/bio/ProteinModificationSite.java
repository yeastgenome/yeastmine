package org.intermine.model.bio;

public interface ProteinModificationSite extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getSource();
    public void setSource(final java.lang.String source);

    public java.lang.String getCategory();
    public void setCategory(final java.lang.String category);

    public java.lang.String getModificationType();
    public void setModificationType(final java.lang.String modificationType);

    public java.lang.String getExperimentalNterminalSequence();
    public void setExperimentalNterminalSequence(final java.lang.String experimentalNterminalSequence);

    public java.lang.String getExperimentalNterminalSite();
    public void setExperimentalNterminalSite(final java.lang.String experimentalNterminalSite);

    public java.lang.String getModificationSite();
    public void setModificationSite(final java.lang.String modificationSite);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

    public java.util.Set<org.intermine.model.bio.Gene> getModifier();
    public void setModifier(final java.util.Set<org.intermine.model.bio.Gene> modifier);
    public void addModifier(final org.intermine.model.bio.Gene arg);

}
