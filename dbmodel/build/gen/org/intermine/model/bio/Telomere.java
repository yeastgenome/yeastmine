package org.intermine.model.bio;

public interface Telomere extends org.intermine.model.bio.BiologicalRegion
{
    public java.util.Set<org.intermine.model.bio.XElementCombinatorialRepeat> getxElementCombinatorialRepeats();
    public void setxElementCombinatorialRepeats(final java.util.Set<org.intermine.model.bio.XElementCombinatorialRepeat> XElementCombinatorialRepeats);
    public void addxElementCombinatorialRepeats(final org.intermine.model.bio.XElementCombinatorialRepeat arg);

    public java.util.Set<org.intermine.model.bio.TelomericRepeat> getTelomericRepeats();
    public void setTelomericRepeats(final java.util.Set<org.intermine.model.bio.TelomericRepeat> telomericRepeats);
    public void addTelomericRepeats(final org.intermine.model.bio.TelomericRepeat arg);

    public java.util.Set<org.intermine.model.bio.YPrimeElement> getyPrimeElements();
    public void setyPrimeElements(final java.util.Set<org.intermine.model.bio.YPrimeElement> YPrimeElements);
    public void addyPrimeElements(final org.intermine.model.bio.YPrimeElement arg);

    public java.util.Set<org.intermine.model.bio.XElement> getxElements();
    public void setxElements(final java.util.Set<org.intermine.model.bio.XElement> XElements);
    public void addxElements(final org.intermine.model.bio.XElement arg);

}
