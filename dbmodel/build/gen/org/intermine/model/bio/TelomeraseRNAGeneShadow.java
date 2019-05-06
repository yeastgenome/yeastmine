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

public class TelomeraseRNAGeneShadow implements TelomeraseRNAGene, ShadowClass
{
    public static final Class<TelomeraseRNAGene> shadowOf = TelomeraseRNAGene.class;
    // Col: org.intermine.model.bio.NcRNAGene.nontranscribedregions
    protected java.util.Set<org.intermine.model.bio.NonTranscribedRegion> nontranscribedregions = new java.util.HashSet<org.intermine.model.bio.NonTranscribedRegion>();
    public java.util.Set<org.intermine.model.bio.NonTranscribedRegion> getNontranscribedregions() { return nontranscribedregions; }
    public void setNontranscribedregions(final java.util.Set<org.intermine.model.bio.NonTranscribedRegion> nontranscribedregions) { this.nontranscribedregions = nontranscribedregions; }
    public void addNontranscribedregions(final org.intermine.model.bio.NonTranscribedRegion arg) { nontranscribedregions.add(arg); }

    // Col: org.intermine.model.bio.NcRNAGene.noncodingexons
    protected java.util.Set<org.intermine.model.bio.NoncodingExon> noncodingexons = new java.util.HashSet<org.intermine.model.bio.NoncodingExon>();
    public java.util.Set<org.intermine.model.bio.NoncodingExon> getNoncodingexons() { return noncodingexons; }
    public void setNoncodingexons(final java.util.Set<org.intermine.model.bio.NoncodingExon> noncodingexons) { this.noncodingexons = noncodingexons; }
    public void addNoncodingexons(final org.intermine.model.bio.NoncodingExon arg) { noncodingexons.add(arg); }

    // Col: org.intermine.model.bio.NcRNAGene.externaltranscribedspacerregions
    protected java.util.Set<org.intermine.model.bio.ExternalTranscribedSpacerRegion> externaltranscribedspacerregions = new java.util.HashSet<org.intermine.model.bio.ExternalTranscribedSpacerRegion>();
    public java.util.Set<org.intermine.model.bio.ExternalTranscribedSpacerRegion> getExternaltranscribedspacerregions() { return externaltranscribedspacerregions; }
    public void setExternaltranscribedspacerregions(final java.util.Set<org.intermine.model.bio.ExternalTranscribedSpacerRegion> externaltranscribedspacerregions) { this.externaltranscribedspacerregions = externaltranscribedspacerregions; }
    public void addExternaltranscribedspacerregions(final org.intermine.model.bio.ExternalTranscribedSpacerRegion arg) { externaltranscribedspacerregions.add(arg); }

    // Col: org.intermine.model.bio.NcRNAGene.internaltranscribedspacerregions
    protected java.util.Set<org.intermine.model.bio.InternalTranscribedSpacerRegion> internaltranscribedspacerregions = new java.util.HashSet<org.intermine.model.bio.InternalTranscribedSpacerRegion>();
    public java.util.Set<org.intermine.model.bio.InternalTranscribedSpacerRegion> getInternaltranscribedspacerregions() { return internaltranscribedspacerregions; }
    public void setInternaltranscribedspacerregions(final java.util.Set<org.intermine.model.bio.InternalTranscribedSpacerRegion> internaltranscribedspacerregions) { this.internaltranscribedspacerregions = internaltranscribedspacerregions; }
    public void addInternaltranscribedspacerregions(final org.intermine.model.bio.InternalTranscribedSpacerRegion arg) { internaltranscribedspacerregions.add(arg); }

    // Attr: org.intermine.model.bio.SequenceFeature.briefDescription
    protected java.lang.String briefDescription;
    public java.lang.String getBriefDescription() { return briefDescription; }
    public void setBriefDescription(final java.lang.String briefDescription) { this.briefDescription = briefDescription; }

    // Attr: org.intermine.model.bio.SequenceFeature.score
    protected java.lang.Double score;
    public java.lang.Double getScore() { return score; }
    public void setScore(final java.lang.Double score) { this.score = score; }

    // Attr: org.intermine.model.bio.SequenceFeature.scoreType
    protected java.lang.String scoreType;
    public java.lang.String getScoreType() { return scoreType; }
    public void setScoreType(final java.lang.String scoreType) { this.scoreType = scoreType; }

    // Attr: org.intermine.model.bio.SequenceFeature.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.SequenceFeature.status
    protected java.lang.String status;
    public java.lang.String getStatus() { return status; }
    public void setStatus(final java.lang.String status) { this.status = status; }

    // Attr: org.intermine.model.bio.SequenceFeature.length
    protected java.lang.Integer length;
    public java.lang.Integer getLength() { return length; }
    public void setLength(final java.lang.Integer length) { this.length = length; }

    // Attr: org.intermine.model.bio.SequenceFeature.featureType
    protected java.lang.String featureType;
    public java.lang.String getFeatureType() { return featureType; }
    public void setFeatureType(final java.lang.String featureType) { this.featureType = featureType; }

    // Attr: org.intermine.model.bio.SequenceFeature.qualifier
    protected java.lang.String qualifier;
    public java.lang.String getQualifier() { return qualifier; }
    public void setQualifier(final java.lang.String qualifier) { this.qualifier = qualifier; }

    // Attr: org.intermine.model.bio.SequenceFeature.featAttribute
    protected java.lang.String featAttribute;
    public java.lang.String getFeatAttribute() { return featAttribute; }
    public void setFeatAttribute(final java.lang.String featAttribute) { this.featAttribute = featAttribute; }

    // Ref: org.intermine.model.bio.SequenceFeature.strain
    protected org.intermine.model.InterMineObject strain;
    public org.intermine.model.bio.Strain getStrain() { if (strain instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Strain) ((org.intermine.objectstore.proxy.ProxyReference) strain).getObject()); }; return (org.intermine.model.bio.Strain) strain; }
    public void setStrain(final org.intermine.model.bio.Strain strain) { this.strain = strain; }
    public void proxyStrain(final org.intermine.objectstore.proxy.ProxyReference strain) { this.strain = strain; }
    public org.intermine.model.InterMineObject proxGetStrain() { return strain; }

    // Ref: org.intermine.model.bio.SequenceFeature.sequenceOntologyTerm
    protected org.intermine.model.InterMineObject sequenceOntologyTerm;
    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm() { if (sequenceOntologyTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.SOTerm) ((org.intermine.objectstore.proxy.ProxyReference) sequenceOntologyTerm).getObject()); }; return (org.intermine.model.bio.SOTerm) sequenceOntologyTerm; }
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm) { this.sequenceOntologyTerm = sequenceOntologyTerm; }
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm) { this.sequenceOntologyTerm = sequenceOntologyTerm; }
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm() { return sequenceOntologyTerm; }

    // Ref: org.intermine.model.bio.SequenceFeature.chromosomeLocation
    protected org.intermine.model.InterMineObject chromosomeLocation;
    public org.intermine.model.bio.Location getChromosomeLocation() { if (chromosomeLocation instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Location) ((org.intermine.objectstore.proxy.ProxyReference) chromosomeLocation).getObject()); }; return (org.intermine.model.bio.Location) chromosomeLocation; }
    public void setChromosomeLocation(final org.intermine.model.bio.Location chromosomeLocation) { this.chromosomeLocation = chromosomeLocation; }
    public void proxyChromosomeLocation(final org.intermine.objectstore.proxy.ProxyReference chromosomeLocation) { this.chromosomeLocation = chromosomeLocation; }
    public org.intermine.model.InterMineObject proxGetChromosomeLocation() { return chromosomeLocation; }

    // Ref: org.intermine.model.bio.SequenceFeature.sequence
    protected org.intermine.model.InterMineObject sequence;
    public org.intermine.model.bio.Sequence getSequence() { if (sequence instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Sequence) ((org.intermine.objectstore.proxy.ProxyReference) sequence).getObject()); }; return (org.intermine.model.bio.Sequence) sequence; }
    public void setSequence(final org.intermine.model.bio.Sequence sequence) { this.sequence = sequence; }
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence) { this.sequence = sequence; }
    public org.intermine.model.InterMineObject proxGetSequence() { return sequence; }

    // Ref: org.intermine.model.bio.SequenceFeature.chromosome
    protected org.intermine.model.InterMineObject chromosome;
    public org.intermine.model.bio.Chromosome getChromosome() { if (chromosome instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Chromosome) ((org.intermine.objectstore.proxy.ProxyReference) chromosome).getObject()); }; return (org.intermine.model.bio.Chromosome) chromosome; }
    public void setChromosome(final org.intermine.model.bio.Chromosome chromosome) { this.chromosome = chromosome; }
    public void proxyChromosome(final org.intermine.objectstore.proxy.ProxyReference chromosome) { this.chromosome = chromosome; }
    public org.intermine.model.InterMineObject proxGetChromosome() { return chromosome; }

    // Col: org.intermine.model.bio.SequenceFeature.overlappingFeatures
    protected java.util.Set<org.intermine.model.bio.SequenceFeature> overlappingFeatures = new java.util.HashSet<org.intermine.model.bio.SequenceFeature>();
    public java.util.Set<org.intermine.model.bio.SequenceFeature> getOverlappingFeatures() { return overlappingFeatures; }
    public void setOverlappingFeatures(final java.util.Set<org.intermine.model.bio.SequenceFeature> overlappingFeatures) { this.overlappingFeatures = overlappingFeatures; }
    public void addOverlappingFeatures(final org.intermine.model.bio.SequenceFeature arg) { overlappingFeatures.add(arg); }

    // Col: org.intermine.model.bio.SequenceFeature.childFeatures
    protected java.util.Set<org.intermine.model.bio.SequenceFeature> childFeatures = new java.util.HashSet<org.intermine.model.bio.SequenceFeature>();
    public java.util.Set<org.intermine.model.bio.SequenceFeature> getChildFeatures() { return childFeatures; }
    public void setChildFeatures(final java.util.Set<org.intermine.model.bio.SequenceFeature> childFeatures) { this.childFeatures = childFeatures; }
    public void addChildFeatures(final org.intermine.model.bio.SequenceFeature arg) { childFeatures.add(arg); }

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

    // Attr: org.intermine.model.bio.Gene.geneSummary
    protected java.lang.String geneSummary;
    public java.lang.String getGeneSummary() { return geneSummary; }
    public void setGeneSummary(final java.lang.String geneSummary) { this.geneSummary = geneSummary; }

    // Attr: org.intermine.model.bio.Gene.phenotypeSummary
    protected java.lang.String phenotypeSummary;
    public java.lang.String getPhenotypeSummary() { return phenotypeSummary; }
    public void setPhenotypeSummary(final java.lang.String phenotypeSummary) { this.phenotypeSummary = phenotypeSummary; }

    // Attr: org.intermine.model.bio.Gene.functionSummary
    protected java.lang.String functionSummary;
    public java.lang.String getFunctionSummary() { return functionSummary; }
    public void setFunctionSummary(final java.lang.String functionSummary) { this.functionSummary = functionSummary; }

    // Attr: org.intermine.model.bio.Gene.cytoLocation
    protected java.lang.String cytoLocation;
    public java.lang.String getCytoLocation() { return cytoLocation; }
    public void setCytoLocation(final java.lang.String cytoLocation) { this.cytoLocation = cytoLocation; }

    // Ref: org.intermine.model.bio.Gene.upstreamIntergenicRegion
    protected org.intermine.model.InterMineObject upstreamIntergenicRegion;
    public org.intermine.model.bio.IntergenicRegion getUpstreamIntergenicRegion() { if (upstreamIntergenicRegion instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.IntergenicRegion) ((org.intermine.objectstore.proxy.ProxyReference) upstreamIntergenicRegion).getObject()); }; return (org.intermine.model.bio.IntergenicRegion) upstreamIntergenicRegion; }
    public void setUpstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion upstreamIntergenicRegion) { this.upstreamIntergenicRegion = upstreamIntergenicRegion; }
    public void proxyUpstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference upstreamIntergenicRegion) { this.upstreamIntergenicRegion = upstreamIntergenicRegion; }
    public org.intermine.model.InterMineObject proxGetUpstreamIntergenicRegion() { return upstreamIntergenicRegion; }

    // Ref: org.intermine.model.bio.Gene.downstreamIntergenicRegion
    protected org.intermine.model.InterMineObject downstreamIntergenicRegion;
    public org.intermine.model.bio.IntergenicRegion getDownstreamIntergenicRegion() { if (downstreamIntergenicRegion instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.IntergenicRegion) ((org.intermine.objectstore.proxy.ProxyReference) downstreamIntergenicRegion).getObject()); }; return (org.intermine.model.bio.IntergenicRegion) downstreamIntergenicRegion; }
    public void setDownstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion downstreamIntergenicRegion) { this.downstreamIntergenicRegion = downstreamIntergenicRegion; }
    public void proxyDownstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference downstreamIntergenicRegion) { this.downstreamIntergenicRegion = downstreamIntergenicRegion; }
    public org.intermine.model.InterMineObject proxGetDownstreamIntergenicRegion() { return downstreamIntergenicRegion; }

    // Ref: org.intermine.model.bio.Gene.plasmid
    protected org.intermine.model.InterMineObject plasmid;
    public org.intermine.model.bio.Plasmid getPlasmid() { if (plasmid instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Plasmid) ((org.intermine.objectstore.proxy.ProxyReference) plasmid).getObject()); }; return (org.intermine.model.bio.Plasmid) plasmid; }
    public void setPlasmid(final org.intermine.model.bio.Plasmid plasmid) { this.plasmid = plasmid; }
    public void proxyPlasmid(final org.intermine.objectstore.proxy.ProxyReference plasmid) { this.plasmid = plasmid; }
    public org.intermine.model.InterMineObject proxGetPlasmid() { return plasmid; }

    // Ref: org.intermine.model.bio.Gene.plasmidLocation
    protected org.intermine.model.InterMineObject plasmidLocation;
    public org.intermine.model.bio.Location getPlasmidLocation() { if (plasmidLocation instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Location) ((org.intermine.objectstore.proxy.ProxyReference) plasmidLocation).getObject()); }; return (org.intermine.model.bio.Location) plasmidLocation; }
    public void setPlasmidLocation(final org.intermine.model.bio.Location plasmidLocation) { this.plasmidLocation = plasmidLocation; }
    public void proxyPlasmidLocation(final org.intermine.objectstore.proxy.ProxyReference plasmidLocation) { this.plasmidLocation = plasmidLocation; }
    public org.intermine.model.InterMineObject proxGetPlasmidLocation() { return plasmidLocation; }

    // Ref: org.intermine.model.bio.Gene.regulationSummary
    protected org.intermine.model.InterMineObject regulationSummary;
    public org.intermine.model.bio.RegulationSummary getRegulationSummary() { if (regulationSummary instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.RegulationSummary) ((org.intermine.objectstore.proxy.ProxyReference) regulationSummary).getObject()); }; return (org.intermine.model.bio.RegulationSummary) regulationSummary; }
    public void setRegulationSummary(final org.intermine.model.bio.RegulationSummary regulationSummary) { this.regulationSummary = regulationSummary; }
    public void proxyRegulationSummary(final org.intermine.objectstore.proxy.ProxyReference regulationSummary) { this.regulationSummary = regulationSummary; }
    public org.intermine.model.InterMineObject proxGetRegulationSummary() { return regulationSummary; }

    // Col: org.intermine.model.bio.Gene.complements
    protected java.util.Set<org.intermine.model.bio.Complement> complements = new java.util.HashSet<org.intermine.model.bio.Complement>();
    public java.util.Set<org.intermine.model.bio.Complement> getComplements() { return complements; }
    public void setComplements(final java.util.Set<org.intermine.model.bio.Complement> complements) { this.complements = complements; }
    public void addComplements(final org.intermine.model.bio.Complement arg) { complements.add(arg); }

    // Col: org.intermine.model.bio.Gene.flankingRegions
    protected java.util.Set<org.intermine.model.bio.GeneFlankingRegion> flankingRegions = new java.util.HashSet<org.intermine.model.bio.GeneFlankingRegion>();
    public java.util.Set<org.intermine.model.bio.GeneFlankingRegion> getFlankingRegions() { return flankingRegions; }
    public void setFlankingRegions(final java.util.Set<org.intermine.model.bio.GeneFlankingRegion> flankingRegions) { this.flankingRegions = flankingRegions; }
    public void addFlankingRegions(final org.intermine.model.bio.GeneFlankingRegion arg) { flankingRegions.add(arg); }

    // Col: org.intermine.model.bio.Gene.introns
    protected java.util.Set<org.intermine.model.bio.Intron> introns = new java.util.HashSet<org.intermine.model.bio.Intron>();
    public java.util.Set<org.intermine.model.bio.Intron> getIntrons() { return introns; }
    public void setIntrons(final java.util.Set<org.intermine.model.bio.Intron> introns) { this.introns = introns; }
    public void addIntrons(final org.intermine.model.bio.Intron arg) { introns.add(arg); }

    // Col: org.intermine.model.bio.Gene.proteins
    protected java.util.Set<org.intermine.model.bio.Protein> proteins = new java.util.HashSet<org.intermine.model.bio.Protein>();
    public java.util.Set<org.intermine.model.bio.Protein> getProteins() { return proteins; }
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins) { this.proteins = proteins; }
    public void addProteins(final org.intermine.model.bio.Protein arg) { proteins.add(arg); }

    // Col: org.intermine.model.bio.Gene.diseaseAnnotation
    protected java.util.Set<org.intermine.model.bio.DiseaseAnnotation> diseaseAnnotation = new java.util.HashSet<org.intermine.model.bio.DiseaseAnnotation>();
    public java.util.Set<org.intermine.model.bio.DiseaseAnnotation> getDiseaseAnnotation() { return diseaseAnnotation; }
    public void setDiseaseAnnotation(final java.util.Set<org.intermine.model.bio.DiseaseAnnotation> diseaseAnnotation) { this.diseaseAnnotation = diseaseAnnotation; }
    public void addDiseaseAnnotation(final org.intermine.model.bio.DiseaseAnnotation arg) { diseaseAnnotation.add(arg); }

    // Col: org.intermine.model.bio.Gene.CDSs
    protected java.util.Set<org.intermine.model.bio.CDS> CDSs = new java.util.HashSet<org.intermine.model.bio.CDS>();
    public java.util.Set<org.intermine.model.bio.CDS> getcDSs() { return CDSs; }
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs) { this.CDSs = CDSs; }
    public void addcDSs(final org.intermine.model.bio.CDS arg) { CDSs.add(arg); }

    // Col: org.intermine.model.bio.Gene.homologues
    protected java.util.Set<org.intermine.model.bio.Homologue> homologues = new java.util.HashSet<org.intermine.model.bio.Homologue>();
    public java.util.Set<org.intermine.model.bio.Homologue> getHomologues() { return homologues; }
    public void setHomologues(final java.util.Set<org.intermine.model.bio.Homologue> homologues) { this.homologues = homologues; }
    public void addHomologues(final org.intermine.model.bio.Homologue arg) { homologues.add(arg); }

    // Col: org.intermine.model.bio.Gene.exons
    protected java.util.Set<org.intermine.model.bio.Exon> exons = new java.util.HashSet<org.intermine.model.bio.Exon>();
    public java.util.Set<org.intermine.model.bio.Exon> getExons() { return exons; }
    public void setExons(final java.util.Set<org.intermine.model.bio.Exon> exons) { this.exons = exons; }
    public void addExons(final org.intermine.model.bio.Exon arg) { exons.add(arg); }

    // Col: org.intermine.model.bio.Gene.pathways
    protected java.util.Set<org.intermine.model.bio.Pathway> pathways = new java.util.HashSet<org.intermine.model.bio.Pathway>();
    public java.util.Set<org.intermine.model.bio.Pathway> getPathways() { return pathways; }
    public void setPathways(final java.util.Set<org.intermine.model.bio.Pathway> pathways) { this.pathways = pathways; }
    public void addPathways(final org.intermine.model.bio.Pathway arg) { pathways.add(arg); }

    // Col: org.intermine.model.bio.Gene.UTRs
    protected java.util.Set<org.intermine.model.bio.UTR> UTRs = new java.util.HashSet<org.intermine.model.bio.UTR>();
    public java.util.Set<org.intermine.model.bio.UTR> getuTRs() { return UTRs; }
    public void setuTRs(final java.util.Set<org.intermine.model.bio.UTR> UTRs) { this.UTRs = UTRs; }
    public void adduTRs(final org.intermine.model.bio.UTR arg) { UTRs.add(arg); }

    // Col: org.intermine.model.bio.Gene.expressionScores
    protected java.util.Set<org.intermine.model.bio.ExpressionScore> expressionScores = new java.util.HashSet<org.intermine.model.bio.ExpressionScore>();
    public java.util.Set<org.intermine.model.bio.ExpressionScore> getExpressionScores() { return expressionScores; }
    public void setExpressionScores(final java.util.Set<org.intermine.model.bio.ExpressionScore> expressionScores) { this.expressionScores = expressionScores; }
    public void addExpressionScores(final org.intermine.model.bio.ExpressionScore arg) { expressionScores.add(arg); }

    // Col: org.intermine.model.bio.Gene.phenotypes
    protected java.util.Set<org.intermine.model.bio.Phenotype> phenotypes = new java.util.HashSet<org.intermine.model.bio.Phenotype>();
    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes() { return phenotypes; }
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes) { this.phenotypes = phenotypes; }
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg) { phenotypes.add(arg); }

    // Col: org.intermine.model.bio.Gene.transcripts
    protected java.util.Set<org.intermine.model.bio.Transcript> transcripts = new java.util.HashSet<org.intermine.model.bio.Transcript>();
    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts() { return transcripts; }
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts) { this.transcripts = transcripts; }
    public void addTranscripts(final org.intermine.model.bio.Transcript arg) { transcripts.add(arg); }

    // Col: org.intermine.model.bio.Gene.regulatoryRegions
    protected java.util.Set<org.intermine.model.bio.RegulatoryRegion> regulatoryRegions = new java.util.HashSet<org.intermine.model.bio.RegulatoryRegion>();
    public java.util.Set<org.intermine.model.bio.RegulatoryRegion> getRegulatoryRegions() { return regulatoryRegions; }
    public void setRegulatoryRegions(final java.util.Set<org.intermine.model.bio.RegulatoryRegion> regulatoryRegions) { this.regulatoryRegions = regulatoryRegions; }
    public void addRegulatoryRegions(final org.intermine.model.bio.RegulatoryRegion arg) { regulatoryRegions.add(arg); }

    // Col: org.intermine.model.bio.Gene.publicationAnnotations
    protected java.util.Set<org.intermine.model.bio.PublicationAnnotation> publicationAnnotations = new java.util.HashSet<org.intermine.model.bio.PublicationAnnotation>();
    public java.util.Set<org.intermine.model.bio.PublicationAnnotation> getPublicationAnnotations() { return publicationAnnotations; }
    public void setPublicationAnnotations(final java.util.Set<org.intermine.model.bio.PublicationAnnotation> publicationAnnotations) { this.publicationAnnotations = publicationAnnotations; }
    public void addPublicationAnnotations(final org.intermine.model.bio.PublicationAnnotation arg) { publicationAnnotations.add(arg); }

    // Col: org.intermine.model.bio.Gene.diseases
    protected java.util.Set<org.intermine.model.bio.Disease> diseases = new java.util.HashSet<org.intermine.model.bio.Disease>();
    public java.util.Set<org.intermine.model.bio.Disease> getDiseases() { return diseases; }
    public void setDiseases(final java.util.Set<org.intermine.model.bio.Disease> diseases) { this.diseases = diseases; }
    public void addDiseases(final org.intermine.model.bio.Disease arg) { diseases.add(arg); }

    // Col: org.intermine.model.bio.Gene.goAnnotation
    protected java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation = new java.util.HashSet<org.intermine.model.bio.GOAnnotation>();
    public java.util.Set<org.intermine.model.bio.GOAnnotation> getGoAnnotation() { return goAnnotation; }
    public void setGoAnnotation(final java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation) { this.goAnnotation = goAnnotation; }
    public void addGoAnnotation(final org.intermine.model.bio.GOAnnotation arg) { goAnnotation.add(arg); }

    @Override public boolean equals(Object o) { return (o instanceof TelomeraseRNAGene && id != null) ? id.equals(((TelomeraseRNAGene)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "TelomeraseRNAGene [briefDescription=" + (briefDescription == null ? "null" : "\"" + briefDescription + "\"") + ", chromosome=" + (chromosome == null ? "null" : (chromosome.getId() == null ? "no id" : chromosome.getId().toString())) + ", chromosomeLocation=" + (chromosomeLocation == null ? "null" : (chromosomeLocation.getId() == null ? "no id" : chromosomeLocation.getId().toString())) + ", cytoLocation=" + (cytoLocation == null ? "null" : "\"" + cytoLocation + "\"") + ", description=" + (description == null ? "null" : "\"" + description + "\"") + ", downstreamIntergenicRegion=" + (downstreamIntergenicRegion == null ? "null" : (downstreamIntergenicRegion.getId() == null ? "no id" : downstreamIntergenicRegion.getId().toString())) + ", featAttribute=" + (featAttribute == null ? "null" : "\"" + featAttribute + "\"") + ", featureType=" + (featureType == null ? "null" : "\"" + featureType + "\"") + ", functionSummary=" + (functionSummary == null ? "null" : "\"" + functionSummary + "\"") + ", geneSummary=" + (geneSummary == null ? "null" : "\"" + geneSummary + "\"") + ", id=" + id + ", length=" + length + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", phenotypeSummary=" + (phenotypeSummary == null ? "null" : "\"" + phenotypeSummary + "\"") + ", plasmid=" + (plasmid == null ? "null" : (plasmid.getId() == null ? "no id" : plasmid.getId().toString())) + ", plasmidLocation=" + (plasmidLocation == null ? "null" : (plasmidLocation.getId() == null ? "no id" : plasmidLocation.getId().toString())) + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + ", qualifier=" + (qualifier == null ? "null" : "\"" + qualifier + "\"") + ", regulationSummary=" + (regulationSummary == null ? "null" : (regulationSummary.getId() == null ? "no id" : regulationSummary.getId().toString())) + ", score=" + score + ", scoreType=" + (scoreType == null ? "null" : "\"" + scoreType + "\"") + ", secondaryIdentifier=" + (secondaryIdentifier == null ? "null" : "\"" + secondaryIdentifier + "\"") + ", sequence=" + (sequence == null ? "null" : (sequence.getId() == null ? "no id" : sequence.getId().toString())) + ", sequenceOntologyTerm=" + (sequenceOntologyTerm == null ? "null" : (sequenceOntologyTerm.getId() == null ? "no id" : sequenceOntologyTerm.getId().toString())) + ", sgdAlias=" + (sgdAlias == null ? "null" : "\"" + sgdAlias + "\"") + ", status=" + (status == null ? "null" : "\"" + status + "\"") + ", strain=" + (strain == null ? "null" : (strain.getId() == null ? "no id" : strain.getId().toString())) + ", symbol=" + (symbol == null ? "null" : "\"" + symbol + "\"") + ", upstreamIntergenicRegion=" + (upstreamIntergenicRegion == null ? "null" : (upstreamIntergenicRegion.getId() == null ? "no id" : upstreamIntergenicRegion.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("nontranscribedregions".equals(fieldName)) {
            return nontranscribedregions;
        }
        if ("noncodingexons".equals(fieldName)) {
            return noncodingexons;
        }
        if ("externaltranscribedspacerregions".equals(fieldName)) {
            return externaltranscribedspacerregions;
        }
        if ("internaltranscribedspacerregions".equals(fieldName)) {
            return internaltranscribedspacerregions;
        }
        if ("briefDescription".equals(fieldName)) {
            return briefDescription;
        }
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("scoreType".equals(fieldName)) {
            return scoreType;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("status".equals(fieldName)) {
            return status;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("featureType".equals(fieldName)) {
            return featureType;
        }
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("featAttribute".equals(fieldName)) {
            return featAttribute;
        }
        if ("strain".equals(fieldName)) {
            if (strain instanceof ProxyReference) {
                return ((ProxyReference) strain).getObject();
            } else {
                return strain;
            }
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            if (sequenceOntologyTerm instanceof ProxyReference) {
                return ((ProxyReference) sequenceOntologyTerm).getObject();
            } else {
                return sequenceOntologyTerm;
            }
        }
        if ("chromosomeLocation".equals(fieldName)) {
            if (chromosomeLocation instanceof ProxyReference) {
                return ((ProxyReference) chromosomeLocation).getObject();
            } else {
                return chromosomeLocation;
            }
        }
        if ("sequence".equals(fieldName)) {
            if (sequence instanceof ProxyReference) {
                return ((ProxyReference) sequence).getObject();
            } else {
                return sequence;
            }
        }
        if ("chromosome".equals(fieldName)) {
            if (chromosome instanceof ProxyReference) {
                return ((ProxyReference) chromosome).getObject();
            } else {
                return chromosome;
            }
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return overlappingFeatures;
        }
        if ("childFeatures".equals(fieldName)) {
            return childFeatures;
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
        if ("geneSummary".equals(fieldName)) {
            return geneSummary;
        }
        if ("phenotypeSummary".equals(fieldName)) {
            return phenotypeSummary;
        }
        if ("functionSummary".equals(fieldName)) {
            return functionSummary;
        }
        if ("cytoLocation".equals(fieldName)) {
            return cytoLocation;
        }
        if ("upstreamIntergenicRegion".equals(fieldName)) {
            if (upstreamIntergenicRegion instanceof ProxyReference) {
                return ((ProxyReference) upstreamIntergenicRegion).getObject();
            } else {
                return upstreamIntergenicRegion;
            }
        }
        if ("downstreamIntergenicRegion".equals(fieldName)) {
            if (downstreamIntergenicRegion instanceof ProxyReference) {
                return ((ProxyReference) downstreamIntergenicRegion).getObject();
            } else {
                return downstreamIntergenicRegion;
            }
        }
        if ("plasmid".equals(fieldName)) {
            if (plasmid instanceof ProxyReference) {
                return ((ProxyReference) plasmid).getObject();
            } else {
                return plasmid;
            }
        }
        if ("plasmidLocation".equals(fieldName)) {
            if (plasmidLocation instanceof ProxyReference) {
                return ((ProxyReference) plasmidLocation).getObject();
            } else {
                return plasmidLocation;
            }
        }
        if ("regulationSummary".equals(fieldName)) {
            if (regulationSummary instanceof ProxyReference) {
                return ((ProxyReference) regulationSummary).getObject();
            } else {
                return regulationSummary;
            }
        }
        if ("complements".equals(fieldName)) {
            return complements;
        }
        if ("flankingRegions".equals(fieldName)) {
            return flankingRegions;
        }
        if ("introns".equals(fieldName)) {
            return introns;
        }
        if ("proteins".equals(fieldName)) {
            return proteins;
        }
        if ("diseaseAnnotation".equals(fieldName)) {
            return diseaseAnnotation;
        }
        if ("CDSs".equals(fieldName)) {
            return CDSs;
        }
        if ("homologues".equals(fieldName)) {
            return homologues;
        }
        if ("exons".equals(fieldName)) {
            return exons;
        }
        if ("pathways".equals(fieldName)) {
            return pathways;
        }
        if ("UTRs".equals(fieldName)) {
            return UTRs;
        }
        if ("expressionScores".equals(fieldName)) {
            return expressionScores;
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("transcripts".equals(fieldName)) {
            return transcripts;
        }
        if ("regulatoryRegions".equals(fieldName)) {
            return regulatoryRegions;
        }
        if ("publicationAnnotations".equals(fieldName)) {
            return publicationAnnotations;
        }
        if ("diseases".equals(fieldName)) {
            return diseases;
        }
        if ("goAnnotation".equals(fieldName)) {
            return goAnnotation;
        }
        if (!org.intermine.model.bio.TelomeraseRNAGene.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("nontranscribedregions".equals(fieldName)) {
            return nontranscribedregions;
        }
        if ("noncodingexons".equals(fieldName)) {
            return noncodingexons;
        }
        if ("externaltranscribedspacerregions".equals(fieldName)) {
            return externaltranscribedspacerregions;
        }
        if ("internaltranscribedspacerregions".equals(fieldName)) {
            return internaltranscribedspacerregions;
        }
        if ("briefDescription".equals(fieldName)) {
            return briefDescription;
        }
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("scoreType".equals(fieldName)) {
            return scoreType;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("status".equals(fieldName)) {
            return status;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("featureType".equals(fieldName)) {
            return featureType;
        }
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("featAttribute".equals(fieldName)) {
            return featAttribute;
        }
        if ("strain".equals(fieldName)) {
            return strain;
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            return sequenceOntologyTerm;
        }
        if ("chromosomeLocation".equals(fieldName)) {
            return chromosomeLocation;
        }
        if ("sequence".equals(fieldName)) {
            return sequence;
        }
        if ("chromosome".equals(fieldName)) {
            return chromosome;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return overlappingFeatures;
        }
        if ("childFeatures".equals(fieldName)) {
            return childFeatures;
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
        if ("geneSummary".equals(fieldName)) {
            return geneSummary;
        }
        if ("phenotypeSummary".equals(fieldName)) {
            return phenotypeSummary;
        }
        if ("functionSummary".equals(fieldName)) {
            return functionSummary;
        }
        if ("cytoLocation".equals(fieldName)) {
            return cytoLocation;
        }
        if ("upstreamIntergenicRegion".equals(fieldName)) {
            return upstreamIntergenicRegion;
        }
        if ("downstreamIntergenicRegion".equals(fieldName)) {
            return downstreamIntergenicRegion;
        }
        if ("plasmid".equals(fieldName)) {
            return plasmid;
        }
        if ("plasmidLocation".equals(fieldName)) {
            return plasmidLocation;
        }
        if ("regulationSummary".equals(fieldName)) {
            return regulationSummary;
        }
        if ("complements".equals(fieldName)) {
            return complements;
        }
        if ("flankingRegions".equals(fieldName)) {
            return flankingRegions;
        }
        if ("introns".equals(fieldName)) {
            return introns;
        }
        if ("proteins".equals(fieldName)) {
            return proteins;
        }
        if ("diseaseAnnotation".equals(fieldName)) {
            return diseaseAnnotation;
        }
        if ("CDSs".equals(fieldName)) {
            return CDSs;
        }
        if ("homologues".equals(fieldName)) {
            return homologues;
        }
        if ("exons".equals(fieldName)) {
            return exons;
        }
        if ("pathways".equals(fieldName)) {
            return pathways;
        }
        if ("UTRs".equals(fieldName)) {
            return UTRs;
        }
        if ("expressionScores".equals(fieldName)) {
            return expressionScores;
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("transcripts".equals(fieldName)) {
            return transcripts;
        }
        if ("regulatoryRegions".equals(fieldName)) {
            return regulatoryRegions;
        }
        if ("publicationAnnotations".equals(fieldName)) {
            return publicationAnnotations;
        }
        if ("diseases".equals(fieldName)) {
            return diseases;
        }
        if ("goAnnotation".equals(fieldName)) {
            return goAnnotation;
        }
        if (!org.intermine.model.bio.TelomeraseRNAGene.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("nontranscribedregions".equals(fieldName)) {
            nontranscribedregions = (java.util.Set) value;
        } else if ("noncodingexons".equals(fieldName)) {
            noncodingexons = (java.util.Set) value;
        } else if ("externaltranscribedspacerregions".equals(fieldName)) {
            externaltranscribedspacerregions = (java.util.Set) value;
        } else if ("internaltranscribedspacerregions".equals(fieldName)) {
            internaltranscribedspacerregions = (java.util.Set) value;
        } else if ("briefDescription".equals(fieldName)) {
            briefDescription = (java.lang.String) value;
        } else if ("score".equals(fieldName)) {
            score = (java.lang.Double) value;
        } else if ("scoreType".equals(fieldName)) {
            scoreType = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("status".equals(fieldName)) {
            status = (java.lang.String) value;
        } else if ("length".equals(fieldName)) {
            length = (java.lang.Integer) value;
        } else if ("featureType".equals(fieldName)) {
            featureType = (java.lang.String) value;
        } else if ("qualifier".equals(fieldName)) {
            qualifier = (java.lang.String) value;
        } else if ("featAttribute".equals(fieldName)) {
            featAttribute = (java.lang.String) value;
        } else if ("strain".equals(fieldName)) {
            strain = (org.intermine.model.InterMineObject) value;
        } else if ("sequenceOntologyTerm".equals(fieldName)) {
            sequenceOntologyTerm = (org.intermine.model.InterMineObject) value;
        } else if ("chromosomeLocation".equals(fieldName)) {
            chromosomeLocation = (org.intermine.model.InterMineObject) value;
        } else if ("sequence".equals(fieldName)) {
            sequence = (org.intermine.model.InterMineObject) value;
        } else if ("chromosome".equals(fieldName)) {
            chromosome = (org.intermine.model.InterMineObject) value;
        } else if ("overlappingFeatures".equals(fieldName)) {
            overlappingFeatures = (java.util.Set) value;
        } else if ("childFeatures".equals(fieldName)) {
            childFeatures = (java.util.Set) value;
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
        } else if ("geneSummary".equals(fieldName)) {
            geneSummary = (java.lang.String) value;
        } else if ("phenotypeSummary".equals(fieldName)) {
            phenotypeSummary = (java.lang.String) value;
        } else if ("functionSummary".equals(fieldName)) {
            functionSummary = (java.lang.String) value;
        } else if ("cytoLocation".equals(fieldName)) {
            cytoLocation = (java.lang.String) value;
        } else if ("upstreamIntergenicRegion".equals(fieldName)) {
            upstreamIntergenicRegion = (org.intermine.model.InterMineObject) value;
        } else if ("downstreamIntergenicRegion".equals(fieldName)) {
            downstreamIntergenicRegion = (org.intermine.model.InterMineObject) value;
        } else if ("plasmid".equals(fieldName)) {
            plasmid = (org.intermine.model.InterMineObject) value;
        } else if ("plasmidLocation".equals(fieldName)) {
            plasmidLocation = (org.intermine.model.InterMineObject) value;
        } else if ("regulationSummary".equals(fieldName)) {
            regulationSummary = (org.intermine.model.InterMineObject) value;
        } else if ("complements".equals(fieldName)) {
            complements = (java.util.Set) value;
        } else if ("flankingRegions".equals(fieldName)) {
            flankingRegions = (java.util.Set) value;
        } else if ("introns".equals(fieldName)) {
            introns = (java.util.Set) value;
        } else if ("proteins".equals(fieldName)) {
            proteins = (java.util.Set) value;
        } else if ("diseaseAnnotation".equals(fieldName)) {
            diseaseAnnotation = (java.util.Set) value;
        } else if ("CDSs".equals(fieldName)) {
            CDSs = (java.util.Set) value;
        } else if ("homologues".equals(fieldName)) {
            homologues = (java.util.Set) value;
        } else if ("exons".equals(fieldName)) {
            exons = (java.util.Set) value;
        } else if ("pathways".equals(fieldName)) {
            pathways = (java.util.Set) value;
        } else if ("UTRs".equals(fieldName)) {
            UTRs = (java.util.Set) value;
        } else if ("expressionScores".equals(fieldName)) {
            expressionScores = (java.util.Set) value;
        } else if ("phenotypes".equals(fieldName)) {
            phenotypes = (java.util.Set) value;
        } else if ("transcripts".equals(fieldName)) {
            transcripts = (java.util.Set) value;
        } else if ("regulatoryRegions".equals(fieldName)) {
            regulatoryRegions = (java.util.Set) value;
        } else if ("publicationAnnotations".equals(fieldName)) {
            publicationAnnotations = (java.util.Set) value;
        } else if ("diseases".equals(fieldName)) {
            diseases = (java.util.Set) value;
        } else if ("goAnnotation".equals(fieldName)) {
            goAnnotation = (java.util.Set) value;
        } else {
            if (!org.intermine.model.bio.TelomeraseRNAGene.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("nontranscribedregions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("noncodingexons".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("externaltranscribedspacerregions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("internaltranscribedspacerregions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("briefDescription".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("score".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("scoreType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("status".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("length".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("featureType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("qualifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("featAttribute".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("strain".equals(fieldName)) {
            return org.intermine.model.bio.Strain.class;
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            return org.intermine.model.bio.SOTerm.class;
        }
        if ("chromosomeLocation".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("sequence".equals(fieldName)) {
            return org.intermine.model.bio.Sequence.class;
        }
        if ("chromosome".equals(fieldName)) {
            return org.intermine.model.bio.Chromosome.class;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("childFeatures".equals(fieldName)) {
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
        if ("geneSummary".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("phenotypeSummary".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("functionSummary".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("cytoLocation".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("upstreamIntergenicRegion".equals(fieldName)) {
            return org.intermine.model.bio.IntergenicRegion.class;
        }
        if ("downstreamIntergenicRegion".equals(fieldName)) {
            return org.intermine.model.bio.IntergenicRegion.class;
        }
        if ("plasmid".equals(fieldName)) {
            return org.intermine.model.bio.Plasmid.class;
        }
        if ("plasmidLocation".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("regulationSummary".equals(fieldName)) {
            return org.intermine.model.bio.RegulationSummary.class;
        }
        if ("complements".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("flankingRegions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("introns".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("proteins".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("diseaseAnnotation".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("CDSs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("homologues".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("exons".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("pathways".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("UTRs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("expressionScores".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("phenotypes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("transcripts".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("regulatoryRegions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publicationAnnotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("diseases".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("goAnnotation".equals(fieldName)) {
            return java.util.Set.class;
        }
        if (!org.intermine.model.bio.TelomeraseRNAGene.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.TelomeraseRNAGene.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.TelomeraseRNAGeneShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.TelomeraseRNAGene");
        if (briefDescription != null) {
            sb.append("$_^abriefDescription$_^");
            String string = briefDescription;
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
        if (score != null) {
            sb.append("$_^ascore$_^").append(score);
        }
        if (scoreType != null) {
            sb.append("$_^ascoreType$_^");
            String string = scoreType;
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
        if (description != null) {
            sb.append("$_^adescription$_^");
            String string = description;
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
        if (status != null) {
            sb.append("$_^astatus$_^");
            String string = status;
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
        if (length != null) {
            sb.append("$_^alength$_^").append(length);
        }
        if (featureType != null) {
            sb.append("$_^afeatureType$_^");
            String string = featureType;
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
        if (qualifier != null) {
            sb.append("$_^aqualifier$_^");
            String string = qualifier;
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
        if (featAttribute != null) {
            sb.append("$_^afeatAttribute$_^");
            String string = featAttribute;
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
        if (strain != null) {
            sb.append("$_^rstrain$_^").append(strain.getId());
        }
        if (sequenceOntologyTerm != null) {
            sb.append("$_^rsequenceOntologyTerm$_^").append(sequenceOntologyTerm.getId());
        }
        if (chromosomeLocation != null) {
            sb.append("$_^rchromosomeLocation$_^").append(chromosomeLocation.getId());
        }
        if (sequence != null) {
            sb.append("$_^rsequence$_^").append(sequence.getId());
        }
        if (chromosome != null) {
            sb.append("$_^rchromosome$_^").append(chromosome.getId());
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
        if (geneSummary != null) {
            sb.append("$_^ageneSummary$_^");
            String string = geneSummary;
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
        if (phenotypeSummary != null) {
            sb.append("$_^aphenotypeSummary$_^");
            String string = phenotypeSummary;
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
        if (functionSummary != null) {
            sb.append("$_^afunctionSummary$_^");
            String string = functionSummary;
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
        if (cytoLocation != null) {
            sb.append("$_^acytoLocation$_^");
            String string = cytoLocation;
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
        if (upstreamIntergenicRegion != null) {
            sb.append("$_^rupstreamIntergenicRegion$_^").append(upstreamIntergenicRegion.getId());
        }
        if (downstreamIntergenicRegion != null) {
            sb.append("$_^rdownstreamIntergenicRegion$_^").append(downstreamIntergenicRegion.getId());
        }
        if (plasmid != null) {
            sb.append("$_^rplasmid$_^").append(plasmid.getId());
        }
        if (plasmidLocation != null) {
            sb.append("$_^rplasmidLocation$_^").append(plasmidLocation.getId());
        }
        if (regulationSummary != null) {
            sb.append("$_^rregulationSummary$_^").append(regulationSummary.getId());
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.TelomeraseRNAGeneShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.TelomeraseRNAGene)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "abriefDescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                briefDescription = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ascore".equals(notXml[i])) {
                i++;
                score = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ascoreType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                scoreType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                description = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astatus".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                status = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alength".equals(notXml[i])) {
                i++;
                length = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "afeatureType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                featureType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aqualifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                qualifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afeatAttribute".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                featAttribute = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rstrain".equals(notXml[i])) {
                i++;
                strain = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Strain.class);
                i++;
            };
            if ((i < notXml.length) &&"rsequenceOntologyTerm".equals(notXml[i])) {
                i++;
                sequenceOntologyTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.SOTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rchromosomeLocation".equals(notXml[i])) {
                i++;
                chromosomeLocation = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Location.class);
                i++;
            };
            if ((i < notXml.length) &&"rsequence".equals(notXml[i])) {
                i++;
                sequence = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Sequence.class);
                i++;
            };
            if ((i < notXml.length) &&"rchromosome".equals(notXml[i])) {
                i++;
                chromosome = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Chromosome.class);
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
            if ((i < notXml.length) && "ageneSummary".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                geneSummary = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aphenotypeSummary".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                phenotypeSummary = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afunctionSummary".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                functionSummary = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acytoLocation".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                cytoLocation = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rupstreamIntergenicRegion".equals(notXml[i])) {
                i++;
                upstreamIntergenicRegion = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.IntergenicRegion.class);
                i++;
            };
            if ((i < notXml.length) &&"rdownstreamIntergenicRegion".equals(notXml[i])) {
                i++;
                downstreamIntergenicRegion = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.IntergenicRegion.class);
                i++;
            };
            if ((i < notXml.length) &&"rplasmid".equals(notXml[i])) {
                i++;
                plasmid = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Plasmid.class);
                i++;
            };
            if ((i < notXml.length) &&"rplasmidLocation".equals(notXml[i])) {
                i++;
                plasmidLocation = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Location.class);
                i++;
            };
            if ((i < notXml.length) &&"rregulationSummary".equals(notXml[i])) {
                i++;
                regulationSummary = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.RegulationSummary.class);
                i++;
            };
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        nontranscribedregions = new ProxyCollection<org.intermine.model.bio.NonTranscribedRegion>(os, this, "nontranscribedregions", org.intermine.model.bio.NonTranscribedRegion.class);
        noncodingexons = new ProxyCollection<org.intermine.model.bio.NoncodingExon>(os, this, "noncodingexons", org.intermine.model.bio.NoncodingExon.class);
        externaltranscribedspacerregions = new ProxyCollection<org.intermine.model.bio.ExternalTranscribedSpacerRegion>(os, this, "externaltranscribedspacerregions", org.intermine.model.bio.ExternalTranscribedSpacerRegion.class);
        internaltranscribedspacerregions = new ProxyCollection<org.intermine.model.bio.InternalTranscribedSpacerRegion>(os, this, "internaltranscribedspacerregions", org.intermine.model.bio.InternalTranscribedSpacerRegion.class);
        overlappingFeatures = new ProxyCollection<org.intermine.model.bio.SequenceFeature>(os, this, "overlappingFeatures", org.intermine.model.bio.SequenceFeature.class);
        childFeatures = new ProxyCollection<org.intermine.model.bio.SequenceFeature>(os, this, "childFeatures", org.intermine.model.bio.SequenceFeature.class);
        interactions = new ProxyCollection<org.intermine.model.bio.Interaction>(os, this, "interactions", org.intermine.model.bio.Interaction.class);
        locations = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locations", org.intermine.model.bio.Location.class);
        synonyms = new ProxyCollection<org.intermine.model.bio.Synonym>(os, this, "synonyms", org.intermine.model.bio.Synonym.class);
        crossReferences = new ProxyCollection<org.intermine.model.bio.CrossReference>(os, this, "crossReferences", org.intermine.model.bio.CrossReference.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        locatedFeatures = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locatedFeatures", org.intermine.model.bio.Location.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
        complements = new ProxyCollection<org.intermine.model.bio.Complement>(os, this, "complements", org.intermine.model.bio.Complement.class);
        flankingRegions = new ProxyCollection<org.intermine.model.bio.GeneFlankingRegion>(os, this, "flankingRegions", org.intermine.model.bio.GeneFlankingRegion.class);
        introns = new ProxyCollection<org.intermine.model.bio.Intron>(os, this, "introns", org.intermine.model.bio.Intron.class);
        proteins = new ProxyCollection<org.intermine.model.bio.Protein>(os, this, "proteins", org.intermine.model.bio.Protein.class);
        diseaseAnnotation = new ProxyCollection<org.intermine.model.bio.DiseaseAnnotation>(os, this, "diseaseAnnotation", org.intermine.model.bio.DiseaseAnnotation.class);
        CDSs = new ProxyCollection<org.intermine.model.bio.CDS>(os, this, "CDSs", org.intermine.model.bio.CDS.class);
        homologues = new ProxyCollection<org.intermine.model.bio.Homologue>(os, this, "homologues", org.intermine.model.bio.Homologue.class);
        exons = new ProxyCollection<org.intermine.model.bio.Exon>(os, this, "exons", org.intermine.model.bio.Exon.class);
        pathways = new ProxyCollection<org.intermine.model.bio.Pathway>(os, this, "pathways", org.intermine.model.bio.Pathway.class);
        UTRs = new ProxyCollection<org.intermine.model.bio.UTR>(os, this, "UTRs", org.intermine.model.bio.UTR.class);
        expressionScores = new ProxyCollection<org.intermine.model.bio.ExpressionScore>(os, this, "expressionScores", org.intermine.model.bio.ExpressionScore.class);
        phenotypes = new ProxyCollection<org.intermine.model.bio.Phenotype>(os, this, "phenotypes", org.intermine.model.bio.Phenotype.class);
        transcripts = new ProxyCollection<org.intermine.model.bio.Transcript>(os, this, "transcripts", org.intermine.model.bio.Transcript.class);
        regulatoryRegions = new ProxyCollection<org.intermine.model.bio.RegulatoryRegion>(os, this, "regulatoryRegions", org.intermine.model.bio.RegulatoryRegion.class);
        publicationAnnotations = new ProxyCollection<org.intermine.model.bio.PublicationAnnotation>(os, this, "publicationAnnotations", org.intermine.model.bio.PublicationAnnotation.class);
        diseases = new ProxyCollection<org.intermine.model.bio.Disease>(os, this, "diseases", org.intermine.model.bio.Disease.class);
        goAnnotation = new ProxyCollection<org.intermine.model.bio.GOAnnotation>(os, this, "goAnnotation", org.intermine.model.bio.GOAnnotation.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("nontranscribedregions".equals(fieldName)) {
            nontranscribedregions.add((org.intermine.model.bio.NonTranscribedRegion) element);
        } else if ("noncodingexons".equals(fieldName)) {
            noncodingexons.add((org.intermine.model.bio.NoncodingExon) element);
        } else if ("externaltranscribedspacerregions".equals(fieldName)) {
            externaltranscribedspacerregions.add((org.intermine.model.bio.ExternalTranscribedSpacerRegion) element);
        } else if ("internaltranscribedspacerregions".equals(fieldName)) {
            internaltranscribedspacerregions.add((org.intermine.model.bio.InternalTranscribedSpacerRegion) element);
        } else if ("overlappingFeatures".equals(fieldName)) {
            overlappingFeatures.add((org.intermine.model.bio.SequenceFeature) element);
        } else if ("childFeatures".equals(fieldName)) {
            childFeatures.add((org.intermine.model.bio.SequenceFeature) element);
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
        } else if ("complements".equals(fieldName)) {
            complements.add((org.intermine.model.bio.Complement) element);
        } else if ("flankingRegions".equals(fieldName)) {
            flankingRegions.add((org.intermine.model.bio.GeneFlankingRegion) element);
        } else if ("introns".equals(fieldName)) {
            introns.add((org.intermine.model.bio.Intron) element);
        } else if ("proteins".equals(fieldName)) {
            proteins.add((org.intermine.model.bio.Protein) element);
        } else if ("diseaseAnnotation".equals(fieldName)) {
            diseaseAnnotation.add((org.intermine.model.bio.DiseaseAnnotation) element);
        } else if ("CDSs".equals(fieldName)) {
            CDSs.add((org.intermine.model.bio.CDS) element);
        } else if ("homologues".equals(fieldName)) {
            homologues.add((org.intermine.model.bio.Homologue) element);
        } else if ("exons".equals(fieldName)) {
            exons.add((org.intermine.model.bio.Exon) element);
        } else if ("pathways".equals(fieldName)) {
            pathways.add((org.intermine.model.bio.Pathway) element);
        } else if ("UTRs".equals(fieldName)) {
            UTRs.add((org.intermine.model.bio.UTR) element);
        } else if ("expressionScores".equals(fieldName)) {
            expressionScores.add((org.intermine.model.bio.ExpressionScore) element);
        } else if ("phenotypes".equals(fieldName)) {
            phenotypes.add((org.intermine.model.bio.Phenotype) element);
        } else if ("transcripts".equals(fieldName)) {
            transcripts.add((org.intermine.model.bio.Transcript) element);
        } else if ("regulatoryRegions".equals(fieldName)) {
            regulatoryRegions.add((org.intermine.model.bio.RegulatoryRegion) element);
        } else if ("publicationAnnotations".equals(fieldName)) {
            publicationAnnotations.add((org.intermine.model.bio.PublicationAnnotation) element);
        } else if ("diseases".equals(fieldName)) {
            diseases.add((org.intermine.model.bio.Disease) element);
        } else if ("goAnnotation".equals(fieldName)) {
            goAnnotation.add((org.intermine.model.bio.GOAnnotation) element);
        } else {
            if (!org.intermine.model.bio.TelomeraseRNAGene.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("nontranscribedregions".equals(fieldName)) {
            return org.intermine.model.bio.NonTranscribedRegion.class;
        }
        if ("noncodingexons".equals(fieldName)) {
            return org.intermine.model.bio.NoncodingExon.class;
        }
        if ("externaltranscribedspacerregions".equals(fieldName)) {
            return org.intermine.model.bio.ExternalTranscribedSpacerRegion.class;
        }
        if ("internaltranscribedspacerregions".equals(fieldName)) {
            return org.intermine.model.bio.InternalTranscribedSpacerRegion.class;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return org.intermine.model.bio.SequenceFeature.class;
        }
        if ("childFeatures".equals(fieldName)) {
            return org.intermine.model.bio.SequenceFeature.class;
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
        if ("complements".equals(fieldName)) {
            return org.intermine.model.bio.Complement.class;
        }
        if ("flankingRegions".equals(fieldName)) {
            return org.intermine.model.bio.GeneFlankingRegion.class;
        }
        if ("introns".equals(fieldName)) {
            return org.intermine.model.bio.Intron.class;
        }
        if ("proteins".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if ("diseaseAnnotation".equals(fieldName)) {
            return org.intermine.model.bio.DiseaseAnnotation.class;
        }
        if ("CDSs".equals(fieldName)) {
            return org.intermine.model.bio.CDS.class;
        }
        if ("homologues".equals(fieldName)) {
            return org.intermine.model.bio.Homologue.class;
        }
        if ("exons".equals(fieldName)) {
            return org.intermine.model.bio.Exon.class;
        }
        if ("pathways".equals(fieldName)) {
            return org.intermine.model.bio.Pathway.class;
        }
        if ("UTRs".equals(fieldName)) {
            return org.intermine.model.bio.UTR.class;
        }
        if ("expressionScores".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionScore.class;
        }
        if ("phenotypes".equals(fieldName)) {
            return org.intermine.model.bio.Phenotype.class;
        }
        if ("transcripts".equals(fieldName)) {
            return org.intermine.model.bio.Transcript.class;
        }
        if ("regulatoryRegions".equals(fieldName)) {
            return org.intermine.model.bio.RegulatoryRegion.class;
        }
        if ("publicationAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.PublicationAnnotation.class;
        }
        if ("diseases".equals(fieldName)) {
            return org.intermine.model.bio.Disease.class;
        }
        if ("goAnnotation".equals(fieldName)) {
            return org.intermine.model.bio.GOAnnotation.class;
        }
        if (!org.intermine.model.bio.TelomeraseRNAGene.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.TelomeraseRNAGene.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
