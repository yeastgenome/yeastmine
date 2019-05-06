<%@ taglib tagdir="/WEB-INF/tags" prefix="im" %>

<table width="100%">
  <tr>
    <td valign="top" rowspan="2">
      <div class="heading2">
        Current data
      </div>
      <div class="body">

 <h4>
  <a href="javascript:toggleDiv('hiddenDiv1');">
    <img id='hiddenDiv1Toggle' src="images/disclosed.gif"/>
      Data from the S. cerevisiae database (SGD) ...
  </a>
 </h4>

<div id="hiddenDiv1" class="dataSetDescription">
          <p>
            All proteins from the <a
            href="http://www.ebi.uniprot.org/index.shtml" target="_new">UniProt
            Knowledgebase</a> for the following organisms have
            been loaded:</p>

          <ul>
              <li><i>D. melanogaster</i></li>
              <li><i>A. gambiae</i></li>
              <li><i>C. elegans</i></li>
              <li><i>H. sapiens</i></li>
              <li><i>M. musculus</i></li>
              <li><i>D. pseudoobscura</i></li>
              <li><i>S. cerevisiae</i></li>
          </ul>
          <p>
            For each protein record in UniProt for each species the following
            information is extracted and loaded into FlyMine:</p>
         <ul>
              <li>Entry name</li>
              <li>Primary accession number</li>
              <li>Secondary accession number</li>
              <li>Protein name</li>
              <li>Gene</li>
              <li>Comments</li>
              <li>Features</li>
              <li>Keywords (Ontology terms)</li>
              <li>Protein domain assignments from Interpro - see below</li>
              <li>Publications</li>
              <li>Sequence</li>
              <li>Components</li>
          </ul>

  </div>


<%--  // add later:
        <p>
          Search for a protein identifier: <tiles:insert name="browse.tile"/>
        </p>
--%>
      </div>
    </td>

    <td width="40%" valign="top">
      <div class="heading2">
        Bulk download <i>S. cerevisiae</i> data
      </div>
      <div class="body">
        <ul>
          <li>
              <im:querylink text="<i>S. cerevisiae</i> proteins and corresponding genes " skipBuilder="true">
<query name="" model="genomic" view="Protein.name Protein.primaryAccession Protein.primaryIdentifier Protein.genes.primaryIdentifier Protein.genes.secondaryIdentifier Protein.genes.symbol" sortOrder="Protein.name Protein.primaryAccession Protein.primaryIdentifier Protein.genes.primaryIdentifier Protein.genes.secondaryIdentifier Protein.genes.symbol">
  <node path="Protein" type="Protein">
  </node>
  <node path="Protein.organism" type="Organism">
  </node>
  <node path="Protein.organism.name" type="String">
    <constraint op="=" value="Saccharomyces cerevisiae" description="" identifier="" code="A">
    </constraint>
  </node>
</query>
           </im:querylink>
          </li>

        </ul>
      </div>
    </td>
  </tr>
</table>
