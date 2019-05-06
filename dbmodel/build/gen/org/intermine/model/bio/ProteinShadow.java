package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ProteinShadow implements Protein, ShadowClass
{
    public static final Class<Protein> shadowOf = Protein.class;
    // Attr: org.intermine.model.bio.Protein.primaryAccession
    protected java.lang.String primaryAccession;
    public java.lang.String getPrimaryAccession() { return primaryAccession; }
    public void setPrimaryAccession(final java.lang.String primaryAccession) { this.primaryAccession = primaryAccession; }

    // Attr: org.intermine.model.bio.Protein.sulphur
    protected java.lang.String sulphur;
    public java.lang.String getSulphur() { return sulphur; }
    public void setSulphur(final java.lang.String sulphur) { this.sulphur = sulphur; }

    // Attr: org.intermine.model.bio.Protein.asn
    protected java.lang.Integer asn;
    public java.lang.Integer getAsn() { return asn; }
    public void setAsn(final java.lang.Integer asn) { this.asn = asn; }

    // Attr: org.intermine.model.bio.Protein.pI
    protected java.lang.Float pI;
    public java.lang.Float getPI() { return pI; }
    public void setPI(final java.lang.Float pI) { this.pI = pI; }

    // Attr: org.intermine.model.bio.Protein.aromaticityScore
    protected java.lang.Float aromaticityScore;
    public java.lang.Float getAromaticityScore() { return aromaticityScore; }
    public void setAromaticityScore(final java.lang.Float aromaticityScore) { this.aromaticityScore = aromaticityScore; }

    // Attr: org.intermine.model.bio.Protein.his
    protected java.lang.Integer his;
    public java.lang.Integer getHis() { return his; }
    public void setHis(final java.lang.Integer his) { this.his = his; }

    // Attr: org.intermine.model.bio.Protein.cys
    protected java.lang.Integer cys;
    public java.lang.Integer getCys() { return cys; }
    public void setCys(final java.lang.Integer cys) { this.cys = cys; }

    // Attr: org.intermine.model.bio.Protein.MAD
    protected java.lang.Float MAD;
    public java.lang.Float getmAD() { return MAD; }
    public void setmAD(final java.lang.Float MAD) { this.MAD = MAD; }

    // Attr: org.intermine.model.bio.Protein.oxygen
    protected java.lang.String oxygen;
    public java.lang.String getOxygen() { return oxygen; }
    public void setOxygen(final java.lang.String oxygen) { this.oxygen = oxygen; }

    // Attr: org.intermine.model.bio.Protein.val
    protected java.lang.Integer val;
    public java.lang.Integer getVal() { return val; }
    public void setVal(final java.lang.Integer val) { this.val = val; }

    // Attr: org.intermine.model.bio.Protein.molecularWeight
    protected java.lang.Double molecularWeight;
    public java.lang.Double getMolecularWeight() { return molecularWeight; }
    public void setMolecularWeight(final java.lang.Double molecularWeight) { this.molecularWeight = molecularWeight; }

    // Attr: org.intermine.model.bio.Protein.noCysHalf
    protected java.lang.Float noCysHalf;
    public java.lang.Float getNoCysHalf() { return noCysHalf; }
    public void setNoCysHalf(final java.lang.Float noCysHalf) { this.noCysHalf = noCysHalf; }

    // Attr: org.intermine.model.bio.Protein.ile
    protected java.lang.Integer ile;
    public java.lang.Integer getIle() { return ile; }
    public void setIle(final java.lang.Integer ile) { this.ile = ile; }

    // Attr: org.intermine.model.bio.Protein.tyr
    protected java.lang.Integer tyr;
    public java.lang.Integer getTyr() { return tyr; }
    public void setTyr(final java.lang.Integer tyr) { this.tyr = tyr; }

    // Attr: org.intermine.model.bio.Protein.hydrogen
    protected java.lang.String hydrogen;
    public java.lang.String getHydrogen() { return hydrogen; }
    public void setHydrogen(final java.lang.String hydrogen) { this.hydrogen = hydrogen; }

    // Attr: org.intermine.model.bio.Protein.fopScore
    protected java.lang.Float fopScore;
    public java.lang.Float getFopScore() { return fopScore; }
    public void setFopScore(final java.lang.Float fopScore) { this.fopScore = fopScore; }

    // Attr: org.intermine.model.bio.Protein.gly
    protected java.lang.Integer gly;
    public java.lang.Integer getGly() { return gly; }
    public void setGly(final java.lang.Integer gly) { this.gly = gly; }

    // Attr: org.intermine.model.bio.Protein.aliphaticIndex
    protected java.lang.Float aliphaticIndex;
    public java.lang.Float getAliphaticIndex() { return aliphaticIndex; }
    public void setAliphaticIndex(final java.lang.Float aliphaticIndex) { this.aliphaticIndex = aliphaticIndex; }

    // Attr: org.intermine.model.bio.Protein.cai
    protected java.lang.Float cai;
    public java.lang.Float getCai() { return cai; }
    public void setCai(final java.lang.Float cai) { this.cai = cai; }

    // Attr: org.intermine.model.bio.Protein.ser
    protected java.lang.Integer ser;
    public java.lang.Integer getSer() { return ser; }
    public void setSer(final java.lang.Integer ser) { this.ser = ser; }

    // Attr: org.intermine.model.bio.Protein.lys
    protected java.lang.Integer lys;
    public java.lang.Integer getLys() { return lys; }
    public void setLys(final java.lang.Integer lys) { this.lys = lys; }

    // Attr: org.intermine.model.bio.Protein.leu
    protected java.lang.Integer leu;
    public java.lang.Integer getLeu() { return leu; }
    public void setLeu(final java.lang.Integer leu) { this.leu = leu; }

    // Attr: org.intermine.model.bio.Protein.met
    protected java.lang.Integer met;
    public java.lang.Integer getMet() { return met; }
    public void setMet(final java.lang.Integer met) { this.met = met; }

    // Attr: org.intermine.model.bio.Protein.instabilityIndex
    protected java.lang.Float instabilityIndex;
    public java.lang.Float getInstabilityIndex() { return instabilityIndex; }
    public void setInstabilityIndex(final java.lang.Float instabilityIndex) { this.instabilityIndex = instabilityIndex; }

    // Attr: org.intermine.model.bio.Protein.trp
    protected java.lang.Integer trp;
    public java.lang.Integer getTrp() { return trp; }
    public void setTrp(final java.lang.Integer trp) { this.trp = trp; }

    // Attr: org.intermine.model.bio.Protein.length
    protected java.lang.Integer length;
    public java.lang.Integer getLength() { return length; }
    public void setLength(final java.lang.Integer length) { this.length = length; }

    // Attr: org.intermine.model.bio.Protein.codonBias
    protected java.lang.Float codonBias;
    public java.lang.Float getCodonBias() { return codonBias; }
    public void setCodonBias(final java.lang.Float codonBias) { this.codonBias = codonBias; }

    // Attr: org.intermine.model.bio.Protein.allCysHalf
    protected java.lang.Float allCysHalf;
    public java.lang.Float getAllCysHalf() { return allCysHalf; }
    public void setAllCysHalf(final java.lang.Float allCysHalf) { this.allCysHalf = allCysHalf; }

    // Attr: org.intermine.model.bio.Protein.median
    protected java.lang.Float median;
    public java.lang.Float getMedian() { return median; }
    public void setMedian(final java.lang.Float median) { this.median = median; }

    // Attr: org.intermine.model.bio.Protein.carbon
    protected java.lang.String carbon;
    public java.lang.String getCarbon() { return carbon; }
    public void setCarbon(final java.lang.String carbon) { this.carbon = carbon; }

    // Attr: org.intermine.model.bio.Protein.glu
    protected java.lang.Integer glu;
    public java.lang.Integer getGlu() { return glu; }
    public void setGlu(final java.lang.Integer glu) { this.glu = glu; }

    // Attr: org.intermine.model.bio.Protein.ala
    protected java.lang.Integer ala;
    public java.lang.Integer getAla() { return ala; }
    public void setAla(final java.lang.Integer ala) { this.ala = ala; }

    // Attr: org.intermine.model.bio.Protein.arg
    protected java.lang.Integer arg;
    public java.lang.Integer getArg() { return arg; }
    public void setArg(final java.lang.Integer arg) { this.arg = arg; }

    // Attr: org.intermine.model.bio.Protein.units
    protected java.lang.String units;
    public java.lang.String getUnits() { return units; }
    public void setUnits(final java.lang.String units) { this.units = units; }

    // Attr: org.intermine.model.bio.Protein.md5checksum
    protected java.lang.String md5checksum;
    public java.lang.String getMd5checksum() { return md5checksum; }
    public void setMd5checksum(final java.lang.String md5checksum) { this.md5checksum = md5checksum; }

    // Attr: org.intermine.model.bio.Protein.ctermseq
    protected java.lang.String ctermseq;
    public java.lang.String getCtermseq() { return ctermseq; }
    public void setCtermseq(final java.lang.String ctermseq) { this.ctermseq = ctermseq; }

    // Attr: org.intermine.model.bio.Protein.phe
    protected java.lang.Integer phe;
    public java.lang.Integer getPhe() { return phe; }
    public void setPhe(final java.lang.Integer phe) { this.phe = phe; }

    // Attr: org.intermine.model.bio.Protein.pro
    protected java.lang.Integer pro;
    public java.lang.Integer getPro() { return pro; }
    public void setPro(final java.lang.Integer pro) { this.pro = pro; }

    // Attr: org.intermine.model.bio.Protein.gravyScore
    protected java.lang.Float gravyScore;
    public java.lang.Float getGravyScore() { return gravyScore; }
    public void setGravyScore(final java.lang.Float gravyScore) { this.gravyScore = gravyScore; }

    // Attr: org.intermine.model.bio.Protein.asp
    protected java.lang.Integer asp;
    public java.lang.Integer getAsp() { return asp; }
    public void setAsp(final java.lang.Integer asp) { this.asp = asp; }

    // Attr: org.intermine.model.bio.Protein.gln
    protected java.lang.Integer gln;
    public java.lang.Integer getGln() { return gln; }
    public void setGln(final java.lang.Integer gln) { this.gln = gln; }

    // Attr: org.intermine.model.bio.Protein.thr
    protected java.lang.Integer thr;
    public java.lang.Integer getThr() { return thr; }
    public void setThr(final java.lang.Integer thr) { this.thr = thr; }

    // Attr: org.intermine.model.bio.Protein.nitrogen
    protected java.lang.String nitrogen;
    public java.lang.String getNitrogen() { return nitrogen; }
    public void setNitrogen(final java.lang.String nitrogen) { this.nitrogen = nitrogen; }

    // Attr: org.intermine.model.bio.Protein.ntermseq
    protected java.lang.String ntermseq;
    public java.lang.String getNtermseq() { return ntermseq; }
    public void setNtermseq(final java.lang.String ntermseq) { this.ntermseq = ntermseq; }

    // Ref: org.intermine.model.bio.Protein.sequence
    protected org.intermine.model.InterMineObject sequence;
    public org.intermine.model.bio.Sequence getSequence() { if (sequence instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Sequence) ((org.intermine.objectstore.proxy.ProxyReference) sequence).getObject()); }; return (org.intermine.model.bio.Sequence) sequence; }
    public void setSequence(final org.intermine.model.bio.Sequence sequence) { this.sequence = sequence; }
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence) { this.sequence = sequence; }
    public org.intermine.model.InterMineObject proxGetSequence() { return sequence; }

    // Col: org.intermine.model.bio.Protein.CDSs
    protected java.util.Set<org.intermine.model.bio.CDS> CDSs = new java.util.HashSet<org.intermine.model.bio.CDS>();
    public java.util.Set<org.intermine.model.bio.CDS> getcDSs() { return CDSs; }
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs) { this.CDSs = CDSs; }
    public void addcDSs(final org.intermine.model.bio.CDS arg) { CDSs.add(arg); }

    // Col: org.intermine.model.bio.Protein.proteinProperties
    protected java.util.Set<org.intermine.model.bio.ProteinProperty> proteinProperties = new java.util.HashSet<org.intermine.model.bio.ProteinProperty>();
    public java.util.Set<org.intermine.model.bio.ProteinProperty> getProteinProperties() { return proteinProperties; }
    public void setProteinProperties(final java.util.Set<org.intermine.model.bio.ProteinProperty> proteinProperties) { this.proteinProperties = proteinProperties; }
    public void addProteinProperties(final org.intermine.model.bio.ProteinProperty arg) { proteinProperties.add(arg); }

    // Col: org.intermine.model.bio.Protein.proteinModificationSites
    protected java.util.Set<org.intermine.model.bio.ProteinModificationSite> proteinModificationSites = new java.util.HashSet<org.intermine.model.bio.ProteinModificationSite>();
    public java.util.Set<org.intermine.model.bio.ProteinModificationSite> getProteinModificationSites() { return proteinModificationSites; }
    public void setProteinModificationSites(final java.util.Set<org.intermine.model.bio.ProteinModificationSite> proteinModificationSites) { this.proteinModificationSites = proteinModificationSites; }
    public void addProteinModificationSites(final org.intermine.model.bio.ProteinModificationSite arg) { proteinModificationSites.add(arg); }

    // Col: org.intermine.model.bio.Protein.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet<org.intermine.model.bio.Gene>();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.Protein.proteinAbundance
    protected java.util.Set<org.intermine.model.bio.ProteinAbundance> proteinAbundance = new java.util.HashSet<org.intermine.model.bio.ProteinAbundance>();
    public java.util.Set<org.intermine.model.bio.ProteinAbundance> getProteinAbundance() { return proteinAbundance; }
    public void setProteinAbundance(final java.util.Set<org.intermine.model.bio.ProteinAbundance> proteinAbundance) { this.proteinAbundance = proteinAbundance; }
    public void addProteinAbundance(final org.intermine.model.bio.ProteinAbundance arg) { proteinAbundance.add(arg); }

    // Col: org.intermine.model.bio.Protein.proteinDomains
    protected java.util.Set<org.intermine.model.bio.ProteinDomain> proteinDomains = new java.util.HashSet<org.intermine.model.bio.ProteinDomain>();
    public java.util.Set<org.intermine.model.bio.ProteinDomain> getProteinDomains() { return proteinDomains; }
    public void setProteinDomains(final java.util.Set<org.intermine.model.bio.ProteinDomain> proteinDomains) { this.proteinDomains = proteinDomains; }
    public void addProteinDomains(final org.intermine.model.bio.ProteinDomain arg) { proteinDomains.add(arg); }

    // Col: org.intermine.model.bio.Protein.proteinHalfLife
    protected java.util.Set<org.intermine.model.bio.ProteinHalfLife> proteinHalfLife = new java.util.HashSet<org.intermine.model.bio.ProteinHalfLife>();
    public java.util.Set<org.intermine.model.bio.ProteinHalfLife> getProteinHalfLife() { return proteinHalfLife; }
    public void setProteinHalfLife(final java.util.Set<org.intermine.model.bio.ProteinHalfLife> proteinHalfLife) { this.proteinHalfLife = proteinHalfLife; }
    public void addProteinHalfLife(final org.intermine.model.bio.ProteinHalfLife arg) { proteinHalfLife.add(arg); }

    // Col: org.intermine.model.bio.Protein.transcripts
    protected java.util.Set<org.intermine.model.bio.Transcript> transcripts = new java.util.HashSet<org.intermine.model.bio.Transcript>();
    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts() { return transcripts; }
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts) { this.transcripts = transcripts; }
    public void addTranscripts(final org.intermine.model.bio.Transcript arg) { transcripts.add(arg); }

    // Attr: org.intermine.model.bio.BioEntity.sgdAlias
    protected java.lang.String sgdAlias;
    public java.lang.String getSgdAlias() { return sgdAlias; }
    public void setSgdAlias(final java.lang.String sgdAlias) { this.sgdAlias = sgdAlias; }

    // Attr: org.intermine.model.bio.BioEntity.symbol
    protected java.lang.String symbol;
    public java.lang.String getSymbol() { return symbol; }
    public void setSymbol(final java.lang.String symbol) { this.symbol = symbol; }

    // Attr: org.intermine.model.bio.BioEntity.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.BioEntity.secondaryIdentifier
    protected java.lang.String secondaryIdentifier;
    public java.lang.String getSecondaryIdentifier() { return secondaryIdentifier; }
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier) { this.secondaryIdentifier = secondaryIdentifier; }

    // Ref: org.intermine.model.bio.BioEntity.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.BioEntity.interactions
    protected java.util.Set<org.intermine.model.bio.Interaction> interactions = new java.util.HashSet<org.intermine.model.bio.Interaction>();
    public java.util.Set<org.intermine.model.bio.Interaction> getInteractions() { return interactions; }
    public void setInteractions(final java.util.Set<org.intermine.model.bio.Interaction> interactions) { this.interactions = interactions; }
    public void addInteractions(final org.intermine.model.bio.Interaction arg) { interactions.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.locations
    protected java.util.Set<org.intermine.model.bio.Location> locations = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocations() { return locations; }
    public void setLocations(final java.util.Set<org.intermine.model.bio.Location> locations) { this.locations = locations; }
    public void addLocations(final org.intermine.model.bio.Location arg) { locations.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.synonyms
    protected java.util.Set<org.intermine.model.bio.Synonym> synonyms = new java.util.HashSet<org.intermine.model.bio.Synonym>();
    public java.util.Set<org.intermine.model.bio.Synonym> getSynonyms() { return synonyms; }
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.Synonym> synonyms) { this.synonyms = synonyms; }
    public void addSynonyms(final org.intermine.model.bio.Synonym arg) { synonyms.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.crossReferences
    protected java.util.Set<org.intermine.model.bio.CrossReference> crossReferences = new java.util.HashSet<org.intermine.model.bio.CrossReference>();
    public java.util.Set<org.intermine.model.bio.CrossReference> getCrossReferences() { return crossReferences; }
    public void setCrossReferences(final java.util.Set<org.intermine.model.bio.CrossReference> crossReferences) { this.crossReferences = crossReferences; }
    public void addCrossReferences(final org.intermine.model.bio.CrossReference arg) { crossReferences.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.locatedFeatures
    protected java.util.Set<org.intermine.model.bio.Location> locatedFeatures = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocatedFeatures() { return locatedFeatures; }
    public void setLocatedFeatures(final java.util.Set<org.intermine.model.bio.Location> locatedFeatures) { this.locatedFeatures = locatedFeatures; }
    public void addLocatedFeatures(final org.intermine.model.bio.Location arg) { locatedFeatures.add(arg); }

    // Attr: org.intermine.model.bio.Annotatable.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Col: org.intermine.model.bio.Annotatable.ontologyAnnotations
    protected java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations = new java.util.HashSet<org.intermine.model.bio.OntologyAnnotation>();
    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations() { return ontologyAnnotations; }
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations) { this.ontologyAnnotations = ontologyAnnotations; }
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg) { ontologyAnnotations.add(arg); }

    // Col: org.intermine.model.bio.Annotatable.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Protein && id != null) ? id.equals(((Protein)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Protein [MAD=" + MAD + ", ala=" + ala + ", aliphaticIndex=" + aliphaticIndex + ", allCysHalf=" + allCysHalf + ", arg=" + arg + ", aromaticityScore=" + aromaticityScore + ", asn=" + asn + ", asp=" + asp + ", cai=" + cai + ", carbon=" + (carbon == null ? "null" : "\"" + carbon + "\"") + ", codonBias=" + codonBias + ", ctermseq=" + (ctermseq == null ? "null" : "\"" + ctermseq + "\"") + ", cys=" + cys + ", fopScore=" + fopScore + ", gln=" + gln + ", glu=" + glu + ", gly=" + gly + ", gravyScore=" + gravyScore + ", his=" + his + ", hydrogen=" + (hydrogen == null ? "null" : "\"" + hydrogen + "\"") + ", id=" + id + ", ile=" + ile + ", instabilityIndex=" + instabilityIndex + ", length=" + length + ", leu=" + leu + ", lys=" + lys + ", md5checksum=" + (md5checksum == null ? "null" : "\"" + md5checksum + "\"") + ", median=" + median + ", met=" + met + ", molecularWeight=" + molecularWeight + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", nitrogen=" + (nitrogen == null ? "null" : "\"" + nitrogen + "\"") + ", noCysHalf=" + noCysHalf + ", ntermseq=" + (ntermseq == null ? "null" : "\"" + ntermseq + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", oxygen=" + (oxygen == null ? "null" : "\"" + oxygen + "\"") + ", pI=" + pI + ", phe=" + phe + ", primaryAccession=" + (primaryAccession == null ? "null" : "\"" + primaryAccession + "\"") + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + ", pro=" + pro + ", secondaryIdentifier=" + (secondaryIdentifier == null ? "null" : "\"" + secondaryIdentifier + "\"") + ", sequence=" + (sequence == null ? "null" : (sequence.getId() == null ? "no id" : sequence.getId().toString())) + ", ser=" + ser + ", sgdAlias=" + (sgdAlias == null ? "null" : "\"" + sgdAlias + "\"") + ", sulphur=" + (sulphur == null ? "null" : "\"" + sulphur + "\"") + ", symbol=" + (symbol == null ? "null" : "\"" + symbol + "\"") + ", thr=" + thr + ", trp=" + trp + ", tyr=" + tyr + ", units=" + (units == null ? "null" : "\"" + units + "\"") + ", val=" + val + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("primaryAccession".equals(fieldName)) {
            return primaryAccession;
        }
        if ("sulphur".equals(fieldName)) {
            return sulphur;
        }
        if ("asn".equals(fieldName)) {
            return asn;
        }
        if ("pI".equals(fieldName)) {
            return pI;
        }
        if ("aromaticityScore".equals(fieldName)) {
            return aromaticityScore;
        }
        if ("his".equals(fieldName)) {
            return his;
        }
        if ("cys".equals(fieldName)) {
            return cys;
        }
        if ("MAD".equals(fieldName)) {
            return MAD;
        }
        if ("oxygen".equals(fieldName)) {
            return oxygen;
        }
        if ("val".equals(fieldName)) {
            return val;
        }
        if ("molecularWeight".equals(fieldName)) {
            return molecularWeight;
        }
        if ("noCysHalf".equals(fieldName)) {
            return noCysHalf;
        }
        if ("ile".equals(fieldName)) {
            return ile;
        }
        if ("tyr".equals(fieldName)) {
            return tyr;
        }
        if ("hydrogen".equals(fieldName)) {
            return hydrogen;
        }
        if ("fopScore".equals(fieldName)) {
            return fopScore;
        }
        if ("gly".equals(fieldName)) {
            return gly;
        }
        if ("aliphaticIndex".equals(fieldName)) {
            return aliphaticIndex;
        }
        if ("cai".equals(fieldName)) {
            return cai;
        }
        if ("ser".equals(fieldName)) {
            return ser;
        }
        if ("lys".equals(fieldName)) {
            return lys;
        }
        if ("leu".equals(fieldName)) {
            return leu;
        }
        if ("met".equals(fieldName)) {
            return met;
        }
        if ("instabilityIndex".equals(fieldName)) {
            return instabilityIndex;
        }
        if ("trp".equals(fieldName)) {
            return trp;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("codonBias".equals(fieldName)) {
            return codonBias;
        }
        if ("allCysHalf".equals(fieldName)) {
            return allCysHalf;
        }
        if ("median".equals(fieldName)) {
            return median;
        }
        if ("carbon".equals(fieldName)) {
            return carbon;
        }
        if ("glu".equals(fieldName)) {
            return glu;
        }
        if ("ala".equals(fieldName)) {
            return ala;
        }
        if ("arg".equals(fieldName)) {
            return arg;
        }
        if ("units".equals(fieldName)) {
            return units;
        }
        if ("md5checksum".equals(fieldName)) {
            return md5checksum;
        }
        if ("ctermseq".equals(fieldName)) {
            return ctermseq;
        }
        if ("phe".equals(fieldName)) {
            return phe;
        }
        if ("pro".equals(fieldName)) {
            return pro;
        }
        if ("gravyScore".equals(fieldName)) {
            return gravyScore;
        }
        if ("asp".equals(fieldName)) {
            return asp;
        }
        if ("gln".equals(fieldName)) {
            return gln;
        }
        if ("thr".equals(fieldName)) {
            return thr;
        }
        if ("nitrogen".equals(fieldName)) {
            return nitrogen;
        }
        if ("ntermseq".equals(fieldName)) {
            return ntermseq;
        }
        if ("sequence".equals(fieldName)) {
            if (sequence instanceof ProxyReference) {
                return ((ProxyReference) sequence).getObject();
            } else {
                return sequence;
            }
        }
        if ("CDSs".equals(fieldName)) {
            return CDSs;
        }
        if ("proteinProperties".equals(fieldName)) {
            return proteinProperties;
        }
        if ("proteinModificationSites".equals(fieldName)) {
            return proteinModificationSites;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("proteinAbundance".equals(fieldName)) {
            return proteinAbundance;
        }
        if ("proteinDomains".equals(fieldName)) {
            return proteinDomains;
        }
        if ("proteinHalfLife".equals(fieldName)) {
            return proteinHalfLife;
        }
        if ("transcripts".equals(fieldName)) {
            return transcripts;
        }
        if ("sgdAlias".equals(fieldName)) {
            return sgdAlias;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("interactions".equals(fieldName)) {
            return interactions;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("primaryAccession".equals(fieldName)) {
            return primaryAccession;
        }
        if ("sulphur".equals(fieldName)) {
            return sulphur;
        }
        if ("asn".equals(fieldName)) {
            return asn;
        }
        if ("pI".equals(fieldName)) {
            return pI;
        }
        if ("aromaticityScore".equals(fieldName)) {
            return aromaticityScore;
        }
        if ("his".equals(fieldName)) {
            return his;
        }
        if ("cys".equals(fieldName)) {
            return cys;
        }
        if ("MAD".equals(fieldName)) {
            return MAD;
        }
        if ("oxygen".equals(fieldName)) {
            return oxygen;
        }
        if ("val".equals(fieldName)) {
            return val;
        }
        if ("molecularWeight".equals(fieldName)) {
            return molecularWeight;
        }
        if ("noCysHalf".equals(fieldName)) {
            return noCysHalf;
        }
        if ("ile".equals(fieldName)) {
            return ile;
        }
        if ("tyr".equals(fieldName)) {
            return tyr;
        }
        if ("hydrogen".equals(fieldName)) {
            return hydrogen;
        }
        if ("fopScore".equals(fieldName)) {
            return fopScore;
        }
        if ("gly".equals(fieldName)) {
            return gly;
        }
        if ("aliphaticIndex".equals(fieldName)) {
            return aliphaticIndex;
        }
        if ("cai".equals(fieldName)) {
            return cai;
        }
        if ("ser".equals(fieldName)) {
            return ser;
        }
        if ("lys".equals(fieldName)) {
            return lys;
        }
        if ("leu".equals(fieldName)) {
            return leu;
        }
        if ("met".equals(fieldName)) {
            return met;
        }
        if ("instabilityIndex".equals(fieldName)) {
            return instabilityIndex;
        }
        if ("trp".equals(fieldName)) {
            return trp;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("codonBias".equals(fieldName)) {
            return codonBias;
        }
        if ("allCysHalf".equals(fieldName)) {
            return allCysHalf;
        }
        if ("median".equals(fieldName)) {
            return median;
        }
        if ("carbon".equals(fieldName)) {
            return carbon;
        }
        if ("glu".equals(fieldName)) {
            return glu;
        }
        if ("ala".equals(fieldName)) {
            return ala;
        }
        if ("arg".equals(fieldName)) {
            return arg;
        }
        if ("units".equals(fieldName)) {
            return units;
        }
        if ("md5checksum".equals(fieldName)) {
            return md5checksum;
        }
        if ("ctermseq".equals(fieldName)) {
            return ctermseq;
        }
        if ("phe".equals(fieldName)) {
            return phe;
        }
        if ("pro".equals(fieldName)) {
            return pro;
        }
        if ("gravyScore".equals(fieldName)) {
            return gravyScore;
        }
        if ("asp".equals(fieldName)) {
            return asp;
        }
        if ("gln".equals(fieldName)) {
            return gln;
        }
        if ("thr".equals(fieldName)) {
            return thr;
        }
        if ("nitrogen".equals(fieldName)) {
            return nitrogen;
        }
        if ("ntermseq".equals(fieldName)) {
            return ntermseq;
        }
        if ("sequence".equals(fieldName)) {
            return sequence;
        }
        if ("CDSs".equals(fieldName)) {
            return CDSs;
        }
        if ("proteinProperties".equals(fieldName)) {
            return proteinProperties;
        }
        if ("proteinModificationSites".equals(fieldName)) {
            return proteinModificationSites;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("proteinAbundance".equals(fieldName)) {
            return proteinAbundance;
        }
        if ("proteinDomains".equals(fieldName)) {
            return proteinDomains;
        }
        if ("proteinHalfLife".equals(fieldName)) {
            return proteinHalfLife;
        }
        if ("transcripts".equals(fieldName)) {
            return transcripts;
        }
        if ("sgdAlias".equals(fieldName)) {
            return sgdAlias;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("interactions".equals(fieldName)) {
            return interactions;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("primaryAccession".equals(fieldName)) {
            primaryAccession = (java.lang.String) value;
        } else if ("sulphur".equals(fieldName)) {
            sulphur = (java.lang.String) value;
        } else if ("asn".equals(fieldName)) {
            asn = (java.lang.Integer) value;
        } else if ("pI".equals(fieldName)) {
            pI = (java.lang.Float) value;
        } else if ("aromaticityScore".equals(fieldName)) {
            aromaticityScore = (java.lang.Float) value;
        } else if ("his".equals(fieldName)) {
            his = (java.lang.Integer) value;
        } else if ("cys".equals(fieldName)) {
            cys = (java.lang.Integer) value;
        } else if ("MAD".equals(fieldName)) {
            MAD = (java.lang.Float) value;
        } else if ("oxygen".equals(fieldName)) {
            oxygen = (java.lang.String) value;
        } else if ("val".equals(fieldName)) {
            val = (java.lang.Integer) value;
        } else if ("molecularWeight".equals(fieldName)) {
            molecularWeight = (java.lang.Double) value;
        } else if ("noCysHalf".equals(fieldName)) {
            noCysHalf = (java.lang.Float) value;
        } else if ("ile".equals(fieldName)) {
            ile = (java.lang.Integer) value;
        } else if ("tyr".equals(fieldName)) {
            tyr = (java.lang.Integer) value;
        } else if ("hydrogen".equals(fieldName)) {
            hydrogen = (java.lang.String) value;
        } else if ("fopScore".equals(fieldName)) {
            fopScore = (java.lang.Float) value;
        } else if ("gly".equals(fieldName)) {
            gly = (java.lang.Integer) value;
        } else if ("aliphaticIndex".equals(fieldName)) {
            aliphaticIndex = (java.lang.Float) value;
        } else if ("cai".equals(fieldName)) {
            cai = (java.lang.Float) value;
        } else if ("ser".equals(fieldName)) {
            ser = (java.lang.Integer) value;
        } else if ("lys".equals(fieldName)) {
            lys = (java.lang.Integer) value;
        } else if ("leu".equals(fieldName)) {
            leu = (java.lang.Integer) value;
        } else if ("met".equals(fieldName)) {
            met = (java.lang.Integer) value;
        } else if ("instabilityIndex".equals(fieldName)) {
            instabilityIndex = (java.lang.Float) value;
        } else if ("trp".equals(fieldName)) {
            trp = (java.lang.Integer) value;
        } else if ("length".equals(fieldName)) {
            length = (java.lang.Integer) value;
        } else if ("codonBias".equals(fieldName)) {
            codonBias = (java.lang.Float) value;
        } else if ("allCysHalf".equals(fieldName)) {
            allCysHalf = (java.lang.Float) value;
        } else if ("median".equals(fieldName)) {
            median = (java.lang.Float) value;
        } else if ("carbon".equals(fieldName)) {
            carbon = (java.lang.String) value;
        } else if ("glu".equals(fieldName)) {
            glu = (java.lang.Integer) value;
        } else if ("ala".equals(fieldName)) {
            ala = (java.lang.Integer) value;
        } else if ("arg".equals(fieldName)) {
            arg = (java.lang.Integer) value;
        } else if ("units".equals(fieldName)) {
            units = (java.lang.String) value;
        } else if ("md5checksum".equals(fieldName)) {
            md5checksum = (java.lang.String) value;
        } else if ("ctermseq".equals(fieldName)) {
            ctermseq = (java.lang.String) value;
        } else if ("phe".equals(fieldName)) {
            phe = (java.lang.Integer) value;
        } else if ("pro".equals(fieldName)) {
            pro = (java.lang.Integer) value;
        } else if ("gravyScore".equals(fieldName)) {
            gravyScore = (java.lang.Float) value;
        } else if ("asp".equals(fieldName)) {
            asp = (java.lang.Integer) value;
        } else if ("gln".equals(fieldName)) {
            gln = (java.lang.Integer) value;
        } else if ("thr".equals(fieldName)) {
            thr = (java.lang.Integer) value;
        } else if ("nitrogen".equals(fieldName)) {
            nitrogen = (java.lang.String) value;
        } else if ("ntermseq".equals(fieldName)) {
            ntermseq = (java.lang.String) value;
        } else if ("sequence".equals(fieldName)) {
            sequence = (org.intermine.model.InterMineObject) value;
        } else if ("CDSs".equals(fieldName)) {
            CDSs = (java.util.Set) value;
        } else if ("proteinProperties".equals(fieldName)) {
            proteinProperties = (java.util.Set) value;
        } else if ("proteinModificationSites".equals(fieldName)) {
            proteinModificationSites = (java.util.Set) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("proteinAbundance".equals(fieldName)) {
            proteinAbundance = (java.util.Set) value;
        } else if ("proteinDomains".equals(fieldName)) {
            proteinDomains = (java.util.Set) value;
        } else if ("proteinHalfLife".equals(fieldName)) {
            proteinHalfLife = (java.util.Set) value;
        } else if ("transcripts".equals(fieldName)) {
            transcripts = (java.util.Set) value;
        } else if ("sgdAlias".equals(fieldName)) {
            sgdAlias = (java.lang.String) value;
        } else if ("symbol".equals(fieldName)) {
            symbol = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("secondaryIdentifier".equals(fieldName)) {
            secondaryIdentifier = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("interactions".equals(fieldName)) {
            interactions = (java.util.Set) value;
        } else if ("locations".equals(fieldName)) {
            locations = (java.util.Set) value;
        } else if ("synonyms".equals(fieldName)) {
            synonyms = (java.util.Set) value;
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures = (java.util.Set) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("primaryAccession".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sulphur".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("asn".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("pI".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("aromaticityScore".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("his".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("cys".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("MAD".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("oxygen".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("val".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("molecularWeight".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("noCysHalf".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("ile".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("tyr".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("hydrogen".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("fopScore".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("gly".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("aliphaticIndex".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("cai".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("ser".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("lys".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("leu".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("met".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("instabilityIndex".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("trp".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("length".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("codonBias".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("allCysHalf".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("median".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("carbon".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("glu".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("ala".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("arg".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("units".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("md5checksum".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ctermseq".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("phe".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("pro".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("gravyScore".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("asp".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("gln".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("thr".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("nitrogen".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ntermseq".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sequence".equals(fieldName)) {
            return org.intermine.model.bio.Sequence.class;
        }
        if ("CDSs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("proteinProperties".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("proteinModificationSites".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("proteinAbundance".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("proteinDomains".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("proteinHalfLife".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("transcripts".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("sgdAlias".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("symbol".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("interactions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("locations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("synonyms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Protein.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ProteinShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Protein");
        if (primaryAccession != null) {
            sb.append("$_^aprimaryAccession$_^");
            String string = primaryAccession;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (sulphur != null) {
            sb.append("$_^asulphur$_^");
            String string = sulphur;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (asn != null) {
            sb.append("$_^aasn$_^").append(asn);
        }
        if (pI != null) {
            sb.append("$_^apI$_^").append(pI);
        }
        if (aromaticityScore != null) {
            sb.append("$_^aaromaticityScore$_^").append(aromaticityScore);
        }
        if (his != null) {
            sb.append("$_^ahis$_^").append(his);
        }
        if (cys != null) {
            sb.append("$_^acys$_^").append(cys);
        }
        if (MAD != null) {
            sb.append("$_^aMAD$_^").append(MAD);
        }
        if (oxygen != null) {
            sb.append("$_^aoxygen$_^");
            String string = oxygen;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (val != null) {
            sb.append("$_^aval$_^").append(val);
        }
        if (molecularWeight != null) {
            sb.append("$_^amolecularWeight$_^").append(molecularWeight);
        }
        if (noCysHalf != null) {
            sb.append("$_^anoCysHalf$_^").append(noCysHalf);
        }
        if (ile != null) {
            sb.append("$_^aile$_^").append(ile);
        }
        if (tyr != null) {
            sb.append("$_^atyr$_^").append(tyr);
        }
        if (hydrogen != null) {
            sb.append("$_^ahydrogen$_^");
            String string = hydrogen;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (fopScore != null) {
            sb.append("$_^afopScore$_^").append(fopScore);
        }
        if (gly != null) {
            sb.append("$_^agly$_^").append(gly);
        }
        if (aliphaticIndex != null) {
            sb.append("$_^aaliphaticIndex$_^").append(aliphaticIndex);
        }
        if (cai != null) {
            sb.append("$_^acai$_^").append(cai);
        }
        if (ser != null) {
            sb.append("$_^aser$_^").append(ser);
        }
        if (lys != null) {
            sb.append("$_^alys$_^").append(lys);
        }
        if (leu != null) {
            sb.append("$_^aleu$_^").append(leu);
        }
        if (met != null) {
            sb.append("$_^amet$_^").append(met);
        }
        if (instabilityIndex != null) {
            sb.append("$_^ainstabilityIndex$_^").append(instabilityIndex);
        }
        if (trp != null) {
            sb.append("$_^atrp$_^").append(trp);
        }
        if (length != null) {
            sb.append("$_^alength$_^").append(length);
        }
        if (codonBias != null) {
            sb.append("$_^acodonBias$_^").append(codonBias);
        }
        if (allCysHalf != null) {
            sb.append("$_^aallCysHalf$_^").append(allCysHalf);
        }
        if (median != null) {
            sb.append("$_^amedian$_^").append(median);
        }
        if (carbon != null) {
            sb.append("$_^acarbon$_^");
            String string = carbon;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (glu != null) {
            sb.append("$_^aglu$_^").append(glu);
        }
        if (ala != null) {
            sb.append("$_^aala$_^").append(ala);
        }
        if (arg != null) {
            sb.append("$_^aarg$_^").append(arg);
        }
        if (units != null) {
            sb.append("$_^aunits$_^");
            String string = units;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (md5checksum != null) {
            sb.append("$_^amd5checksum$_^");
            String string = md5checksum;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (ctermseq != null) {
            sb.append("$_^actermseq$_^");
            String string = ctermseq;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (phe != null) {
            sb.append("$_^aphe$_^").append(phe);
        }
        if (pro != null) {
            sb.append("$_^apro$_^").append(pro);
        }
        if (gravyScore != null) {
            sb.append("$_^agravyScore$_^").append(gravyScore);
        }
        if (asp != null) {
            sb.append("$_^aasp$_^").append(asp);
        }
        if (gln != null) {
            sb.append("$_^agln$_^").append(gln);
        }
        if (thr != null) {
            sb.append("$_^athr$_^").append(thr);
        }
        if (nitrogen != null) {
            sb.append("$_^anitrogen$_^");
            String string = nitrogen;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (ntermseq != null) {
            sb.append("$_^antermseq$_^");
            String string = ntermseq;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (sequence != null) {
            sb.append("$_^rsequence$_^").append(sequence.getId());
        }
        if (sgdAlias != null) {
            sb.append("$_^asgdAlias$_^");
            String string = sgdAlias;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (symbol != null) {
            sb.append("$_^asymbol$_^");
            String string = symbol;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (secondaryIdentifier != null) {
            sb.append("$_^asecondaryIdentifier$_^");
            String string = secondaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
        }
        if (primaryIdentifier != null) {
            sb.append("$_^aprimaryIdentifier$_^");
            String string = primaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.ProteinShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Protein)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aprimaryAccession".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                primaryAccession = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asulphur".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sulphur = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aasn".equals(notXml[i])) {
                i++;
                asn = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "apI".equals(notXml[i])) {
                i++;
                pI = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aaromaticityScore".equals(notXml[i])) {
                i++;
                aromaticityScore = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ahis".equals(notXml[i])) {
                i++;
                his = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "acys".equals(notXml[i])) {
                i++;
                cys = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aMAD".equals(notXml[i])) {
                i++;
                MAD = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aoxygen".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                oxygen = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aval".equals(notXml[i])) {
                i++;
                val = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "amolecularWeight".equals(notXml[i])) {
                i++;
                molecularWeight = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "anoCysHalf".equals(notXml[i])) {
                i++;
                noCysHalf = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aile".equals(notXml[i])) {
                i++;
                ile = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "atyr".equals(notXml[i])) {
                i++;
                tyr = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ahydrogen".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                hydrogen = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afopScore".equals(notXml[i])) {
                i++;
                fopScore = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "agly".equals(notXml[i])) {
                i++;
                gly = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aaliphaticIndex".equals(notXml[i])) {
                i++;
                aliphaticIndex = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "acai".equals(notXml[i])) {
                i++;
                cai = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aser".equals(notXml[i])) {
                i++;
                ser = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "alys".equals(notXml[i])) {
                i++;
                lys = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aleu".equals(notXml[i])) {
                i++;
                leu = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "amet".equals(notXml[i])) {
                i++;
                met = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ainstabilityIndex".equals(notXml[i])) {
                i++;
                instabilityIndex = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "atrp".equals(notXml[i])) {
                i++;
                trp = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "alength".equals(notXml[i])) {
                i++;
                length = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "acodonBias".equals(notXml[i])) {
                i++;
                codonBias = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aallCysHalf".equals(notXml[i])) {
                i++;
                allCysHalf = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "amedian".equals(notXml[i])) {
                i++;
                median = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "acarbon".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                carbon = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aglu".equals(notXml[i])) {
                i++;
                glu = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aala".equals(notXml[i])) {
                i++;
                ala = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aarg".equals(notXml[i])) {
                i++;
                arg = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aunits".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                units = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amd5checksum".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                md5checksum = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "actermseq".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                ctermseq = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aphe".equals(notXml[i])) {
                i++;
                phe = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "apro".equals(notXml[i])) {
                i++;
                pro = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "agravyScore".equals(notXml[i])) {
                i++;
                gravyScore = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aasp".equals(notXml[i])) {
                i++;
                asp = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "agln".equals(notXml[i])) {
                i++;
                gln = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "athr".equals(notXml[i])) {
                i++;
                thr = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "anitrogen".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                nitrogen = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "antermseq".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                ntermseq = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rsequence".equals(notXml[i])) {
                i++;
                sequence = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Sequence.class);
                i++;
            };
            if ((i < notXml.length) && "asgdAlias".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sgdAlias = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asymbol".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                symbol = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asecondaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                secondaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
                i++;
            };
            if ((i < notXml.length) && "aprimaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                primaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        CDSs = new ProxyCollection<org.intermine.model.bio.CDS>(os, this, "CDSs", org.intermine.model.bio.CDS.class);
        proteinProperties = new ProxyCollection<org.intermine.model.bio.ProteinProperty>(os, this, "proteinProperties", org.intermine.model.bio.ProteinProperty.class);
        proteinModificationSites = new ProxyCollection<org.intermine.model.bio.ProteinModificationSite>(os, this, "proteinModificationSites", org.intermine.model.bio.ProteinModificationSite.class);
        genes = new ProxyCollection<org.intermine.model.bio.Gene>(os, this, "genes", org.intermine.model.bio.Gene.class);
        proteinAbundance = new ProxyCollection<org.intermine.model.bio.ProteinAbundance>(os, this, "proteinAbundance", org.intermine.model.bio.ProteinAbundance.class);
        proteinDomains = new ProxyCollection<org.intermine.model.bio.ProteinDomain>(os, this, "proteinDomains", org.intermine.model.bio.ProteinDomain.class);
        proteinHalfLife = new ProxyCollection<org.intermine.model.bio.ProteinHalfLife>(os, this, "proteinHalfLife", org.intermine.model.bio.ProteinHalfLife.class);
        transcripts = new ProxyCollection<org.intermine.model.bio.Transcript>(os, this, "transcripts", org.intermine.model.bio.Transcript.class);
        interactions = new ProxyCollection<org.intermine.model.bio.Interaction>(os, this, "interactions", org.intermine.model.bio.Interaction.class);
        locations = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locations", org.intermine.model.bio.Location.class);
        synonyms = new ProxyCollection<org.intermine.model.bio.Synonym>(os, this, "synonyms", org.intermine.model.bio.Synonym.class);
        crossReferences = new ProxyCollection<org.intermine.model.bio.CrossReference>(os, this, "crossReferences", org.intermine.model.bio.CrossReference.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        locatedFeatures = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locatedFeatures", org.intermine.model.bio.Location.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("CDSs".equals(fieldName)) {
            CDSs.add((org.intermine.model.bio.CDS) element);
        } else if ("proteinProperties".equals(fieldName)) {
            proteinProperties.add((org.intermine.model.bio.ProteinProperty) element);
        } else if ("proteinModificationSites".equals(fieldName)) {
            proteinModificationSites.add((org.intermine.model.bio.ProteinModificationSite) element);
        } else if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("proteinAbundance".equals(fieldName)) {
            proteinAbundance.add((org.intermine.model.bio.ProteinAbundance) element);
        } else if ("proteinDomains".equals(fieldName)) {
            proteinDomains.add((org.intermine.model.bio.ProteinDomain) element);
        } else if ("proteinHalfLife".equals(fieldName)) {
            proteinHalfLife.add((org.intermine.model.bio.ProteinHalfLife) element);
        } else if ("transcripts".equals(fieldName)) {
            transcripts.add((org.intermine.model.bio.Transcript) element);
        } else if ("interactions".equals(fieldName)) {
            interactions.add((org.intermine.model.bio.Interaction) element);
        } else if ("locations".equals(fieldName)) {
            locations.add((org.intermine.model.bio.Location) element);
        } else if ("synonyms".equals(fieldName)) {
            synonyms.add((org.intermine.model.bio.Synonym) element);
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences.add((org.intermine.model.bio.CrossReference) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures.add((org.intermine.model.bio.Location) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("CDSs".equals(fieldName)) {
            return org.intermine.model.bio.CDS.class;
        }
        if ("proteinProperties".equals(fieldName)) {
            return org.intermine.model.bio.ProteinProperty.class;
        }
        if ("proteinModificationSites".equals(fieldName)) {
            return org.intermine.model.bio.ProteinModificationSite.class;
        }
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("proteinAbundance".equals(fieldName)) {
            return org.intermine.model.bio.ProteinAbundance.class;
        }
        if ("proteinDomains".equals(fieldName)) {
            return org.intermine.model.bio.ProteinDomain.class;
        }
        if ("proteinHalfLife".equals(fieldName)) {
            return org.intermine.model.bio.ProteinHalfLife.class;
        }
        if ("transcripts".equals(fieldName)) {
            return org.intermine.model.bio.Transcript.class;
        }
        if ("interactions".equals(fieldName)) {
            return org.intermine.model.bio.Interaction.class;
        }
        if ("locations".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("synonyms".equals(fieldName)) {
            return org.intermine.model.bio.Synonym.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return org.intermine.model.bio.CrossReference.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotation.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Protein.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
