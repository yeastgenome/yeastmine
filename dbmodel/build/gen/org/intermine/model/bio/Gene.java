package org.intermine.model.bio;

public interface Gene extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getGeneSummary();
    public void setGeneSummary(final java.lang.String geneSummary);

    public java.lang.String getPhenotypeSummary();
    public void setPhenotypeSummary(final java.lang.String phenotypeSummary);

    public java.lang.String getFunctionSummary();
    public void setFunctionSummary(final java.lang.String functionSummary);

    public java.lang.String getCytoLocation();
    public void setCytoLocation(final java.lang.String cytoLocation);

    public org.intermine.model.bio.IntergenicRegion getUpstreamIntergenicRegion();
    public void setUpstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion upstreamIntergenicRegion);
    public void proxyUpstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference upstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetUpstreamIntergenicRegion();

    public org.intermine.model.bio.IntergenicRegion getDownstreamIntergenicRegion();
    public void setDownstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion downstreamIntergenicRegion);
    public void proxyDownstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference downstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetDownstreamIntergenicRegion();

    public org.intermine.model.bio.Plasmid getPlasmid();
    public void setPlasmid(final org.intermine.model.bio.Plasmid plasmid);
    public void proxyPlasmid(final org.intermine.objectstore.proxy.ProxyReference plasmid);
    public org.intermine.model.InterMineObject proxGetPlasmid();

    public org.intermine.model.bio.Location getPlasmidLocation();
    public void setPlasmidLocation(final org.intermine.model.bio.Location plasmidLocation);
    public void proxyPlasmidLocation(final org.intermine.objectstore.proxy.ProxyReference plasmidLocation);
    public org.intermine.model.InterMineObject proxGetPlasmidLocation();

    public org.intermine.model.bio.RegulationSummary getRegulationSummary();
    public void setRegulationSummary(final org.intermine.model.bio.RegulationSummary regulationSummary);
    public void proxyRegulationSummary(final org.intermine.objectstore.proxy.ProxyReference regulationSummary);
    public org.intermine.model.InterMineObject proxGetRegulationSummary();

    public java.util.Set<org.intermine.model.bio.Complement> getComplements();
    public void setComplements(final java.util.Set<org.intermine.model.bio.Complement> complements);
    public void addComplements(final org.intermine.model.bio.Complement arg);

    public java.util.Set<org.intermine.model.bio.GeneFlankingRegion> getFlankingRegions();
    public void setFlankingRegions(final java.util.Set<org.intermine.model.bio.GeneFlankingRegion> flankingRegions);
    public void addFlankingRegions(final org.intermine.model.bio.GeneFlankingRegion arg);

    public java.util.Set<org.intermine.model.bio.Intron> getIntrons();
    public void setIntrons(final java.util.Set<org.intermine.model.bio.Intron> introns);
    public void addIntrons(final org.intermine.model.bio.Intron arg);

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.Homologue> getHomologues();
    public void setHomologues(final java.util.Set<org.intermine.model.bio.Homologue> homologues);
    public void addHomologues(final org.intermine.model.bio.Homologue arg);

    public java.util.Set<org.intermine.model.bio.Exon> getExons();
    public void setExons(final java.util.Set<org.intermine.model.bio.Exon> exons);
    public void addExons(final org.intermine.model.bio.Exon arg);

    public java.util.Set<org.intermine.model.bio.Pathway> getPathways();
    public void setPathways(final java.util.Set<org.intermine.model.bio.Pathway> pathways);
    public void addPathways(final org.intermine.model.bio.Pathway arg);

    public java.util.Set<org.intermine.model.bio.UTR> getuTRs();
    public void setuTRs(final java.util.Set<org.intermine.model.bio.UTR> UTRs);
    public void adduTRs(final org.intermine.model.bio.UTR arg);

    public java.util.Set<org.intermine.model.bio.ExpressionScore> getExpressionScores();
    public void setExpressionScores(final java.util.Set<org.intermine.model.bio.ExpressionScore> expressionScores);
    public void addExpressionScores(final org.intermine.model.bio.ExpressionScore arg);

    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes();
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes);
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

    public java.util.Set<org.intermine.model.bio.RegulatoryRegion> getRegulatoryRegions();
    public void setRegulatoryRegions(final java.util.Set<org.intermine.model.bio.RegulatoryRegion> regulatoryRegions);
    public void addRegulatoryRegions(final org.intermine.model.bio.RegulatoryRegion arg);

    public java.util.Set<org.intermine.model.bio.PublicationAnnotation> getPublicationAnnotations();
    public void setPublicationAnnotations(final java.util.Set<org.intermine.model.bio.PublicationAnnotation> publicationAnnotations);
    public void addPublicationAnnotations(final org.intermine.model.bio.PublicationAnnotation arg);

    public java.util.Set<org.intermine.model.bio.Disease> getDiseases();
    public void setDiseases(final java.util.Set<org.intermine.model.bio.Disease> diseases);
    public void addDiseases(final org.intermine.model.bio.Disease arg);

    public java.util.Set<org.intermine.model.bio.GOAnnotation> getGoAnnotation();
    public void setGoAnnotation(final java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation);
    public void addGoAnnotation(final org.intermine.model.bio.GOAnnotation arg);

}
