package org.intermine.model.bio;

public interface Protein extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getPrimaryAccession();
    public void setPrimaryAccession(final java.lang.String primaryAccession);

    public java.lang.String getSulphur();
    public void setSulphur(final java.lang.String sulphur);

    public java.lang.Integer getAsn();
    public void setAsn(final java.lang.Integer asn);

    public java.lang.Float getPI();
    public void setPI(final java.lang.Float pI);

    public java.lang.Float getAromaticityScore();
    public void setAromaticityScore(final java.lang.Float aromaticityScore);

    public java.lang.Integer getHis();
    public void setHis(final java.lang.Integer his);

    public java.lang.Integer getCys();
    public void setCys(final java.lang.Integer cys);

    public java.lang.Float getmAD();
    public void setmAD(final java.lang.Float MAD);

    public java.lang.String getOxygen();
    public void setOxygen(final java.lang.String oxygen);

    public java.lang.Integer getVal();
    public void setVal(final java.lang.Integer val);

    public java.lang.Double getMolecularWeight();
    public void setMolecularWeight(final java.lang.Double molecularWeight);

    public java.lang.Float getNoCysHalf();
    public void setNoCysHalf(final java.lang.Float noCysHalf);

    public java.lang.Integer getIle();
    public void setIle(final java.lang.Integer ile);

    public java.lang.Integer getTyr();
    public void setTyr(final java.lang.Integer tyr);

    public java.lang.String getHydrogen();
    public void setHydrogen(final java.lang.String hydrogen);

    public java.lang.Float getFopScore();
    public void setFopScore(final java.lang.Float fopScore);

    public java.lang.Integer getGly();
    public void setGly(final java.lang.Integer gly);

    public java.lang.Float getAliphaticIndex();
    public void setAliphaticIndex(final java.lang.Float aliphaticIndex);

    public java.lang.Float getCai();
    public void setCai(final java.lang.Float cai);

    public java.lang.Integer getSer();
    public void setSer(final java.lang.Integer ser);

    public java.lang.Integer getLys();
    public void setLys(final java.lang.Integer lys);

    public java.lang.Integer getLeu();
    public void setLeu(final java.lang.Integer leu);

    public java.lang.Integer getMet();
    public void setMet(final java.lang.Integer met);

    public java.lang.Float getInstabilityIndex();
    public void setInstabilityIndex(final java.lang.Float instabilityIndex);

    public java.lang.Integer getTrp();
    public void setTrp(final java.lang.Integer trp);

    public java.lang.Integer getLength();
    public void setLength(final java.lang.Integer length);

    public java.lang.Float getCodonBias();
    public void setCodonBias(final java.lang.Float codonBias);

    public java.lang.Float getAllCysHalf();
    public void setAllCysHalf(final java.lang.Float allCysHalf);

    public java.lang.Float getMedian();
    public void setMedian(final java.lang.Float median);

    public java.lang.String getCarbon();
    public void setCarbon(final java.lang.String carbon);

    public java.lang.Integer getGlu();
    public void setGlu(final java.lang.Integer glu);

    public java.lang.Integer getAla();
    public void setAla(final java.lang.Integer ala);

    public java.lang.Integer getArg();
    public void setArg(final java.lang.Integer arg);

    public java.lang.String getUnits();
    public void setUnits(final java.lang.String units);

    public java.lang.String getMd5checksum();
    public void setMd5checksum(final java.lang.String md5checksum);

    public java.lang.String getCtermseq();
    public void setCtermseq(final java.lang.String ctermseq);

    public java.lang.Integer getPhe();
    public void setPhe(final java.lang.Integer phe);

    public java.lang.Integer getPro();
    public void setPro(final java.lang.Integer pro);

    public java.lang.Float getGravyScore();
    public void setGravyScore(final java.lang.Float gravyScore);

    public java.lang.Integer getAsp();
    public void setAsp(final java.lang.Integer asp);

    public java.lang.Integer getGln();
    public void setGln(final java.lang.Integer gln);

    public java.lang.Integer getThr();
    public void setThr(final java.lang.Integer thr);

    public java.lang.String getNitrogen();
    public void setNitrogen(final java.lang.String nitrogen);

    public java.lang.String getNtermseq();
    public void setNtermseq(final java.lang.String ntermseq);

    public org.intermine.model.bio.Sequence getSequence();
    public void setSequence(final org.intermine.model.bio.Sequence sequence);
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence);
    public org.intermine.model.InterMineObject proxGetSequence();

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.ProteinProperty> getProteinProperties();
    public void setProteinProperties(final java.util.Set<org.intermine.model.bio.ProteinProperty> proteinProperties);
    public void addProteinProperties(final org.intermine.model.bio.ProteinProperty arg);

    public java.util.Set<org.intermine.model.bio.ProteinModificationSite> getProteinModificationSites();
    public void setProteinModificationSites(final java.util.Set<org.intermine.model.bio.ProteinModificationSite> proteinModificationSites);
    public void addProteinModificationSites(final org.intermine.model.bio.ProteinModificationSite arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.ProteinAbundance> getProteinAbundance();
    public void setProteinAbundance(final java.util.Set<org.intermine.model.bio.ProteinAbundance> proteinAbundance);
    public void addProteinAbundance(final org.intermine.model.bio.ProteinAbundance arg);

    public java.util.Set<org.intermine.model.bio.ProteinDomain> getProteinDomains();
    public void setProteinDomains(final java.util.Set<org.intermine.model.bio.ProteinDomain> proteinDomains);
    public void addProteinDomains(final org.intermine.model.bio.ProteinDomain arg);

    public java.util.Set<org.intermine.model.bio.ProteinHalfLife> getProteinHalfLife();
    public void setProteinHalfLife(final java.util.Set<org.intermine.model.bio.ProteinHalfLife> proteinHalfLife);
    public void addProteinHalfLife(final org.intermine.model.bio.ProteinHalfLife arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

}
