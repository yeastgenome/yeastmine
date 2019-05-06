package org.intermine.model.bio;

public interface TelomericRepeat extends org.intermine.model.bio.RepeatRegion, org.intermine.model.bio.Telomere
{
    public org.intermine.model.bio.ORF getOrf();
    public void setOrf(final org.intermine.model.bio.ORF orf);
    public void proxyOrf(final org.intermine.objectstore.proxy.ProxyReference orf);
    public org.intermine.model.InterMineObject proxGetOrf();

    public org.intermine.model.bio.Telomere getTelomere();
    public void setTelomere(final org.intermine.model.bio.Telomere telomere);
    public void proxyTelomere(final org.intermine.objectstore.proxy.ProxyReference telomere);
    public org.intermine.model.InterMineObject proxGetTelomere();

}
