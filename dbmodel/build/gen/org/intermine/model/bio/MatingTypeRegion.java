package org.intermine.model.bio;

public interface MatingTypeRegion extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.X_region getx_regions();
    public void setx_regions(final org.intermine.model.bio.X_region X_regions);
    public void proxyx_regions(final org.intermine.objectstore.proxy.ProxyReference X_regions);
    public org.intermine.model.InterMineObject proxGetx_regions();

    public org.intermine.model.bio.Z2_region getz2_regions();
    public void setz2_regions(final org.intermine.model.bio.Z2_region Z2_regions);
    public void proxyz2_regions(final org.intermine.objectstore.proxy.ProxyReference Z2_regions);
    public org.intermine.model.InterMineObject proxGetz2_regions();

    public org.intermine.model.bio.Y_region gety_regions();
    public void sety_regions(final org.intermine.model.bio.Y_region Y_regions);
    public void proxyy_regions(final org.intermine.objectstore.proxy.ProxyReference Y_regions);
    public org.intermine.model.InterMineObject proxGety_regions();

    public org.intermine.model.bio.Z1_region getz1_regions();
    public void setz1_regions(final org.intermine.model.bio.Z1_region Z1_regions);
    public void proxyz1_regions(final org.intermine.objectstore.proxy.ProxyReference Z1_regions);
    public org.intermine.model.InterMineObject proxGetz1_regions();

    public org.intermine.model.bio.W_region getw_regions();
    public void setw_regions(final org.intermine.model.bio.W_region W_regions);
    public void proxyw_regions(final org.intermine.objectstore.proxy.ProxyReference W_regions);
    public org.intermine.model.InterMineObject proxGetw_regions();

}
