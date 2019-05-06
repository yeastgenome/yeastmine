package org.intermine.model.bio;

public interface CentromereDNAElementI extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.Centromere getCentromere();
    public void setCentromere(final org.intermine.model.bio.Centromere centromere);
    public void proxyCentromere(final org.intermine.objectstore.proxy.ProxyReference centromere);
    public org.intermine.model.InterMineObject proxGetCentromere();

}
